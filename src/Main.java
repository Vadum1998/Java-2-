public class Main {
    public static void main(String[] args) {
        //входные данные
        int initialamount = 100;
        int replenishment = 1100;

        int bonus;
        if (replenishment > 1000) {
            bonus = 1;
        } else {
            bonus = 0;
        }

        int endbonus = replenishment / 100 * bonus;
        int Balance = initialamount + replenishment + endbonus;

        System.out.println(Balance);
    }
}
