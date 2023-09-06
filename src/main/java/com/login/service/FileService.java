package com.login.service;

import org.springframework.web.multipart.MultipartFile;

public interface FileService {

	boolean hasCsvFormat(MultipartFile file);

//	void processAndSaveData(MultipartFile file);

	void processAndSaveData(MultipartFile file, String accountNo, String bankName);

}

