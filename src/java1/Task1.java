package java1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) { //создание объекта ввода
        System.out.println("ВВедите значение");
        Scanner scanner = new Scanner(System.in);
        //инициализация переменной из ввода
        int x = scanner.nextInt();// вывод и сохр мл разряда
        int y = x % 10;
        System.out.println("Result =" + y);

     }
}
