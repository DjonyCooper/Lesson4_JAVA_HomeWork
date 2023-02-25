// Реализуйте очередь с помощью LinkedList со следующими методами:
// enqueue() - помещает элемент в конец очереди,
// dequeue() - возвращает первый элемент из очереди и удаляет его,
// first() - возвращает первый элемент из очереди, не удаляя.

import java.util.LinkedList;
import java.util.Random;

public class task002 {
    public static void main(String[] args) {
        Random rnd_arr = new Random();
        LinkedList<Integer> list = new LinkedList<Integer>();
        for (int i = 0; i < 10; i++) {
            int val = rnd_arr.nextInt(100);
            list.add(val);
        }
        System.out.printf("Целочисленный список: %s\n", list);
        System.out.printf("Случайный элемент списка: %s\n", enqueue(list));
        System.out.printf("Новый список, с выбранным элементом в конце: %s\n", list);
        System.out.printf("Первый элемент получившегося списка: %s\n", dequeue(list));
        System.out.printf("Новый список без первого элемента: %s\n", list);
        System.out.printf("Первый элемент нового списка: %s\n", first(list));
        System.out.printf("Проверка, что первый элемент нового списка не удален: %s\n", list);
    }

    public static int enqueue(LinkedList<Integer> list) {
        Random random = new Random();
        int num = list.get(random.nextInt(list.size()));
        list.addLast(num);
        return num;
    }

    public static int dequeue(LinkedList<Integer> list) {
        int num = list.get(0);
        list.remove(0);
        return num;
    }

    public static int first(LinkedList<Integer> list) {
        int num = list.get(0);
        return num;
    }
}
