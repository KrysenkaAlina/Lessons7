package com.company;

public class Main {

    public static void main(String[] args) {
        String newString = "Строка с пробелом";
        System.out.println(str1(newString));

    }

    static StringBuilder str1 (String str1){
        StringBuilder strnew = new StringBuilder(str1);
         for (int i=0; i < strnew.length();i++)
             if(strnew.charAt(i) == ' '){
                 strnew.replace(i,i+1,"");

             };
        return  strnew;
    }



}
