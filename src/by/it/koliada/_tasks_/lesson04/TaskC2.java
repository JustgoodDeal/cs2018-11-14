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
        int n=31;
                        switch (m){
            case 1: System.out.println(d); break;
            case 2: System.out.println(n+d); break;
            case 3: System.out.println(2*n-3+d); break;
            case 4: System.out.println(3*n-3+d); break;
            case 5: System.out.println(4*n-3-(1*1)+d); break;
            case 6: System.out.println(5*n-3-(1*1)+d); break;
            case 7: System.out.println(6*n-3-(1*2)+d); break;
            case 8: System.out.println(7*n-3-(1*2)+d); break;
            case 9: System.out.println(8*n-3-(1*2)+d); break;
            case 10: System.out.println(9*n-3-(1*3)+d); break;
            case 11: System.out.println(10*n-3-(1*3)+d); break;
            case 12: System.out.println(11*n-3-(1*4)+d); break;
                    }
    }
}