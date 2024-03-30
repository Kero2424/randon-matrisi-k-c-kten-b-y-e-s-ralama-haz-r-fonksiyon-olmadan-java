package çarpıptoplamatris;
import java.util.Random;
public class matisçarptopla {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // Dizi boyutu için rastgele bir sayı üretiyoruz (0-5 arası, örnek olarak 4  belirledik)
        int diziBoyutu = 4; // Bu örnekte sabit olarak 4 seçilmiştir

        // Rastgele doldurulacak diziyi oluşturma
        int[] dizi = new int[diziBoyutu];

        // Diziye rastgele değerler atama (0-100 arası)
        for (int i = 0; i < diziBoyutu; i++) {
            dizi[i] = (int)(Math.random() * 100) + 1;
        }

        // Diziyi küçükten büyüğe sıralama )
        for (int i = 0; i < dizi.length; i++) {
            for (int j = i + 1; j < dizi.length; j++) {
                if (dizi[i] > dizi[j]) {
                    // Elemanları yer değiştir
                    int temp = dizi[i];
                    dizi[i] = dizi[j];
                    dizi[j] = temp;
                }
            }
        }

        // Dizi elemanlarının çarpımını bulma ve toplama
        int toplam = 0;
        int carpim = 1;
        for (int i = 0; i < dizi.length; i++) {
            carpim *= dizi[i]; // Elemanları çarp
            toplam += carpim; // Çarpımları topla
        }

        // Sonuçları yazdırma
        System.out.println("Sıralanmış Dizi: ");
        for (int i = 0; i < dizi.length; i++) {
            System.out.print(dizi[i] + " ");
        }
        System.out.println("\nÇarpımın Toplamı: " + toplam);
    }
	}


