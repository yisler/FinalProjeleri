// Proje 3 : Basit Hesap Makinesi

import java.util.Scanner;
public class Proje3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    System.out.print("Yapmak istediğiniz işlemi seçiniz (+, -, *, /): ");
    char operator = scanner.next().charAt(0);

    System.out.print("İlk sayıyı girin: ");
    double num1 = scanner.nextDouble();

    System.out.print("İkinci sayıyı girin: ");
    double num2 = scanner.nextDouble();

    double result = 0;

    switch (operator) {
        case '+':
            result = num1 + num2;
            break;
        case '-':
            result = num1 - num2;
            break;
        case '*':
            result = num1 * num2;
            break;
        case '/':

            if (num2 != 0) {
                result = num1 / num2;
            } else {
                System.out.println("Hata: Girmiş olduğunuz sayı 0'a bölünemez, Lütfen başka bir sayı giriniz.");
                return;
            }
            break;
        default:
            System.out.println("Seçtiğiniz işlem geçersizdir.");
            return;
    }
    System.out.println("Sonuç: " + result);
    scanner.close();
}
}
