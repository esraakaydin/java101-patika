package Conditional_statements;

import java.util.Scanner;

public class Triangles_area {
    public static void main(String[] args) {
        double a = 0, b = 0, c = 0, cevre, alan, alankare, u;

        Scanner veri = new Scanner(System.in);

        for (int i = 1; i <= 3; i++) {

            if (i == 1) {
                System.out.print("Üçgeninizin " + i + ". kenar uzunlugunu giriniz :");
                a = veri.nextDouble();
            } else if (i == 2) {
                System.out.print("Üçgeninizin " + i + ". kenar uzunlugunu giriniz :");
                b = veri.nextDouble();
            } else if (i == 3) {
                System.out.print("Üçgeninizin " + i + ". kenar uzunlugunu giriniz :");
                c = veri.nextDouble();
            }
        }
        cevre = a + b + c;
        u = cevre / 2.0;

        System.out.println("Üçgeeninizin çevresi : " + cevre);
        alan = Math.sqrt(u * (u - a) * (u - b) * (u - c));
        System.out.println("Üçgeninizin alanı : " + alan);
    }
}
