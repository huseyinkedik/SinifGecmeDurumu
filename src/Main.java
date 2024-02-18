import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int matematik, turkce, fizik, kimya, muzik;

        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notunuzu giriniz: ");
        matematik = input.nextInt();

        System.out.print("Türkçe notunuzu giriniz: ");
        turkce = input.nextInt();

        System.out.print("Fizik notunuzu giriniz: ");
        fizik = input.nextInt();

        System.out.print("Kimya notunuzu giriniz: ");
        kimya = input.nextInt();

        System.out.print("Müzik notunuzu giriniz: ");
        muzik = input.nextInt();

        // Girilen veri 0'dan küçük veya 100'den büyükse, 0 olarak kabul edilsin

        if ((turkce <= 0) || (100 <= turkce)) {
            turkce = 0;
        }

        if ((fizik <= 0) || (100 <= fizik)) {
            fizik = 0;}

        if ((kimya <= 0) || (100 <= kimya)) {
            kimya = 0;
        }

        if ((matematik <= 0) || (100 <= matematik)) {
            matematik = 0;
        }

        if ((muzik <= 0) || (100 <= muzik)) {
            muzik = 0;
        }

        double sonuc = (matematik + turkce + fizik + kimya + muzik) / 5;
        System.out.println(sonuc >= 55 ? "Geçti" : "Kaldı");
        System.out.println("Ortalama: " + sonuc);

    }
}