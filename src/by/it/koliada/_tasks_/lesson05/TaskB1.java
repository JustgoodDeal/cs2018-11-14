package by.it.koliada._tasks_.lesson05;
/*
Создайте 5 различных строк в списке ArrayList:

1. Создайте список строк.
2. Добавьте в него 5 различных строк.
3. Выведите его размер на экран.
4. Используя цикл выведите его содержимое на экран, каждое значение с новой строки.

*/
import java.util.ArrayList;

public class TaskB1 {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<>();
        array.add("Oups!");
        array.add("I");
        array.add("Did");
        array.add("It");
        array.add("Again");
        System.out.println(array.size());
                for (int i = 0; i < array.size(); i++) {
                    System.out.println (array.get(i));
        }

    }
}
