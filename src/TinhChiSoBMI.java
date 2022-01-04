import sun.font.DelegatingShape;

import java.util.Scanner;

public class TinhChiSoBMI {
    public static void main(String[] args) {
        double   weight;
        double height;
        String result;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Moi nhap chieu cao: ");
        height = scanner.nextDouble();

        System.out.println("Moi nhap can nang: ");
        weight = scanner.nextDouble();

        double bmi = weight / Math.pow(height,2);

        if (bmi >= 30.0) {
            result = "Obese";
        } else if (bmi >= 25.0) {
            result = "Overweight";
        } else if(bmi >= 18.5) {
            result = "Normal";
        } else {
            result = "Underweight";
        }
        System.out.printf("BMI = %-10.2f Ban duoc xep vao loai: %s",bmi, result);
    }
}
