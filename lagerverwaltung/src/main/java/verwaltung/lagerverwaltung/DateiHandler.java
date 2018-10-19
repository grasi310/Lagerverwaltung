package verwaltung.lagerverwaltung;

import java.io.File;
import java.io.FileNotFoundException;
Import java.util.Scanner;

public class DateiHandler
{
   Scanner scan;

   DateiHandler(File f)
   {
       try {
           scan = new Scanner(f);
       }catch (FileNotFoundException e) {
           e.printStackTrace();
       }

   }

   public Produkt lesen()
   {
       if(scan.hasNext()){
           String name = scan.next();
           String kategorie = scan.next();
           int produktID = scan.nextInt();
            return new Produkt(name, kategorie, produktID);
       }
       return null;
   }

   public void schliessen()
   {
       scan.close();
   }
}
