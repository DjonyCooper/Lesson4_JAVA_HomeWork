import java.util.Random;
import java.util.LinkedList;
import java.util.Collections;
import java.util.List;;

// Пусть дан LinkedList с несколькими элементами. Реализуйте метод(не void), который вернет “перевернутый” список.

public class task001 {
    public static List<Integer> reverseList(List<Integer>list) {
        List<Integer>reverse = new LinkedList<Integer>(list);
        Collections.reverse(reverse);
        return reverse;
    }
    public static void main(String[] args) {
        Random rnd_arr = new Random();
        LinkedList<Integer> first_list = new LinkedList<Integer>();
        for (int i = 0; i < 10; i++) {
            int val = rnd_arr.nextInt(100);
            first_list.add(val);
        }
        System.out.printf("Целочисленный список: %s\n", first_list);
        List<Integer> reverse = reverseList(first_list);
        System.out.printf("Реверсивный список: %s\n", reverse);
    }
}