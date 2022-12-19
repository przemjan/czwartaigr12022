package ZapisDoPliku;

import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterDemo  {
    public static void main(String[] args) throws IOException {

        PrintWriter pw = new PrintWriter("danie.txt");

        pw.println("Michał lubi pierogi :)");

        //zapisanie kolejnej linii
        //pw.println("Krystian lubi rosół");

        pw.close();
    }
}
