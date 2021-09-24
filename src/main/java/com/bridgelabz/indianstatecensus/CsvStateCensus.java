package com.bridgelabz.indianstatecensus;

public class CsvStateCensus {

    private String state;
    private int population;
    private int areaInSqkm;
    private int densityPerSqkm;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getAreaInSqkm() {
        return areaInSqkm;
    }

    public void setAreaInSqkm(int areaInSqkm) {
        this.areaInSqkm = areaInSqkm;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public int getDensityPerSqkm() {
        return densityPerSqkm;
    }

    public void setDensityPerSqkm(int densityPerSqkm) {
        this.densityPerSqkm = densityPerSqkm;
    }

    @Override
    public String toString() {
        return "CsvStateCensus{" +
                "state='" + state + '\'' +
                ", population=" + population +
                ", areaInSqkm=" + areaInSqkm +
                ", densityPerSqkm=" + densityPerSqkm +
                '}';
    }
}
