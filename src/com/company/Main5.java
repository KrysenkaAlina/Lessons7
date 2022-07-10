package com.company;

public class Main5 {
    public static void main(String[] args) {
        String string = "Строка с пробелом";
        char[] array = string.toCharArray();
      int i = 0, j = array.length - 1;
          while (i < j) {
          char t = array[i];
          array[i] = array[j];
          array[j] = t;
          i++;
          j--;
          }
          System.out.println(String.valueOf(array));
      }
    }
