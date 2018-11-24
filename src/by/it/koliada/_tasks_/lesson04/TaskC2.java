package by.it.koliada._tasks_.lesson04;

import java.util.Scanner;

/*

На входе вводится число и месяц 2018 года.
Программа должна выводить номер дня года, считая 1 января первым днем,
а 31 декабря 365-м.

Пример:
Ввод:
1 1

Вывод
1

Ввод:
31 12

Вывод
365

Ввод:
13 9

Вывод
256

 */
public class TaskC2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int d = scanner.nextInt();
        int m = scanner.nextInt();
        int a,b,c;
        a=31;
        b=28;
        c=30;
                switch (m){
            case 1: System.out.println(d); break;
            case 2: System.out.println(a+d); break;
            case 3: System.out.println(a+b+d); break;
            case 4: System.out.println(a+b+a+d); break;
            case 5: System.out.println(a+b+a+c+d); break;
            case 6: System.out.println(a+b+a+c+a+d); break;
            case 7: System.out.println(a+b+a+c+a+a+d); break;
            case 8: System.out.println(a+b+a+c+a+a+c+d); break;
            case 9: System.out.println(a+b+a+c+a+a+c+a+d); break;
            case 10: System.out.println(a+b+a+c+a+a+c+a+c+d); break;
            case 11: System.out.println(a+b+a+c+a+a+c+a+c+a+d); break;
            case 12: System.out.println(a+b+a+c+a+a+c+a+c+a+c+d); break;
                    }
    }
}