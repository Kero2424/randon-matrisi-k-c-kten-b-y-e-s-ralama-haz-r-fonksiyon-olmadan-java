package ödev1;
import java.util.Random;

public class ödev1hazıryasak {
    	public static void main(String[] args) {
           
    		//a, b, c ve d değişkenlerine 1 ile 1000 arasında rastgele tam sayı atıyoruz 
            int a = (int)(Math.random() * 1000) + 1;
            int b = (int)(Math.random() * 1000) + 1;
            int c = (int)(Math.random() * 1000) + 1;
            int d = (int)(Math.random() * 1000) + 1;
                int sonuc;  //sonuc adında bir geçici değişken kullanılarak sayıların yer değiştirmesi sağlanır

               // Her bir sayıyı diğer sayılarla karşılaştırarak sıralıyoruz ve gerekirse yer değiştiriliyor
                if (a > b) { sonuc = a; a = b; b = sonuc; }
                if (a > c) { sonuc = a; a = c; c = sonuc; }
                if (a > d) { sonuc = a; a = d; d = sonuc; }
                if (b > c) { sonuc = b; b = c; c = sonuc; }
                if (b > d) { sonuc = b; b = d; d = sonuc; }
                if (c > d) { sonuc = c; c = d; d = sonuc; }

              //Son olarak küçükten büyüğe sıralanmış olan a ve b, c ve d sayıları ekrana yazdırılır.
                System.out.println(a + " " + b);
                System.out.println(c + " " + d); 
        }
}
		
			
		
	


