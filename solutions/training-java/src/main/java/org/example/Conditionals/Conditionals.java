package org.example.Conditionals;
import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args){

        //2.5

        Scanner input = new Scanner(System.in);

        int num = (int) Math.floor(Math.random()*100+1);
        int diference1, diference2;

        System.out.println("Think a number between 1-100. Whichever gets closer wins");
        System.out.println("Player 1, your number");
        int number1 = 0;
        try{
            number1 = Integer.parseInt(input.nextLine());
        }catch (NumberFormatException e){
            System.out.println("You must enter a number");
            return;
        }


        System.out.println("Player 2, your number");
        int number2 = 0;
        try {
            number2 = Integer.parseInt(input.nextLine());
        }catch (NumberFormatException e){
            System.out.println("You must enter a number");
            return;
        }

        System.out.println("Thank you very much! I will now compare your numbers with mine.");

        diference1 = number1 - num;
        diference2 = number2 - num;

        if(diference1 < 0)
            diference1 = -diference1;

        if(diference2 < 0)
            diference2 = -diference2;

        if(diference1 < diference2){
            System.out.println("Since my number was " + num + ", player 1 wins");
        }else{
            System.out.println("Since my number was " + num + ", player 2 wins");
        }
    }
}
