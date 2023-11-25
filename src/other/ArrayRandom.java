package other;

/* Задача:
Создайте массив из 12 случайных целых чисел из отрезка от -15 до 15.
Определите какой элемент является в этом массиве максимальным
и сообщите индекс его последнего вхождения в массив
 */
public class ArrayRandom {
    public static void main(String[] args) {
        int [] numbers = new int [12];

        // Заполняем случайными числами массив
        int a = -15;
        int b = 15;

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) Math.random() * (b - a + 1) + a;
            System.out.print(numbers[i] + "; ");
        }    

    }
}
