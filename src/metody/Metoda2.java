package metody;

public class Metoda2 {
    public static void main(String[] args) {

        int liczba1 = 10, liczba2 = 7;

        dodajDrukuj(liczba1,liczba2);

        System.out.println(liczba1);
    }
    public static void dodajDrukuj(int liczba1, int b){

        int wynik = liczba1+b;
        liczba1 =57;
        System.out.println("Wynik wynosi: " +wynik);

    }
}
