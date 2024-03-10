package Conditional_statements;

import java.util.Scanner;

public class kdv {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double tutar, kdvoran = 0.18, kdvoran2 = 0.08, kdvtutar = 0, kdvlitutar = 0;

        System.out.print("Ücreti giriniz : ");
        tutar = input.nextDouble();

        if (tutar <= 1000 && tutar >= 0) {
            kdvtutar = tutar * kdvoran;
            kdvlitutar = tutar + kdvtutar;
        } else if (tutar > 1000) {
            kdvtutar = tutar * kdvoran2;
            kdvlitutar = tutar + kdvtutar;
        }

        System.out.println("KDV'siz tutar : " + tutar);
        System.out.println("KDV tutarı : " + kdvtutar);
        System.out.println("Kdv'li tutar : " + kdvlitutar);
    }
}
