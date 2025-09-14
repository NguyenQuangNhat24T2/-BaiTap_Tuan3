import java.util.Scanner;

public class Bai3 {
 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhhap so nguyenthu nhat: ");
        int a = sc.nextInt();

        System.out.print("Nhap so nguyen thu hai: ");
        int b = sc.nextInt();

        int tong = a + b;
        int hieu = a - b;
        int tich = a * b;
        int thuong = 0;
        int phanDu = 0;

        if (b != 0) {
            thuong = a / b;
            phanDu = a % b;
        } else {
            System.out.println("Không thể chia cho 0!");
        }

        System.out.println("Tong: " + tong);
        System.out.println("Hieu: " + hieu);
        System.out.println("Tich: " + tich);

        if (b != 0) {
            System.out.println("Thuong: " + thuong);
            System.out.println("Phan du: " + phanDu);
        }

        sc.close();
    }
}
