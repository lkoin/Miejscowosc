package pl.gornik;

import pl.gornik.miejscowosc.Miejscowosc;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Miejscowosc> miejscowoscList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        Miejscowosc miejscowosc1 = new Miejscowosc("Tarnobrzeg", "Tarnobrzeg", 45000, 85.5, 0.10);
        miejscowoscList.add(miejscowosc1);
        


        System.out.println("Liczba ludnosci wynsosi: " + miejscowosc1.obliczenieSredniegoZaludnienia(miejscowosc1.liczbaLudnosci, miejscowosc1.powierzchnia) + " osoby na km^2");
        System.out.println("Powieszchnia użytkowa wynosi: " + miejscowosc1.obliczaniePowierzchniUzytkowej(miejscowosc1.powierzchnia, miejscowosc1.procentNieuzytkow) + "km^2");
        Miejscowosc miejscowosc;
        String nazwa;
        String gmina;
        int liczbaLudnosci;
        double powieszchnia;
        double procentNieuzytkow;
        for (int i = 0; i < 2; i++) {
            System.out.println("Podaj nazwe miejscowosci");
            nazwa = scanner.nextLine();
            System.out.println("Podaj nazwe gminy");
            gmina = scanner.nextLine();
            System.out.println("Podaj liczbe ludnosci miejscowosci");
            liczbaLudnosci = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Podaj powieszchnie miejscowosci");
            powieszchnia = scanner.nextDouble();
            scanner.nextLine();
            System.out.println("Podaj procent nieuztkow");
            procentNieuzytkow = scanner.nextDouble();
            miejscowosc = new Miejscowosc(nazwa, gmina, liczbaLudnosci, powieszchnia, procentNieuzytkow);
            miejscowoscList.add(miejscowosc);
        }

        System.out.println(miejscowoscList);

        for (Miejscowosc miejscowosc2: miejscowoscList) {
            System.out.println(miejscowosc2);

        }

        Miejscowosc miejscowosc3 = miejscowoscList.get(0);
        System.out.println(miejscowosc3.liczbaLudnosci);
    }

}