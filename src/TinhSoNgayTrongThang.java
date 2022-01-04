import java.util.Scanner;

public class TinhSoNgayTrongThang {
    public static void main(String[] args) {
        int thang;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Moi nhap thang: ");
        thang = scanner.nextInt();

        switch (thang) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.printf("Thang %d co  31 ngay", thang);
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.printf("Thang %d co  30 ngay", thang);
                break;
            case 2:
                System.out.println("Thang 2 co  28 hoac 29 ngay");
                break;
            default:
                System.out.println("So thang khong hop le !!!");
                break;
        }
    }
}
