package ru.job4j.collection;

import java.util.HashSet;

public class UniqueText {
    public static boolean isEquals(String originText, String duplicateText) {
        boolean rsl = true;
        String[] origin = originText.split(" ");
        String[] text = duplicateText.split(" ");
        HashSet<String> check = new HashSet<>();
        for (String origCheck : origin) {
            check.add(origCheck);
        }
        for (String textCheck : text) {
            if (!check.contains(textCheck)) {
                rsl = false;
                break;
            }
        }
        return rsl;
    }
}