package com.bridgelabz.indianstatecensus;

import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;


public class StateCensusAnalyser {
    String filePath;

    public void loadStateCensusCsvData() {
        try {
            FileReader fileReader = new FileReader(filePath);
            CSVReader csvReader = new CSVReaderBuilder(fileReader)
                    .build();
            List<String[]> allData = csvReader.readAll();
            for (String[] row : allData) {
                for (String cell : row) {
                    System.out.print(cell + "\t");
                }
                System.out.println();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public int numberOfRecords(String filePath) throws StateCensusAnalyserException, IOException {
        FileReader fileReader = new FileReader(filePath);
        CSVReader csvReader = new CSVReaderBuilder(fileReader)
                .withSkipLines(1)
                .build();
        List<String[]> allData = csvReader.readAll();
        int numberOfRecords;
        numberOfRecords = allData.size();
        return numberOfRecords;
    }
}
