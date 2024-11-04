package kitm;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[11];

        String[] studentas = {"Jonas", "tadas", "Ieva", "Toma"};

        for(String student : studentas)
        {
            System.out.println(student);
        }

        for(int i = 0; i < numbers.length; i++)
        {
            numbers[i] = new Random().nextInt(100);
        }

        System.out.println(Arrays.toString(numbers));


//        for(int i = 0; i < studentas.length; i++)
//        {
//            System.out.println(studentas[i]);
//        }

//        boolean[] statusCodes = new boolean[10];
//
//        System.out.println(Arrays.toString(statusCodes));
//
//        String[] user = new String[5];
//
//        System.out.println(Arrays.toString(user));
//
//        char[] letters = new char[5];
//        System.out.println(Arrays.toString(letters));
//
//        double[] values = new double[8];
//
//        System.out.println(Arrays.toString(values));
    }
}