import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Zəhmət olmasa hansı hesablama əməli edəcəyinizi seçin ('*', '/', '+', '-'):");
        char chs=sc.next().charAt(0);

        System.out.println("Birinci reqemi girin:");
        double var1 = sc.nextDouble();
        System.out.println("Ikinci reqemi girin:");
        double var2 = sc.nextDouble();

        switch (chs) {
            case '+' -> System.out.println("Cavab: " + (var1 + var2));
            case '*' -> System.out.println("Cavab: " + (var1 * var2));
            case '/' -> System.out.println("Cavab: " + (var1 / var2));
            case '-' -> System.out.println("Cavab: " + (var1 - var2));
            default -> System.out.println("Düzgün hesablama əməli seçin!!!");
        }
        sc.close();
    }
}