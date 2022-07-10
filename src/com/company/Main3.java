package com.company;

public class Main3 {
    public static void main(String[] args) {
        String newString = "Строка с пробелом   ап   отот";
        int count=0;
        StringBuilder strnew = new StringBuilder(newString);
        if (newString.length() != 0){
            count++;
           }
             for (int i=0; i < strnew.length();i++)
                  if(strnew.charAt(i) == ' ' && strnew.charAt(i+1) != ' '){
                     count++;
                  };
        System.out.println(count);
    }

}
