package by.it.koliada._tasks_.lesson05;
/*
Три массива
1.  Введите с клавиатуры 20 чисел, сохраните их в список и рассортируйте по трём другим спискам:
    Число делится на 3 (x%3==0), делится на 2 (x%2==0) и все остальные.
    Числа, которые делятся на 3 и на 2 одновременно, например 6, попадают в оба списка.
2.  Статический метод void printList(List<Integer> list) должен выводить на экран
    все элементы переданного ему списка list, каждый элемент - с новой строки.
3.  Используя метод printList выведите ваши три списка на экран.
    Сначала тот, который для x%3, потом тот, который для x%2, потом последний.
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TaskC1 {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();
        ArrayList<Integer> list4 = new ArrayList<>();
        int[]m =new int[20];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i <m.length; i++) {
            m [i] = scanner.nextInt();
        }
        for (int i = 0; i < m.length; i++) list1.add (m[i]);

        for (int i = 0; i < list1.size(); i++) {
            int h=list1.get(i);
            if (h % 2 == 0 && h % 3 == 0) {
                list2.add(h);
                list3.add(h); }
            else if (h % 2 == 0)
                list2.add(h);
            else if (h % 3 == 0)
                list3.add(h);
            else list4.add(h);
        }
        printList(list3);
        printList(list2);
        printList(list4);
    }
    private static void printList(List<Integer> list){
        for (int i = 0; i < list.size(); i++)
        {
            System.out.println(list.get(i));
        }
    }
}