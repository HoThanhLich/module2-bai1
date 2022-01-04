import java.util.Scanner;

public class UngDungChuyenDoiTienTe {
    public static void main(String[] args) {
        short rate = 23000;
        long vnd ;
        long usd;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Moi nhap so tien(usd): ");
        usd = scanner.nextLong();

        vnd = usd * rate;
        System.out.println("So tien VND tuong ung la: " + vnd);
    }
}
