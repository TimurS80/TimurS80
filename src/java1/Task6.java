package java1;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) { //создание объекта ввода
        System.out.println("Введите значение  числа и его степени");
        Scanner scanner = new Scanner(System.in);
        //инициализация переменной из ввода
        int a = scanner.nextInt();// вывод и сохр мл разр
        int b = scanner.nextInt();// вывод и сохр мл разряда
        long y;
        y = (long) Math.pow(a,b);

        System.out.println("число в степни  =" + y);

    }
}
