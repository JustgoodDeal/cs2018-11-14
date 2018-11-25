package by.it.koliada._tasks_.lesson05;

/* Массив из чисел в обратном порядке
1. Создать массив на 10 чисел.
2. Ввести с клавиатуры 10 целых чисел и записать их в массив.
3. Найти минимальный и максимальный элементы массива.
4. Вывести эти два элемента на экран, через пробел.

Например, для такого ввода
1 2 3 4 5 6 7 8 9 0

вывод ожидается такой
0 9
*/

import java.util.Scanner;

public class TaskA3 {
    public static void main(String[] args) {
        int[] mas = new int[10];
        int min, max;
        Scanner scanner = new Scanner(System.in);
        mas[0] = scanner.nextInt();
        mas[1] = scanner.nextInt();
        mas[2] = scanner.nextInt();
        mas[3] = scanner.nextInt();
        mas[4] = scanner.nextInt();
        mas[5] = scanner.nextInt();
        mas[6] = scanner.nextInt();
        mas[7] = scanner.nextInt();
        mas[8] = scanner.nextInt();
        mas[9] = scanner.nextInt();
        min = max = mas[0];
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] < min) min = mas[i];
            if (mas[i] > max) max = mas[i];
        }
        System.out.print(min + " " + max);

    }
}
