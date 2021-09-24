package com.bridgelabz.indianstatecensus;

import org.junit.jupiter.api.Test;
import org.junit.rules.ExpectedException;
import java.io.IOException;
import static org.junit.jupiter.api.Assertions.*;

class StateCensusAnalyserTest {
    String filePath = "IndianStateCensus.csv";
    String wrongCsvFilePath = "IndianStateCensusWrongPath.csv";
    String wrongCsvFileType = "IndianStateCensusWrongFileType.txt";

    @Test
    public void givenIndianStateCensusCsvFile_shouldReturn_correctNoOfRecords() {
        try {
            StateCensusAnalyser stateCensusAnalyser = new StateCensusAnalyser();
            int result = stateCensusAnalyser.numberOfRecords(filePath);
            assertEquals(29, result);
        } catch (StateCensusAnalyserException | IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenIndianStateCensusWrongCsvFilePath_shouldThrowException() throws IOException {
        StateCensusAnalyser stateCensusAnalyser = new StateCensusAnalyser();
        try {
            ExpectedException exceptionRule = ExpectedException.none();
            exceptionRule.expect(StateCensusAnalyserException.class);
            stateCensusAnalyser.numberOfRecords(wrongCsvFilePath);
        } catch (StateCensusAnalyserException e) {
            assertEquals(StateCensusAnalyserException.ExceptionType.WRONG_CSV_FILE_PATH, e.type);
        }
    }

    @Test
    public void givenIndianStateCensusTxtFile_shouldThrowException() throws IOException {
        StateCensusAnalyser stateCensusAnalyser = new StateCensusAnalyser();
        try {
            ExpectedException exceptionRule = ExpectedException.none();
            exceptionRule.expect(StateCensusAnalyserException.class);
            stateCensusAnalyser.numberOfRecords(wrongCsvFileType);
        }catch (StateCensusAnalyserException e){
            assertEquals(StateCensusAnalyserException.ExceptionType.WRONG_FILE_TYPE,e.type);
        }
    }
}