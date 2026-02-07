public class Ex14 {
    public static void main(String[] args) {

        int oameni = 0;

        try {
            if (oameni == 0) {
                throw new Exception("Nu poti imparti prajitura la zero oameni");
            }
            System.out.println("Fiecare primeste o felie");
        } catch (Exception e) {
            System.out.println("Eroare: " + e.getMessage());
        }
    }
}
