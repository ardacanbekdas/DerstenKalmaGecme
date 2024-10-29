package PatikaOdevlerVePratikler;

import java.util.Scanner;

public class GpaApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int mat, fizik, kimya, biyoloji, turkce;

        System.out.print("Matematik notunuzu giriniz:");
        mat = input.nextInt();

        System.out.print("Fizik notunuzu giriniz:");
        fizik = input.nextInt();

        System.out.print("Kimya notunuzu giriniz:");
        kimya = input.nextInt();

        System.out.print("Biyoloji notunuzu giriniz:");
        biyoloji = input.nextInt();

        System.out.print("Türkçe notunuzu giriniz:");
        turkce = input.nextInt();

        double notOrtalamasi = ((mat + fizik + kimya + biyoloji + turkce)/5.0);
        System.out.println("Not ortalamanız:" + notOrtalamasi);

        double gecmeNotu;
        gecmeNotu = (notOrtalamasi >= 60) ? 1 : 0;
        System.out.println((gecmeNotu==1) ? "Dersi geçtiniz" : "Dersten kaldınız" );

    }

}


