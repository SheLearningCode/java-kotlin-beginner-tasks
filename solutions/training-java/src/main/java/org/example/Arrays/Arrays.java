package org.example.Arrays;
import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        //8.2
        Scanner input = new Scanner(System.in);
        System.out.println("Palyndrome Checker");
        System.out.print("Insert word --> ");
        String phrase = input.nextLine();
        char[] splited = phrase.toLowerCase().toCharArray();
        boolean palindrome = true;

        for(int i = 0; i < splited.length / 2 && palindrome; i++){
            if(splited[i] != splited[splited.length -1 - i]){
                palindrome = false;
            }
        }

        if(palindrome){
            System.out.println("The word " + phrase + " is a palindrome");
        }else{
            System.out.println("The word " + phrase + " is not a palindrome");
        }
    }
}
