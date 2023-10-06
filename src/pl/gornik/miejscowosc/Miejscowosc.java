package pl.gornik.miejscowosc;

public class Miejscowosc {
    public String nazwa;
    public String gmina;
    public int liczbaLudnosci;
    public double powierzchnia;
    public double procentNieuzytkow;

    public Miejscowosc(String nazwa, String gmina, int liczbaLudnosci, double powierzchnia, double procentNieuzytkow) {
        this.nazwa = nazwa;
        this.gmina = gmina;
        this.liczbaLudnosci = liczbaLudnosci;
        this.powierzchnia = powierzchnia;
        this.procentNieuzytkow = procentNieuzytkow;
    }
    //obliczenie sredniego zaludnienia na km^2
    public double obliczenieSredniegoZaludnienia(int liczbaLudnosci,double powierzchnia) {
        return (double) Math.round((liczbaLudnosci / powierzchnia) * 100) /100;
    }

    public double obliczaniePowierzchniUzytkowej(double powierzchnia,double procentNieuzytkow) {
        return powierzchnia-(procentNieuzytkow*powierzchnia);
    }
}



