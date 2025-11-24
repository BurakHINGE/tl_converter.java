import java.util.Scanner;

public class TLConverter {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Bir ondalıklı miktar giriniz: ");
        double miktar = input.nextDouble(); 

        int tl = (int) miktar;
        int kurus = (int) ((miktar - tl) * 100);

        int ikiyuz = tl / 200;
        tl %= 200;

        int yuz = tl / 100;
        tl %= 100;

        int elli = tl / 50;
        tl %= 50;

        int yirmi = tl / 20;
        tl %= 20;

        int on = tl / 10;
        tl %= 10;

        int bes = tl / 5;
        tl %= 5;

        int bir = tl / 1;
        
        int ellikurus = kurus / 50;
        kurus %= 50;

        int yirmibeskurus = kurus / 25;
        kurus %= 25;

        int onkurus = kurus / 10;
        kurus %= 10;

        int beskurus = kurus / 5;
        kurus %= 5;

        int birkurus = kurus / 1 + 1;

        System.out.println("Miktarınız şu birimlerden oluşuyor:");
        System.out.println(
            ikiyuz + " x 200TL\n" +
            yuz + " x 100TL\n" +
            elli + " x 50TL\n" +
            yirmi + " x 20TL\n" +
            on + " x 10TL\n" +
            bes + " x 5TL\n" +
            bir + " x 1TL\n" +
            ellikurus + " x 50KR\n" +
            yirmibeskurus + " x 25KR\n" +
            onkurus + " x 10KR\n" +
            beskurus + " x 5KR\n" +
            birkurus + " x 1KR"
        );

    }
    
}
