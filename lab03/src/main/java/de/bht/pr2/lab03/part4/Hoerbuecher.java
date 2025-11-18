package de.bht.pr2.lab03.part4;

public class Hoerbuecher extends Buecher {
   String abspielmodus;

    Hoerbuecher(String title, String book_type, double price, int edition, String abspielmodus) {
        super(title,book_type,price,edition);
        this.abspielmodus = abspielmodus;

    }


}
