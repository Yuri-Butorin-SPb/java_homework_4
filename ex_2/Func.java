package Homework.Homework_4.ex_2;

import java.util.LinkedList;

/*
 * Реализуйте очередь с помощью LinkedList со следующими методами:
 * enqueue() - помещает элемент в конец очереди
 * dequeue() - возвращает первый элемент из очереди и удаляет его
 * first() - возвращает первый элемент из очереди, не удаляя
 */
public class Func {
    LinkedList<Integer> linkedList = new LinkedList<>();

    void add(int var) {
        linkedList.add(var);
    }

    void enqueue(int var) {
        linkedList.addLast(var);
    }

    void printList() {
        System.out.println(linkedList);
    }

    int dequeue() {
        return linkedList.removeFirst();
    }

    int first() {
        return linkedList.getFirst();
    }
}
