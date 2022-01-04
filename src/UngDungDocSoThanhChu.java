import java.util.Scanner;

public class UngDungDocSoThanhChu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a;
        String result;

        System.out.println("Enter a number: ");
        a = scanner.nextInt();

        switch (a) {
            case 0:
                result = "Khong";
                break;
            case 1:
                result = "Mot";
                break;
            case 2:
                result = "Hai";
                break;
            case 3:
                result = "Ba";
                break;
            case 4:
                result = "Bon";
                break;
            case 5:
                result = "Nam";
                break;
            case 6:
                result = "Sau";
                break;
            case 7:
                result = "Bay";
                break;
            case 8:
                result = "Tam";
                break;
            case 9:
                result = "Chin";
                break;
            case 10:
                result = "Muoi";
                break;
            case 11:
                result = "Muoi mot";
                break;
            case 12:
                result = "Muoi hai";
                break;
            case 13:
                result = "Muoi ba";
                break;
            case 14:
                result = "Muoi bon";
                break;
            case 15:
                result = "Muoi lam";
                break;
            case 16:
                result = "Muoi sau";
                break;
            case 17:
                result = "Muoi bay";
                break;
            case 18:
                result = "Muoi tam";
                break;
            case 19:
                result = "Muoi chin";
                break;
            default:
                result = "Khong doc duoc";
                break;
        }
        System.out.println(a + " Doc la: " + result);
    }
}
