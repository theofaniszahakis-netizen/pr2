package de.bht.pr2.lab03.part4;

public class Buecher {
   String title;
    String book_type;
    double price;
    int edition;

   public Buecher(String title, String book_type, double price, int edition) {
        this.title = title;
        this.book_type = book_type;
        this.price = price;
        this.edition = edition;
    }
    // Formate:
    // Buch:     Titel ; Typ des Buches ; Preis ; Auflage
    // Ebuch:    Titel ; Typ des Buches ; Preis ; Auflage ; Tolino-Version
    // Hoerbuch: Titel ; Typ des Buches ; Preis ; Auflage ; Abspielmodus

}
