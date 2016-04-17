package com.spade9.income.sftp;

import java.io.IOException;

import com.utils.CsvWriter;

public class CSV {
	public static void main(String[] args) throws IOException {
		// csv 写入
		
		String fullPathName = "csvtest.csv";
		CsvWriter csvWriter = new CsvWriter(fullPathName);

		
		
		for (int i = 0; i < 100; i++) {
			String[] emtpyLines = new String[]{"ACCOUNT_OPENING_DATE","LICENCEE_ID","BTAG","PLAYER_ID","USERNAME","PLAYER_COUNTRY"};
			csvWriter.writeRecord(emtpyLines);
		}
		
		
		csvWriter.endRecord();
		csvWriter.close();
	}
}
