package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String[] names = new String[3];
        names[0] = "Mirzat";
        names[1] = "Marat";
        names[2] = "Akbar";

        for (String newNames:names) {
            System.out.println(newNames);
            String name = "Mirzat";

            switch (name) {
                case "Mirzat":
                System.out.println("Mirzat " + "Доброе утро");
                case "Marat":
                    System.out.println("Mirzat " + "Добрый день");
                case "Akbar":
                    System.out.println("Mirzat " + "Добрый вечер");
                    break;
                default:

            }
        }

    }
}
