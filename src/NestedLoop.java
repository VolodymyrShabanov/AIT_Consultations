public class NestedLoop {
    public static void main(String[] args) {
        figure1(6);
    }
        // рисуем квадрат с диагоналями из звездочек
    public static void figure1(int n) {
        for (int j = 1; j <= n; j++) {
            for (int i = 1; i <= n; i++) {
                if (j == 1 || j == n || i == 1 || i == n || i == j || i == n + 1 - j) {

                    // j == 1 - верхняя сторона;
                    // j == n - нижняя сторона;
                    // i == 1 - левая сторона
                    // i == n - правая сторона
                    // i == j - диагональ с лева на право
                    // i == n + 1 - j - диагональ с права на лево

                    System.out.print(i + "*" + "\t");
                } else {
                    System.out.print(i + "\t");
                }
            }
            System.out.println("++++" + j);
        }

    }
}
