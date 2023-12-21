package org.example.Loops;

public class Loop {
    public static void main(String[] args) {
        //4.1.d
        /*int counter = 2;
        for(int i = 1; i <= 19; i++){
            if(i > 10){
                System.out.print(i-counter + " ");
                counter += 2;
            }else{
                System.out.print(i + " ");
            }
        }*/

        //4.2

        /*for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                System.out.println("Number " + i + ", divisible by 3 and 4");
            } else if (i % 4 == 0) {
                System.out.println("Number " + i + ", divisible by 4");
            } else if (i % 3 == 0) {
                System.out.println("Number " + i + ", divisible by 3");
            } else {
                System.out.println("Number " + i);
            }
        }*/

        //4.4.a
        /*int number, counter = 0;
        do{
            number = (int) Math.floor(Math.random()*6+1);
            System.out.println(number);
            counter++;
        }while (number != 6);

        System.out.println("Number of tries --> " + counter);*/

        //4.4.b
        int number, counter = 0, repeat = 0;

        do{
            number = (int) Math.floor(Math.random()*6+1);
            System.out.println(number);
            counter++;

            if(number == 6){
                repeat++;
            }else{
                repeat = 0;
            }

        }while (repeat != 2);

        System.out.println("Number of tries --> " + counter);
    }
}
