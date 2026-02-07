import java.util.Scanner;
public class Ex4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Introudceti 3 numere:");

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        if (a == b && b == c) {
            System.out.println("Toate numerele sunt egale");
        } else if (a != b && b != c && a != c) {
            System.out.println("Toate numerele sunt diferite");
        }
        else {
            System.out.println("Nici nu sunt egale , nici diferite");
        }
    }
}
