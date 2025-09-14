import java.util.Scanner;
public class bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so tien gui (VND): ");
        double tienGoi = sc.nextDouble();
        System.out.print("Nhap lai suat hang nam (%): ");
        double laiSuatNam = sc.nextDouble();
        System.out.print("Nhap so thang gui: ");
        int soThang = sc.nextInt();
        double laiSuatThang = (laiSuatNam / 100) / 12; 
        double tienLai = tienGoi * laiSuatThang * soThang; 
        double tongTien = tienGoi + tienLai; 
        System.out.println("----- Ket qua -----");
        System.out.println("tien goc: " + tienGoi + " VND");
        System.out.println("Tien lai: " + tienLai + " VND");
        System.out.println("Tong cong: " + tongTien + " VND");
        sc.close();
    }
}
