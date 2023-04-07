package Homework.Homework_4.ex_3;

import java.util.LinkedList;
import java.util.Random;

public class main {
    public static void main(String[] args) {
        /*
         * Найдите сумму всех элементов LinkedList, сохраняя все элементы в списке.
         * Используйте итератор
         */

        int n = 5;

        LinkedList<Integer> list = new LinkedList<>();

        Random random = new Random();
        for (int i = 0; i < n; i++) {
            list.add(random.nextInt(10));
        }

        int result = 0;
        for (Integer integer : list) {
            result += integer;
        }

        System.out.println("Начальный список: " + list);
        System.out.println("Сумма чисел: " + result);

    }
}
