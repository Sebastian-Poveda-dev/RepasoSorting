package ui;

import model.Computer;
import model.ComputerSale;

public class Main {

    ComputerSale controller = new ComputerSale();

    public static void main(String[] args) {
        Main m = new Main();

        m.generateComputers();
        m.sortComputers();
        m.printArray();
    }

    public void generateComputers() {
        controller.generateRamdomComputers();
    }

    public void sortComputers() {
        controller.sortByBrand();
    }

    public void printArray() {
        for (Computer c : controller.getComputers()) {
            System.out.print(c.getBrand() + " ,");
        }
    }
}
