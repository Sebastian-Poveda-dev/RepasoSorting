package model;

public class Computer implements Comparable<Computer> {

 private String brand;
 private int ram;
 private int processors;
 private double processingSpeed;
 private char operatingSystem;

    public Computer(String brand, int ram, int processors, double processingSpeed, char operatingSystem) {
        this.brand = brand;
        this.ram = ram;
        this.processors = processors;
        this.processingSpeed = processingSpeed;
        this.operatingSystem = operatingSystem;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getProcessors() {
        return processors;
    }

    public void setProcessors(int processors) {
        this.processors = processors;
    }

    public double getProcessingSpeed() {
        return processingSpeed;
    }

    public void setProcessingSpeed(double processingSpeed) {
        this.processingSpeed = processingSpeed;
    }

    public char getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(char operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    @Override
    public int compareTo(Computer oc) {

        if(this.brand.compareTo(oc.brand)>0) {
            return 1;
        }

        if(this.brand.compareTo(oc.brand)<0) {
            return -1;
        }
        return 0;
    }


}
