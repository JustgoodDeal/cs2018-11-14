package by.it.koliada._tasks_.lesson05;

/* Задачка на сортировку
Задача: Написать программу, которая вводит с клавиатуры 20 чисел
и выводит их в убывающем порядке. Скорость O(n*n).
*/

import java.util.Scanner;

public class TaskC2 {
    //Напишите тут ваш код
    public static void main(String[] args) {
        int[] m = new int[20];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < m.length; i++) {
            m[i] = scanner.nextInt();
        }
    sort(m);
        for (int x : m)
    {
        System.out.println(x);
    }
}
    public static void sort(int[] m) {
        //Напишите тут ваш код
        int puz;
        for (int a = 0; a < m.length; a++)
            for (int j = 0; j < m.length; j++) {
                if (m[a] > m[j]) {
                    puz = m[j];
                    m[j] = m[a];
                    m[a] = puz;
                }
            }
    }

}