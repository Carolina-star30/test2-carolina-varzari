public class Ex1 {
    public static void main(String[] args) {

        byte x  = 100;
        short y = x;

        System.out.println("Conversia din byte in short este: " + y);

        int    a = 2550;
        double b = a;

        System.out.println("Conversia din int in double este: " + b);

        long c = 15000L;
        int d = (int) c;

        System.out.println("Conversia din long in int este: " + c);
    }

}
