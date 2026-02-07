import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Introduceti un numar: ");
        int x = input.nextInt();

        if (x > 0) {
            System.out.println("Numarul este pozitiv");
        }else {
            System.out.println("Numarul este negativ");
        }
    }

}
