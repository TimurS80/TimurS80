package java1;

import java.util.Scanner;

public class Task7 {

    public static void main(String[] args) { //создание объекта ввода
        System.out.println("Введите значение  радиуса окружности");
        Scanner scanner = new Scanner(System.in);
        //инициализация переменной из ввода
        double a = scanner.nextDouble();// вывод и сохр радиуса окружности
        double Pi = 3.14;
        double b = (2 * Pi * a);// вывод длинны окружности
        double y = a * a * Pi;// вывод площади окружности
        System.out.println("Длинна окружности  =" + b + " Площадь =" + y);

    }
}