package Ex13;

public class Test {
    public static void main(String[] args) {

        CardBancar cardSimplu  = new CardBancar("Carolina", 55500, 2003);
        CardBancar cardPremium = new CardCumparaturi("Alina", 55555, 3652);

        cardSimplu.plateste(1500);

        cardPremium.plateste(12000);
    }
}
