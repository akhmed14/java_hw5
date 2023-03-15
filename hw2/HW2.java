package seminar5.hw2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class HW2 {
    public static void main(String[] args) {
        String txt = "Россия идет вперед всей планеты. Планета - это не Россия. " +
                "Россия может стать планетой если вся планета будет россией";
        txt = txt.replaceAll("[,.!()?:;/]", "");
        String text = txt.toLowerCase();
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите слово для подсчета нахождений");
        String keySlovo = sc.nextLine().toLowerCase();
        Map<String, Integer> str = new HashMap<>();
        String[] arr = text.split(" ");
        for (int i = 0; i < arr.length; i++) {
            if (!str.containsKey(arr[i])) {
                str.put(arr[i], 1);
            } else {
                str.put(arr[i], str.get(arr[i]) + 1);
            }
        }
        System.out.printf("Слово [%s] в тексте встречается [%d] раз(а)%n", keySlovo, str.get(keySlovo));
    }
}
