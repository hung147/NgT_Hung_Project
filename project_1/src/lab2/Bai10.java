package lab2;
import java.util.Scanner;

public class Bai10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int SoLanXuatHien = 0;
		String chuoi;
		char KyTu;
		do {
			System.out.println("Nhap chuoi: ");
			chuoi = scanner.nextLine();
		}while(chuoi.length() > 80);
		System.out.println("Nhap ki tu can dem: ");
		KyTu = scanner.next().charAt(0);
		for(int i = 0 ; i < chuoi.length(); i++) {
			if(KyTu == chuoi.charAt(i))
				SoLanXuatHien++;
		}
			System.out.println("So lan xuat hien ky tu " + KyTu + " trong chuoi " + chuoi + " la: " + SoLanXuatHien + " lan ");
	}

}
