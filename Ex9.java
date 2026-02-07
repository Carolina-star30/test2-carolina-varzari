public class Ex9 {

    static int latura = 8;
    public static int calculeazaPerimetruPatrulater(int l) {
        return  4 * l;
    }

    public static void main(String[] args) {
        int rezultat = calculeazaPerimetruPatrulater(latura);
        System.out.println("Perimetru unui patrulater cu latura de " + latura + " este " + rezultat );
    }
}
