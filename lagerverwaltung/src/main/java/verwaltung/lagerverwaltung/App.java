package verwaltung.lagerverwaltung;
import java.io.File;

public class App 
{
    public static void main( String[] args )
    {
        File f = new File("D:\IT-Kolleg\POS DOBL\Lagerverwaltung_Grassmayr\Lagerverwaltung\lagerverwaltung\src\main\java\verwaltung\lagerverwaltung\sampleProdukt.txt")
        DateiHandler dh = new DateiHandler(f);
        Produkt produkt = dh.lesen();
        System.out.println(m.toString());
        dh.schliessen();
    }

}
