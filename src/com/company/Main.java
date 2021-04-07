public class Main {
    public static void main(String[] args) {
        int balance = 100;
        int income = 1100;
        if (income>1000){
            int bonus = income/100;
            int total = bonus + income + balance;
            System.out.println("Ваш баланс = " + total);
        }
        else {
            int total = balance + income;
            System.out.println("Ваш баланс = " + total);
        }
    }
}
