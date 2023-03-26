package lab2;
import java.util.Scanner;

public class Bai9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String chuoi;
	    int count = 0, dem = 0, number = 0;
	    char KyTu;
	    Scanner scanner = new Scanner(System.in);
	         
	    System.out.println("Nhap vao chuoi ky tu: ");
	    chuoi = scanner.nextLine();
	    for(int i = 0; i < chuoi.length(); i++) {
	    	KyTu = chuoi.charAt(i);
	    	if(KyTu >= 'a' && KyTu <= 'z') {
	    		count++;
	    	}
	    	if(KyTu >= 'A' && KyTu <= 'Z') {
	    		dem++;
	    	}
	    	if(KyTu >= '0' && KyTu <= '9') {
	    		number++;	    	
	    		}
	    	}
	    System.out.println("So ky tu in thuong co trong chuoi la: " + count);
	    System.out.println("So ky tu in hoa co trong chuoi la: " + dem);
	    System.out.println("Chu so co trong chuoi la: " + number);
		
	}

}
