package lab2;
import java.util.Scanner;
public class Bai2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner nhaptubanphim= new  Scanner(System.in);
		System.out.println("Nhập vào 1 sốg nguyên: ");
		int s1 = nhaptubanphim.nextInt();
		if(s1 % 2 == 0) {
			System.out.println("Đây là số nguyên chẵn! ");
		} else {
			System.out.println("Đây là số nguyên lẻ! ");

		}
	}

}
