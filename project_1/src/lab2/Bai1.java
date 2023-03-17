package lab2;
import java.util.Scanner;
import java.text.DecimalFormat;
public class Bai1 {

	public static void main(String[] args) {
		// TODO Auto-generated method s	tub
		 Scanner nhaptubanphim = new  Scanner(System.in);
		 DecimalFormat decimalFormat = new DecimalFormat("#.##");
					System.out.println("Nhập vào số thứ 1:  ");
	int s1 = nhaptubanphim.nextInt();
	System.out.println("Nhập vào số thứ 2:  ");
	int s2 = nhaptubanphim.nextInt();
	int tong = s1 + s2;
	System.out.println("Tổng của 2 số vừa nhập là: " + tong);
	int hieu = s1 - s2;
	System.out.println("Hiệu của 2 số vừa nhập là: " + hieu);
	int tich = s1 * s2;
	System.out.println(" Tích của 2 số vừa nhập là: " + tich);  
    float thuong = (float) s1 / s2;
    System.out.println("Thương của 2 số vừa nhập là: " + 
            decimalFormat.format(thuong));  
	int du = s1 % s2;
	System.out.println("Chia dư của 2 số vừa nhập là: " + du);
	if(s1 == s2) {
		System.out.println("so sanh s1 va s2 thi s1 = s2");
	}
	else if(s1 > s2) {
		System.out.println("so sanh s1 va s2 thi s1 > s2");

	} else if(s1 < s2) {
		System.out.println("so sanh s1 va s2 thi s1  < s2");
	}
	
	}
}
