import java.util.Scanner;

public class KiemTraNamNhuan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year;

        System.out.print("Moi nhap nam: ");
        year = scanner.nextInt();
        boolean namNhuan = true;
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 != 0) {
                    namNhuan = false;
                }
            }
        } else {
            namNhuan = false;
        }
        if (namNhuan) {
            System.out.printf("Nam %d la nam nhuan", year);
        } else {
            System.out.printf("Nam %d khong phai la nam nhuan", year);
        }
    }
}
