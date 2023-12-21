package org.example.Algorithms;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ISRAELIAlg {
    public static int ROW_COUNT = 3;
    public static Scanner input = new Scanner(System.in);

    public static void encrypt() {
        String text;
        input.useDelimiter("\n");
        System.out.print("Insert text --> ");
        text = input.next();

        if (text.length() < 4) {
            System.out.println("Text should be more than 4 letters");
        } else {
            String result = algorithm(text);
            System.out.println(result);
        }
    }

    public static void decrypt(){
        String text;
        input.useDelimiter("\n");
        System.out.print("Insert text --> ");
        text = input.next();

        if (text.length() < 4) {
            System.out.println("Text should be more than 4 letters");
        } else {
            String result = algorithm(text);
            System.out.println(result);
        }
    }

    public static String algorithm(String text){
        text = text.toLowerCase();

        String parsedText[] = text.split("");

        int calc;
        if(text.length() % ROW_COUNT == 0){
            calc = text.length() / ROW_COUNT;
        }else{
            calc = text.length() / ROW_COUNT + 1;
        }

        String[][] normalText = new String[calc][ROW_COUNT];
        String[][] cypher = new String[ROW_COUNT][calc];

        int x = 0;
        int y = ROW_COUNT - 1;

        String encryption = "";

        int counter = 0;

        for (int i = 0; i < normalText.length; i++) {
            for (int j = 0; j < normalText[i].length; j++) {
                if (counter < text.length()) {
                    String letter = parsedText[counter];
                    normalText[i][j] = letter;
                    counter++;
                } else {
                    normalText[i][j] = " ";
                }
            }
        }

        for(int i = 0; i < cypher.length; i++){
            for(int j = 0; j < normalText.length; j++){
                cypher[i][j] = normalText[j][i];
            }
        }


        for(int i = 0; i < normalText.length; i++){
            for (int j = cypher.length - 1; j >= 0; j--){
                encryption += cypher[j][i];
            }
        }

        return encryption;
    }

    public static void menu(){
        int option = -1;

        System.out.println("\nWelcome to the decrypter");

        do {
            if (option != -1) {
                System.out.println("Try again!!");
            }
            System.out.println("What you want to do? \n");
            System.out.println("1) Encrypt Text");
            System.out.println("2) Decrypt Text");
            System.out.println("3) Exit");
            System.out.print("Choose an option --> ");

            try {
                option = Integer.parseInt(input.nextLine());
            }catch (NumberFormatException e){
                System.out.println("You must input a number");
                option = -1;
                continue;
            }

            switch (option) {
                case 1:
                    encrypt();
                    break;

                case 2:
                    decrypt();
                    break;

                case 3:
                    System.out.println("BYEEEE!!!!!");
                    System.exit(0);
                    break;

                default:
                    System.out.println("You must input a number");
                    break;

            }
            option = -1;
        } while (option < 1 || option > 3);

    }
}
