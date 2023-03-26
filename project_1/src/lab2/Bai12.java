package lab2;
import java.util.Scanner;
public class Bai12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n, m;
		System.out.println("Nhap so dong cua ma tran: ");
		n = scanner.nextInt();
		System.out.println("Nhap so cot cua ma tran: ");
		m = scanner.nextInt();
		
		int A[][] = new int [n][m];
		System.out.println("Nhap cac phan tu cho ma tran: ");
		for(int i = 0 ; i < n ; i++) {
			for(int j = 0 ; j < m ; j++) {
				System.out.println("A[" + i + "][" + j + "] = ");
				A[i][j] = scanner.nextInt();
			}
		}
		int max = A[0][0];
		for(int i = 1 ; i < n ; i++) {
			for(int j = 1 ; j < m ; j++) {
				if( max < A[i][j]) {
					max = A[i][j];
				}
			}
		}
		System.out.println("Phan tu co gia tri lon nhat trong mang la: " + max);
	}
	

}
