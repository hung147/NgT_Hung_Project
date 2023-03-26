package lab2;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Bai8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DecimalFormat decimalFormat = new DecimalFormat("#.##");
Scanner nhaptubanphim = new Scanner(System.in);
System.out.println("Nhap day so nguyen tu ban phim:  ");
int sum = 0;

int daysocannhap = nhaptubanphim.nextInt();
for(int i = 1; i <= daysocannhap;i++ ) {
	System.out.println("Lan nhap thu" + " " + i);
	int dulieu = nhaptubanphim.nextInt();
	sum += dulieu;
}
float trungbinhcong = (float) sum / daysocannhap;
System.out.println("Trung binh cong cac so vua nhap la:  " + decimalFormat.format(trungbinhcong));

	}

}
