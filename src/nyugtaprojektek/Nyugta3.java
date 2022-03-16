package nyugtaprojektek;
/* Probléma:
tüntessük el a kézzel beírt szóközöket,
a huf ne tartalmazzon eurót
a kedvezmény helyett legyen szervízdíj, amit hozzá kell adni a végössdzeghez
*/

import static java.lang.System.out;
import java.util.ArrayList;
import java.util.Scanner;

public class Nyugta3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        String szokoz=" ";

        szokoz+=scan.nextLine();
        scan.close();
        
        String str = null;
        String csillagok = "********************";
        out.println(csillagok);
        //System.out.println("     Nyugta 3");
        out.printf("%14s\n", "Nyugta 3");
        out.println(csillagok);
        
        final String HUF = "Ft";
        ArrayList<Integer> tetelek = new ArrayList<Integer>();
        tetelek.add(350);
        tetelek.add(90);
        tetelek.add(1320);
        for (int i = 0; i < tetelek.size(); i++) {
             System.out.println(tetelek.get(i));
        }
        

        String duplaVonal = "====================";
        out.println(duplaVonal);
        
        tetelek.add(350);
        tetelek.add(90);
        tetelek.add(1320);
        int osszesen = 0;
        for (int i = 0; i < tetelek.size(); i++) {
             System.out.println(tetelek.get(i));
             osszesen+=tetelek.get(i);
        }
        
        String szaggatottVonal = "--------------------";
        out.println(szaggatottVonal);
        
        int szervizDijMertek = 10;
        int szervizDij =0;
        while(osszesen >= szervizDijMertek){
            osszesen -= szervizDijMertek;
            szervizDij++;
        }
        //System.out.printf("Kedvezmény:  %d %s\n", kedvezmeny, huf);
        out.printf("%10s: %5d %s\n", "Szervízdíj", szervizDij, HUF);
        out.printf("(%d%%)\n", szervizDijMertek);
        
        out.println(duplaVonal);
        
        //int fizetendo = osszesen - szervizDij;
        int fizetendo = osszesen + szervizDij;
        //System.out.printf("Fizetendő:  %d %s\n", fizetendo, huf);
        out.printf("%10s:  %d %s\n", "Fizetendő", fizetendo, HUF);
        double euro = fizetendo / 350.0;
        //HUF = "\u20ac";//EZ NEM JÓ!!!!
        final String eur = "\u20ac";
        //System.out.printf("            %f %s\n", euro, eur);
        
        /* 7.2 7 szélesen 2 tizedessel,a max: 1234.99
        *  a %10s  egy "" -t ír ki, ezzel tolom beljebb
        */
        out.printf("%10s%7.2f %s\n","", euro, eur);//
        
        out.println(szaggatottVonal);
        
        out.println("");
        String rovidVonal = "_______";
        out.print(rovidVonal);
        String rovidVonalValaszto = "      ";
        out.print(rovidVonalValaszto);
        out.println(rovidVonal);
        out.print(" Dátum");
        out.print(rovidVonalValaszto);
        out.println("   Név");
        
        out.println(csillagok);    
        out.println("        CÉG");
        out.println(csillagok);
        
    }

}
