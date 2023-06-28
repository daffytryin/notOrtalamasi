
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int fizik, mat, kim, tr,muzik;
        double ort; //ortalama double cinsinden çıkabilir bu nedenle ortalama float olarak tanımlandı
        Scanner input = new Scanner(System.in); //sisteme scanner tanımlıyoruz, bu sayede kullanıcıdan veri alabileceğiz
        System.out.print("Fizik notunuzu girin: "); //teker teker değerleri alıyoruz
        fizik = input.nextInt();
        System.out.print("Matematik notunuzu girin: ");
        mat = input.nextInt();
        System.out.print("Kimya notunuzu girin: ");
        kim = input.nextInt();
        System.out.print("Turkce notunuzu girin: ");
        tr = input.nextInt();
        System.out.print("Muzik notunuzu girin: ");
        muzik = input.nextInt();

        ort = (mat+fizik+kim+tr+muzik)/5; //ortalama hesabı için gerekli işlem
        String kosul;
        boolean sonuc1 = ort < 60;
        kosul = (sonuc1==true)? "Sınıfta kaldı." : "Sınıfı gecti";
        System.out.println(kosul);

    }
}
