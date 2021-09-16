public class Main {
    public static void main(String[] args) {
        int currentBalance = 250_00;
        int refill = 250_00;
        int bonus;
        if (refill >= 1000_00) {
            bonus = refill / 100 / 100;
        } else {
            bonus = 0;
        }

        System.out.println(bonus);
        System.out.println((currentBalance + refill) / 100);
    }
}
