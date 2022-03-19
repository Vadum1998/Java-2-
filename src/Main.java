public class Main{
    public static void main(String[] args) {
        //входные данные
        int изначальнаясумма = 100;
        int суммапополнения = 1100;

        int bonus;
        if (суммапополнения > 1000) {
            bonus = 1;
        } else {
            bonus = 0;
        }

        int endbonus = суммапополнения / 100 * bonus;
        int баланс = изначальнаясумма + суммапополнения + endbonus;

        System.out.println(баланс);
    }
}
