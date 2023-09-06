package com.login.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.login.entity.User;
import com.login.repository.UserRepository;

@Service
public class FileServiceImpl implements FileService {

	@Autowired
	private UserRepository repository;

	@Override
	public boolean hasCsvFormat(MultipartFile file) {
		// TODO Auto-generated method stub
		String type = "text/csv";
		if (!type.equals(file.getContentType())) {
			return false;
		}
		return true;
	}

	@Override
	public void processAndSaveData(MultipartFile file, String accountNo, String bankName) {
		// TODO Auto-generated method stub
		try {
			List<User> users = csvToUsers(file.getInputStream(), accountNo, bankName);
			repository.saveAll(users);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private List<User> csvToUsers(InputStream inputStream, String accountNo, String bankName) {
		try (BufferedReader filereReader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));
				CSVParser csvParser = new CSVParser(filereReader,
						CSVFormat.DEFAULT.withFirstRecordAsHeader().withIgnoreHeaderCase().withTrim());) {
			List<User> users = new ArrayList<User>();
			List<CSVRecord> records = csvParser.getRecords();
			for (CSVRecord csvRecord : records) {
				User user = new User();
				user.setAccountNo(accountNo);
				user.setBankName(bankName);

				user.setCheque(csvRecord.get("Chq/Ref Number"));
				user.setNaration(csvRecord.get("Narration"));
				user.setValuedate(csvRecord.get("Value Date"));
				user.setDebitamount(csvRecord.get("Debit Amount"));
				users.add(user);

			}
			return users;

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
