package Ex13;

public class CardCumparaturi extends CardBancar {

    private double cashBackRata = 0.05;

    public CardCumparaturi( String posesor, double sold, int pin ) {
        super(posesor, sold, pin);
    }

    @Override
    public void plateste(double suma) {
        double bonus = suma * cashBackRata;
        super.plateste(suma);
        System.out.println("Felicitari, ai primit un cashback in valoare de " + bonus + " lei");
    }

}
