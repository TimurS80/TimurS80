package java1;

import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) { //создание объекта ввода
        System.out.println("Введите значение  трёх чисел");
        Scanner scanner = new Scanner(System.in);
        //инициализация переменной из ввода
        int a = scanner.nextInt();// вывод и сохр мл разряда
        int b = scanner.nextInt();// вывод и сохр мл разряда
        int c = scanner.nextInt();// вывод и сохр мл разряда
        int y = (a + b + c )/ 3;
        System.out.println("среднее арифмитическое  =" + y);

    }
}