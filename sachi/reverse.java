package org.sachi;

import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a name to reverse: ");
        String name = scanner.nextLine();

        String reversedName = reverseString(name);

        System.out.println("Reversed name: " + reversedName);

        scanner.close();
    }

    public static String reverseString(String str) {
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        return reversed;
    }
}

