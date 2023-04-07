package Homework.Homework_4.ex_1;

import java.util.LinkedList;

public class main {
    public static void main(String[] args) {
        // Пусть дан LinkedList с несколькими элементами.
        // Реализуйте метод, который вернёет «перевёрнутый» список.

        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(4);
        linkedList.add(76);
        linkedList.add(23);
        linkedList.add(1);
        linkedList.add(87);
        linkedList.add(7);
        System.out.println(linkedList);
        System.out.println(invertList(linkedList));
    }

    static LinkedList<Integer> invertList(LinkedList<Integer> item) {
        LinkedList<Integer> resualtList = new LinkedList<>();
        // int last = item.getLast();
        for (int i = 0, j = item.size() - 1; i < item.size(); i++, j--) {
            resualtList.add(i, item.get(j));
            // last--;
        }

        return resualtList;
    }

}
