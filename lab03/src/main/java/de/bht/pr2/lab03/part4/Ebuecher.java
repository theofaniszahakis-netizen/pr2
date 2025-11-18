package de.bht.pr2.lab03.part4;

public class Ebuecher extends Buecher {
    int tolion_version;
    Ebuecher(String title, String book_type, double price, int edition, int tolion_version) {
        super(title, book_type, price, edition);
        this.tolion_version = tolion_version;
    }
}
