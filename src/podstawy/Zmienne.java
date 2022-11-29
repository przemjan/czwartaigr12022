package podstawy;

public class Zmienne {
    public static void main(String[] args) {

        int liczba1;
        liczba1 = 123;

        double liczba2 = 23.9;

        System.out.println(liczba1);


        liczba1 = (int)liczba2;

        System.out.println(liczba1);

        String napis = "Lubię \"białko\" :)";

        System.out.println("Mój napis: " + napis);
        System.out.print("Mój\n napis: " + napis + "\n");
        System.out.print("Mój\t napis: " + napis);

        int hours = 8;
        int days = 5;
        int weeks =52;

        // komentarz

        int workHoursPerYear  = hours * days * weeks;

        System.out.println(workHoursPerYear);

        char znak = '#';

        boolean twierdzenie = false; //true


        double liczba4 =2;
        double liczba5 = 3;
        double potega;

        //2 do trzeciej
        potega = Math.pow(2, 3);



    }
}
