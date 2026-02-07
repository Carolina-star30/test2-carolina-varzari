public class Ex5 {
    public static void main(String[] args) {
        int [] numere = {5, 25, 46, 75, 101};

         int sum = 0;
        for (int i : numere) {
            sum += i;
        }
        System.out.println("Suma numerelor tabloului este: " + sum);
    }
}
