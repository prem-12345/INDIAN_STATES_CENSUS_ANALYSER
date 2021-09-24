package com.bridgelabz.indianstatecensus;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StateCensusAnalyserTest {
    String filePath = "IndianStateCensus.csv";

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

}