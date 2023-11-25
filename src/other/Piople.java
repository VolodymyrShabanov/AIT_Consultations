package other;

public class Piople {
    public static void main(String[] args) {
        int pop = 14_000_000;
        int born = 14;
        int dead = 8;

        System.out.println("Итого: " + calc(10, pop, born, dead));
    }

    public static int calc(int years, int pop, int born, int dead) {
        for (int i = 1; i <= years; i++) {
            pop += (born - dead) * pop / 1000;
            System.out.println("В " + i + " году - численность населения " + pop);
        }

        return pop;

    }

}
