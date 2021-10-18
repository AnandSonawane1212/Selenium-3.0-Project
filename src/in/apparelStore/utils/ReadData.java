package in.apparelStore.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;

public class ReadData {
		public List<String[]> readCSVData(String filename) throws IOException {
		FileReader file = new FileReader(filename);
		BufferedReader br = new BufferedReader(file);
		String line = "";
		String splitBy = ",";
		
		List<String[]> list = new ArrayList<>();
		
		while((line = br.readLine()) != null) {
			String[] details = line.split(splitBy);
			list.add(details);
		}
		return list;
		
	}
}

