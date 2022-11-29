package podstawy;


import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {

        Scanner klawisz = new Scanner(System.in);

        int numerButa;

        System.out.println("Podaj numer buta: ");
        numerButa = klawisz.nextInt();
        klawisz.nextLine();

        System.out.println("Podaj swoją średnią: ");
        double srednia = klawisz.nextDouble();
        klawisz.nextLine();

        System.out.println("Podaj swoje imię: ");
        String name = klawisz.nextLine();

        System.out.println("Numer buta: " + numerButa +
                ", średnia: " + srednia + ", twoje imię" + name);



    }
}
