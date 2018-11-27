package by.it.koliada._tasks_.lesson05;

/* Задачка на сортировку2
Задача: Написать программу, которая вводит с клавиатуры 20 чисел
и выводит их в убывающем порядке. Скорость O(n log n)
*/

import java.util.Scanner;

public class TaskC3 {
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
        int j=0, i=0;
        while (i<m.length){
            int max = m[i];
            j++;
            while (j<m.length){
                if (max<m[j]) {
                    int buf = max;
                    m[i]=max=m[j];
                    m[j]=buf;
                }
                j++;
            }
            i++;
            j=i;
        }
    }
}









