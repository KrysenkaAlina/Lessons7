package com.company;

import static java.lang.Character.toUpperCase;

public class Main2 {

    public static void main(String[] args) {
        String newString = "Строка с проббббелом";
        StringBuilder strnew = new StringBuilder(newString);
        StringBuilder result = new StringBuilder();
        for (int i=0; i < strnew.length();i++)
            if(strnew.charAt(i) == ' '){
                strnew.replace(i,i+1,"");
            };
        for (int i = 0; i < strnew.length(); i++) {
             char str = toUpperCase(strnew.charAt(i));
               for (int j=i+1; j<strnew.length(); j++){
                   if (toUpperCase(strnew.charAt(j)) == str) {
                       int index1 = result.indexOf(String.valueOf(strnew.charAt(j)));
                       if (index1 < 0 ) {
                           result.append(strnew.charAt(j) + ",");
                       }
                   }
               }
        }
        System.out.println(result.substring(0, result.length() - 1));
    }


}
