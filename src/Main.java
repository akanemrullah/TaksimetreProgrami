import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Gerekli degiskenleri tanimladik.
        int km;
        double perKm = 2.20, startPrice = 10, total;

        // Scanner sinifini tanimladik.
        Scanner input = new Scanner(System.in);

        // Kullanicidan bilgi alip ilgili degiskenimize atadik.
        System.out.print("Varmak istediginiz nokta ne kadar uzaklikta? Kilometre cinsinden yaziniz lutfen: ");
        km = input.nextInt();

        // Gerekli matematiksel islemler yapildi.
        total = perKm * km + startPrice;
        total = (total < 20) ? 20 : total;

        // Kullaniciya cikti verildi.
        System.out.print("Toplam tutar: " + total);
    }
}