public class WeekDays {
    public static void main(String[] args) {
        // Объявляем массив
        String [] daysWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        System.out.println(daysWeek[0]);
        System.out.println(daysWeek[1]);
        System.out.println(daysWeek[2]);
        System.out.println(daysWeek[3]);
        System.out.println(daysWeek[4]);
        System.out.println(daysWeek[5]);
        System.out.println(daysWeek[6]);

        for (int i = 0; i < daysWeek.length; i++) {
            System.out.print(daysWeek[i] + "; ");

        }
        System.out.println();
        for (int i = daysWeek.length - 1; i >= 0; i--) {
            System.out.print(daysWeek[i] + "; ");

        }
        System.out.println();
        printWeekArabic(daysWeek); // вызываем метод и передаем в него массив, с которым он будет работать
    }


    public static void printWeekArabic(String[] week) {
        // print Sunday
        System.out.println("Печатаем при помощи метода начиная с воскресенья");
        System.out.print(week[6] + "; ");
        // print rest of the week in cycle
        for (int i = 0; i < week.length - 1; i++) {
            System.out.print(week[i] + "; ");
        }

    }
}
