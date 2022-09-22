public class Main {
    public static void main(String[] args) {
        // Задание 1
        for (int f = 1; f <= 10; f++) {
            System.out.println(f);
        }

        // Задание 2
        for (int c = 10; c >=1; c--) {
            System.out.println(c);
        }

        // Задание 3
        for (int s = 0; s <= 17; s = s + 2) {
            System.out.println(s);
        }

        // Задание 4
        for (int q = 10; q >= -10; q--) {
            System.out.println(q);
        }

        // Задание 5
        for (int y = 1904; y <= 2096; y = y+4) {
            System.out.println(y + " год является високосным");
        }

        // Задание 6
        for (int n = 7; n <= 98; n = n+7) {
            System.out.println(n);
        }

        // Задание 7
        for (int d = 1; d <= 512; d = d*2) {
            System.out.println(d);
        }

        // Задание 8
        int zp = 29000;
        int total = 0;
        for ( int i = 1; i <= 12; i++) {
            total = total + zp;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }

        // Задание 9
        int contribution = 29000;
        int sum = 0;
        for ( int v = 1; v <= 12; v++) {
            sum = sum + sum/100;
            sum = sum + contribution;
            System.out.println("Месяц " + v + ", сумма накоплений равна " + sum + " рублей");
        }
    }
}