public class Main {
    public static void main(String[] args) {
        int amount = 15_000; //Стоимость билета
        int x = 20; //Рублей для одной бонусной мили
        int bonus = amount / x;
        System.out.println  ("Начисленные мили: " + amount / x);
    }
}