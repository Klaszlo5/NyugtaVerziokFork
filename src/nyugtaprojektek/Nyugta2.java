package nyugtaprojektek;

import java.util.ArrayList;
import java.util.Scanner;

/* Probléma:
a 3. tétel árát 650-ről átírtuk 1320-ra.
Így szinte minden változott, mindenhez hozzá kell nyúlni
Refaktorizálás:
anmit egynél többször használunk, 
azt kiszervezzük változóba és erre hivatkozunk
*/
public class Nyugta2 {

    public static void main(String[] args) {
        String csillagok = "*******************";
        System.out.println(csillagok);
        System.out.println("     Nyugta 2");
        System.out.println(csillagok);
    }
    public static void szamolsz(String huf){
        Scanner scanner = new Scanner(System.in);
        huf = "Ft";
        ArrayList<Integer> tetelek = new ArrayList<Integer>();
        tetelek.add(350);
        tetelek.add(90);
        tetelek.add(1320);
        for (int i = 0; i < tetelek.size(); i++) {
             System.out.println(tetelek.get(i));
        }
    }
    public static void csikszam(String huf, int tetel1, int tetel2, int tetel3){
        huf="ft";
        tetel1 = 350; 
        tetel2 = 90;
        tetel3 = 1320;
        String duplaVonal = "===================";
        System.out.println(duplaVonal);
        ArrayList<Integer> tetelek = new ArrayList<Integer>();
        int osszesen = tetel1 + tetel2 + tetel3;
        tetelek.add(350);
        tetelek.add(90);
        tetelek.add(1320);
        for (int i = 0; i < tetelek.size(); i++) {
             System.out.println(tetelek.get(i));
        }
        
        String szaggatottVonal = "-------------------";
        System.out.println(szaggatottVonal);
        
        int kedvMertek = 10;
        int kedvezmeny = osszesen / kedvMertek;
        System.out.printf("Kedvezmény:  %d %s\n", kedvezmeny, huf);
        System.out.printf("(%d%%)\n", kedvMertek);

        System.out.println(duplaVonal);
        int fizetendo = osszesen - kedvezmeny;
        System.out.printf("Fizetendő:  %d %s\n", fizetendo, huf);
        double euro = fizetendo / 350.0;
        huf = "\u20ac";
        System.out.printf("            %f %s\n", euro, huf);
    }
    public static void szamk(String szaggatottVonal, String csillagok){
        csillagok = "*******************";
        szaggatottVonal = "-------------------";
        System.out.println(szaggatottVonal);
        System.out.println("");
        String rovidVonal = "_______";
        System.out.print(rovidVonal);
        String rovidVonalValaszto = "     ";
        System.out.print(rovidVonalValaszto);
        System.out.println(rovidVonal);

        System.out.print(" Dátum");
        System.out.print(rovidVonalValaszto);
        System.out.println("   Név");
        System.out.println(csillagok);
        System.out.println("        CÉG");
        System.out.println(csillagok);
    }
}
