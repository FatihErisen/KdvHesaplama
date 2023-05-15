import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//Değişkenler oluşturuluyor
		int tutar;
		double kdv;
		double kdvOrani;
		double kdvliTutar;
		
		//Scanner sınıfı tanımlanıyor
		Scanner in= new Scanner(System.in);
		
		//Kullanıcıdan not değerleri alınıyor
		System.out.print("Ürünün KDV hariç fiyatını giriniz : ");
		tutar = in.nextInt();
		
		kdvOrani= (tutar >0 && tutar<1000) ? 0.18 : 0.08;
		kdv=tutar*kdvOrani;
		kdvliTutar=tutar + kdv;

		System.out.println("\nGirdiğiniz tutar: " + tutar 
				+"\nKDV oranı: %" + kdvOrani*100
				+"\nKDV :" + kdv
				+"\nKDV'li tutar :" + kdvliTutar);
	}

}
