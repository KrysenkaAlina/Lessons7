package com.company;

import static java.lang.Character.toUpperCase;

public class Main4 {
    public static void main(String[] args) {
        String newString = "Строка с пробелом";
        int num = 0;
        StringBuilder strnew = new StringBuilder();
        for (int i=0; i < newString.length();i++) {
            num++;
           char str = toUpperCase(newString.charAt(newString.length() - num));
            strnew.append(str);

        }
        System.out.println(strnew);
    }
}
