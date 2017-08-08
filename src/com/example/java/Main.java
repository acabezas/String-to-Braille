package com.example.java;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a text: ");
        String st1 = scanner.nextLine();
        System.out.println(stringToBraille(st1));
    }
    public static String stringToBraille(String input)
    {
        Map<Character, String> alphabet = new HashMap();
        alphabet.put('a',"100000");
        alphabet.put('b',"110000");
        alphabet.put('c',"100100");
        alphabet.put('d',"100110");
        alphabet.put('e',"100010");
        alphabet.put('f',"110100");
        alphabet.put('g',"110110");
        alphabet.put('h',"110010");
        alphabet.put('i',"010100");
        alphabet.put('j',"010110");
        alphabet.put('k',"101000");
        alphabet.put('l',"111000");
        alphabet.put('m',"101100");
        alphabet.put('n',"101110");
        alphabet.put('o',"101010");
        alphabet.put('p',"111100");
        alphabet.put('q',"111110");
        alphabet.put('r',"111010");
        alphabet.put('s',"011100");
        alphabet.put('t',"011110");
        alphabet.put('u',"101001");
        alphabet.put('v',"111001");
        alphabet.put('w',"010111");
        alphabet.put('x',"101101");
        alphabet.put('y',"101111");
        alphabet.put('z',"101011");
        alphabet.put(' ',"000000");

        String output = "";

        char arr[] = input.toCharArray();
        try {
            for (int i = 0; i < arr.length; ++i) {
                if(Character.isUpperCase(arr[i]))
                    output +="000001";
                output += alphabet.get(Character.toLowerCase(arr[i]));
            }
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.print("The system has suffered an error.");
            System.exit(0);
        }
        return output;
    }
}
