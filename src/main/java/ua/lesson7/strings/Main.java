package ua.lesson7.strings;

import java.sql.SQLOutput;
import java.util.SortedMap;

public class Main {
    public static void main(String[] args) {
        String str1 = "Bababduck";
        String str2 = new String("Babaduck");
        String str3 = new String("Babaduck").intern();

        int a = 110;
        String string = String.valueOf(a);

//        for (int i = 0; i < 300_000; i++) {
//            str1+=1;
//        }
//
//        System.out.println(str1 == str2);
//        System.out.println(str1 == str3);
//        System.out.println(str1.equals(str2));
//
//        System.out.println(str1.substring(1, str1.length()));
//        System.out.println(str1.contains("duck"));
//        System.out.println(str1.contains("Ba"));
//        System.out.println(str1.replaceAll("ab", "2"));
//        System.out.println(str1.toLowerCase());
//        System.out.println(str2.toUpperCase());
//        System.out.println(string);

        StringBuilder stringBuilder = new StringBuilder("wqe");

//        for (int i = 0; i < 1_200_000; i++) {
//            stringBuilder.append("1");
//        }
//
        stringBuilder.append("123");
        stringBuilder.append("gwdw");

        String string2 = stringBuilder.toString();
        System.out.println(stringBuilder);
        System.out.println();
    }
}
