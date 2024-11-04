package kitm;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Iveskite kiek sveciu: ");

        int sveciuNr = input.nextInt();

        System.out.println("Iveskite kiek sveciu yra Blackliste: ");

        int BlackNr = input.nextInt();

        String[] sveciuVardai = new String[sveciuNr];
        String[] blackList = new String[BlackNr];
        input.nextLine();

        System.out.println("Iveskite Blackliste narius: ");

        for (int i = 0; i < BlackNr; i++)
        {
            blackList[i] = input.nextLine();
        }

        System.out.println("Iveskite narius: ");

        for (int i = 0; i < sveciuNr; i++)
        {
            sveciuVardai[i] = input.nextLine();

            for(String vard : blackList)
            {
                if (vard.equals(sveciuVardai[i]))
                {
                    sveciuVardai[i] += " BlackListed";
                }
            }
        }

        for (int i = 0; i < sveciuNr; i++)
        {
            System.out.println(i+1 + ". " + sveciuVardai[i]);

        }

        input.close();
//        for(String student : studentas)
//        {
//            System.out.println(student);
//        }
//
//        for(int i = 0; i < numbers.length; i++)
//        {
//            numbers[i] = new Random().nextInt(100);
//        }
//
//        System.out.println(Arrays.toString(numbers));


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