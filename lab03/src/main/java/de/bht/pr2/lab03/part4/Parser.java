package de.bht.pr2.lab03.part4;

import de.bht.pr2.lab03.store.BookStore;

import java.util.ArrayList;
import java.util.List;



    public class Parser {


        public void parse() {
        List<String> solddBooksData = BookStore.getSoldBooks();
            List<Buecher> list= new ArrayList<Buecher>();

for(String x :solddBooksData)

        {
            String[] data = x.split(";");

            String title = data[0];//hat jetzt das an der ersten stelle also den titel
            String typ = data[1];//preis des buches
            double preis = Double.parseDouble(data[2]);//den string in eine zahl#
            int auflage = Integer.parseInt(data[3]);

            if (typ.equals("Ebuch")) {
                int tolinoversion = Integer.parseInt(data[4]);
                Ebuecher ebuch =new Ebuecher(title,typ,preis,auflage,tolinoversion);
                list.add(ebuch);
            } else if (typ.equals("Hoerbuch")) {
                String abspielmodus = data[4];
                Hoerbuecher hoerbuch =new Hoerbuecher(title,typ,preis,auflage,abspielmodus);
                list.add(hoerbuch);
            }else{
                Buecher buch =new Buecher(title,typ,preis,auflage);
                list.add(buch);//S


            }

        }


            }
    }
// Formate:
// Buch:     Titel ; Typ des Buches ; Preis ; Auflage
// Ebuch:    Titel ; Typ des Buches ; Preis ; Auflage ; Tolino-Version
// Hoerbuch: Titel ; Typ des Buches ; Preis ; Auflage ; Abspielmodus


