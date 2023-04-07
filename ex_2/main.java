package Homework.Homework_4.ex_2;

public class main {
    public static void main(String[] args) {
        Func func = new Func();
        func.add(6);
        func.add(34);
        func.add(87);
        func.enqueue(78);
        func.printList();
        System.out.println(func.dequeue());
        func.printList();
        System.out.println(func.first());
        func.printList();

    }
}
