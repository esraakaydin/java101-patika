package Conditional_statements;

import java.util.Scanner;

public class kdv {
    public static void main(String[] args) {
        double tutar , Kdvoran=0.18, Kdvtutar, Kdvlitutar;
        Scanner input= new Scanner(System.in);
        System.out.print( "Ücreti giriniz : ");
        tutar = input.nextDouble();
        Kdvtutar= tutar * Kdvoran;
        Kdvlitutar = tutar + Kdvtutar;
        System.out.println("KDV'siz tutar : "+tutar);
        System.out.println("KDV tutarı : "+Kdvtutar);
        System.out.println("Kdv'li tutar : "+Kdvlitutar);
    }
}
