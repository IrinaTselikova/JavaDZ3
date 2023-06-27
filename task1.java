/*
Пусть дан произвольный список целых чисел.
1) Найти минимальное значение
2) Найти максимальное значение
3) Найти среднее ариф. значение
4) Нужно удалить из него чётные числа
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class task1 {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>(Arrays.asList(5, 6, 10, 2, 4, 9, 1, 3));
        System.out.println("дан список: " + al);
        System.out.println("максимальное значение: " +Collections.max(al));
        System.out.println("минимальное значение: " + Collections.min(al));
        int length = al.size();
       
        double sum = 0;
        for (int i : al) {
            sum += i;          
        }
        System.out.println("среднее ариф. значение: " + sum/length);

        for (int i = 0; i < al.size(); i++) {
            if (al.get(i) % 2 == 0) {
                al.remove(i);
                i--;
            } 
        }
        System.out.println("список без четных чисел: " + al); 
    }
}