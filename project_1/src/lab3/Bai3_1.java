package lab3;
import java.util.Scanner;
public class Bai3_1 {
	    private static String maSach;
	    private static String tenSach;
	    private static String tenTacGia;
	    private static int soTrang;
	    private static String loaiSach;
	    private static String nhaXuatBan;
	    private static int soTap;
	    private static double gia;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//    nhap thong tin cho sach
    // Sử dụng Scanner để nhập dữ liệu từ bàn phím
    Scanner scanner = new Scanner(System.in);
    System.out.print("Nhap so luong sach: ");
    int n = scanner.nextInt();
    scanner.nextLine();

//    Bai3_1[] sachList = new Bai3_1[n];

    for (int i = 0; i < n; i++) {
        Bai3_1 sach = new Bai3_1();

        System.out.println("Nhap thong tin cho sach thu " + (i + 1) + ":");
    System.out.println("Nhập mã sách: ");
    maSach = scanner.nextLine();
    scanner.nextLine();
    System.out.println("Nhập tên sách: ");
    tenSach = scanner.nextLine();
    System.out.println("Nhập tên tác giả: ");
    tenTacGia = scanner.nextLine();
    System.out.println("Nhập số trang: ");
    soTrang = scanner.nextInt();
    scanner.nextLine();
    System.out.println("Nhập loại sách: ");
    loaiSach = scanner.nextLine();
    System.out.println("Nhập nhà xuất bản: ");
    nhaXuatBan = scanner.nextLine();
    System.out.println("Nhập số tập: ");
    soTap = scanner.nextInt();
    System.out.println("Nhập giá: ");
    gia = scanner.nextDouble();
    sach.INSACH();
        // In thông tin sách
        }
	}
	public void INSACH() {
		System.out.println("Thông tin sách vừa nhập:");
		System.out.println("Mã sách: " +  maSach);
		System.out.println("Tên sách: " + tenSach);
		System.out.println("Tên tác giả: " + tenTacGia);
		System.out.println("Số trang: " + soTrang);
		System.out.println("Loại sách: " + loaiSach);
		System.out.println("Nhà xuất bản: " + nhaXuatBan);
		System.out.println("Số tập: " + soTap);
		System.out.println("Giá: " + gia); 
		
    }
    
}
