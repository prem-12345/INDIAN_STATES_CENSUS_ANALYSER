package com.bridgelabz.indianstatecensus;

public class StateCensusAnalyserException extends Exception {
    ExceptionType type;

    enum ExceptionType {
        WRONG_CSV_FILE_PATH, WRONG_FILE_TYPE, WRONG_HEADER
    }
}
