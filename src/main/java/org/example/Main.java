package org.example;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        System.out.println(checkForPalindrome("I did, did I?"));
        System.out.println(checkForPalindrome("Racecar"));
        System.out.println(checkForPalindrome("hello"));

        System.out.println(convertDecimalToBinary(5));
        System.out.println(convertDecimalToBinary(6));
        System.out.println(convertDecimalToBinary(13));
    }

    // Palindrome kontrolü
    public static boolean checkForPalindrome(String text) {

        if (text == null) return false;

        text = text.toLowerCase().replaceAll("[^a-z0-9]", "");

        Stack<Character> stack = new Stack<>();

        for (char c : text.toCharArray()) {
            stack.push(c);
        }

        String reversed = "";

        while (!stack.isEmpty()) {
            reversed += stack.pop();
        }

        return text.equals(reversed);
    }

    // Decimal -> Binary çevirme
    public static String convertDecimalToBinary(int number) {

        if (number == 0) return "0";

        Stack<Integer> stack = new Stack<>();

        while (number > 0) {
            stack.push(number % 2);
            number = number / 2;
        }

        String binary = "";

        while (!stack.isEmpty()) {
            binary += stack.pop();
        }

        return binary;
    }
}