package verwaltung.lagerverwaltung;

import java.util.*;

public class Bestellung implements IBestellung
{

    public App() {
    }

    int bestellID, kundenID, mitarbeiterID;

    Date fixTermin = new Date();
    Date bestellDatum = new Date();

    public Date getBestelldatum() {
        return bestelldatum;
    }

    public Date getFixTermin() {
        return fixTermin;
    }

    public int getBestellID() {
        return bestellID;
    }

    public int getKundenID() {

        return kundenID;
    }

    public int getMitarbeiterID() {
        return mitarbeiterID;
    }

    public void setBestellDatum(Date bestellDatum)
    {
        this.bestellDatum = bestellDatum;
    }

    public void setFixTermin(Date fixTermin)
    {
        this.fixTermin = fixTermin;
    }

    public void setBestellID(int bestellID) {
        this.bestellID = bestellID;
    }

    public void setKundenID(int kundenID) {
        this.kundenID = kundenID;
    }

    public void setMitarbeiterID(int mitarbeiterID) {
        this.mitarbeiterID = mitarbeiterID;
    }
}
