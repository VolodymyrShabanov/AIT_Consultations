package task1;

// Created by Volodymyr Sh on 25.10.2023
// project name: AIT_Consultations
public class Main {

    public static void main(String[] args) {
        BoxSimple boxSimpleInteger = new BoxSimple(1);
        Integer resulSimpleIntBox = boxSimpleInteger.getCounter();
        System.out.println(resulSimpleIntBox);

        BoxSimpleString boxSimpleString = new BoxSimpleString("string");
        System.out.println(boxSimpleString.getCounter());


        BoxSimpleCar boxSimpleCar = new BoxSimpleCar(new Car("Audi"));
        System.out.println(boxSimpleString.getCounter());

    }


}
