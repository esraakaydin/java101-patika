package Variables;

import java.util.Scanner;


public class Average {
    public static void main(String[] args) {
        int mat, fzk, kimya, turkce, tarih, muzik;

        Scanner inp = new Scanner(System.in);

        System.out.print("Matematik notunuz :");
        mat = inp.nextInt();

        System.out.print("Fizik notunuzu giriniz: ");
        fzk = inp.nextInt();

        System.out.print("Kimya notunuzu giriniz : ");
        kimya = inp.nextInt();

        System.out.print("Türkçe notunuzu giriniz: ");
        turkce = inp.nextInt();

        System.out.print("Tarih notunuzu giriniz: ");
        tarih = inp.nextInt();

        System.out.print("Müzik notunuzu giriniz: ");
        muzik = inp.nextInt();

        int toplam = (mat + fzk + kimya + turkce + tarih + muzik);
        double sonuc = toplam / 6.0;

        System.out.println(sonuc);
    }
}

