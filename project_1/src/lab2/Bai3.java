package lab2;
import java.util.Scanner;
public class Bai3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner nhaptubanphim= new  Scanner(System.in);
			System.out.println("Nhập ten cua ban la: ");
        String name = nhaptubanphim.nextLine();
        System.out.println("Nhập nam sinh cua ban la: ");
        int namsinh = nhaptubanphim.nextInt();
        int tuoi = 2023 - namsinh;
        if(tuoi < 16) {
            System.out.println("Ban" + " " + name + " " + "dang o tuoi vi thanh nien");

        } else if(tuoi >= 16 && tuoi < 18) {
            System.out.println("Ban" + " " + name + " " + "dang o tuoi truong thanh");

        } else if(tuoi >= 18) {
            System.out.println("Ban" + " " + name + " " + "dang o tuoi gia");

        }
	}

}
