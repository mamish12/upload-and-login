package com.login.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.login.response.ResponseMessage;
import com.login.service.FileService;

@RestController
@RequestMapping("/files")
public class FileController {

	@Autowired
	private FileService service;

	@PostMapping("/upload")
	public ResponseEntity<ResponseMessage> uploadFile(@RequestParam("file") MultipartFile file,
			@RequestParam("accountNo") String accountNo, @RequestParam("bankName") String bankName) {
		if (service.hasCsvFormat(file)) {
			service.processAndSaveData(file, accountNo, bankName);
			return ResponseEntity.status(HttpStatus.OK)
					.body(new ResponseMessage("Uploaded the file successfully:" + file.getOriginalFilename()));

		}
		return ResponseEntity.status(HttpStatus.EXPECTATION_FAILED).body(new ResponseMessage("please upload csv file"));

	}

}
