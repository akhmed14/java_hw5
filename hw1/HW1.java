package seminar5.hw1;

import java.util.*;

public class HW1 {
    public static void main(String[] args) {
        String txt = "Россия идет вперед всей планеты. Планета - это не Россия.";
        txt = txt.replaceAll("[,.!()?]", "");
        String text = txt.toLowerCase();
        Map<String, Integer> str = new HashMap<>();
        String[] arr = text.split(" ");
        for (int i = 0; i < arr.length; i++) {
            if (!str.containsKey(arr[i])) {
                str.put(arr[i], 1);
            } else {
                str.put(arr[i], str.get(arr[i]) + 1);
            }
        }
        for (var entry : str.entrySet()) {
            System.out.println(entry.getKey() + " - данное слово встретилось: " + entry.getValue() + " раз(а)");
        }
    }
}

