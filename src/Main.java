public class Main {
    public static void main(String[] args) {
        //входные данные
        int initialAmount = 100;
        int replenishmentAmount = 1100;

        int bonus;
        if (replenishmentAmount > 1000) {
            bonus = 1;
        } else {
            bonus = 0;
        }

        int endbonus = replenishmentAmount / 100 * bonus;
        int balance = initialAmount + replenishmentAmount + endbonus;

        System.out.println(balance);
    }
}
