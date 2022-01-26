package java1;

import java.util.Scanner;

public class Task8_1 {
    public static void main(String[] args) { //создание объекта ввода

    System.out.println("Введите курс доллара, евро и Ваши сбережения в рублях");
    Scanner scanner = new Scanner(System.in);
    //инициализация переменной из ввода
    double rateDollar = scanner.nextDouble();// ввод курса доллара
    double rateEuro = scanner.nextDouble();// ввод курса евро
    int many = scanner.nextInt();// ВВОД ВАШИХ ДЕНЮЖЕК
    double y = many / rateDollar;
    double x = many / rateEuro;
    System.out.println("Ваши сбережения в Баксах  =" + y);
    System.out.println("Ваши сбережения в Евро  =" + x);
}
}
