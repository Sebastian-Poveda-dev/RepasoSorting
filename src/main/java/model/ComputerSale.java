package model;

import java.util.ArrayList;

public class ComputerSale {

    private ArrayList<Computer> computers = new ArrayList<>();

    public ComputerSale() {
    }

    public ComputerSale(ArrayList<Computer> computers) {
        this.computers = computers;
    }

    public ArrayList<Computer> getComputers() {
        return computers;
    }

    public void setComputers(ArrayList<Computer> computers) {
        this.computers = computers;
    }

    public void sortByBrand() {
        for (int i = 1; i < computers.size(); i++) {
            Computer temporal = this.computers.get(i);
            int temp = computers.indexOf(temporal);

            int j = i - 1;


            while (j >= 0 && computers.get(j).compareTo(temporal) > 0) {

                computers.set(j +1, computers.get(j));
                j--;

            }
            computers.set(j + 1, temporal);
        }
    }

    public void sortByProcessing() {

    }

    public void sortByBrandAndOS() {

    }

    public void sortByRam() {

    }

    public void sortByBrandReverse() {

    }

    public void generateRamdomComputers() {
        Computer c1 = new Computer("Dell", 8, 4, 3.2, 'W');
        Computer c2 = new Computer("HP", 16, 6, 3.8, 'L');
        Computer c3 = new Computer("Apple", 32, 8, 4.0, 'M');
        Computer c4 = new Computer("Asus", 16, 4, 3.5, 'W');
        Computer c5 = new Computer("Lenovo", 8, 2, 2.8, 'L');
        Computer c6 = new Computer("Acer", 12, 6, 3.6, 'W');
        Computer c7 = new Computer("MSI", 32, 8, 4.5, 'W');
        Computer c8 = new Computer("Samsung", 16, 4, 3.3, 'L');
        Computer c9 = new Computer("Toshiba", 8, 2, 2.5, 'W');
        Computer c10 = new Computer("Dell", 16, 6, 3.7, 'L');
        Computer c11 = new Computer("HP", 12, 4, 3.4, 'W');
        Computer c12 = new Computer("Apple", 64, 10, 5.0, 'M');
        Computer c13 = new Computer("Asus", 32, 6, 4.2, 'L');
        Computer c14 = new Computer("Lenovo", 16, 4, 3.1, 'W');
        Computer c15 = new Computer("Acer", 8, 2, 2.9, 'L');
        Computer c16 = new Computer("MSI", 24, 6, 3.9, 'W');
        Computer c17 = new Computer("Samsung", 12, 4, 3.2, 'W');
        Computer c18 = new Computer("Toshiba", 16, 6, 3.5, 'L');
        Computer c19 = new Computer("Dell", 8, 4, 3.0, 'W');
        Computer c20 = new Computer("HP", 32, 8, 4.3, 'L');

        computers.add(c1);
        computers.add(c2);
        computers.add(c3);
        computers.add(c4);
        computers.add(c5);
        computers.add(c6);
        computers.add(c7);
        computers.add(c8);
        computers.add(c9);
        computers.add(c10);
        computers.add(c11);
        computers.add(c12);
        computers.add(c13);
        computers.add(c14);
        computers.add(c15);
        computers.add(c16);
        computers.add(c17);
        computers.add(c18);
        computers.add(c19);
        computers.add(c20);

    }
}
