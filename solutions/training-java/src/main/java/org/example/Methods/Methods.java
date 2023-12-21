package org.example.Methods;
import java.util.Scanner;

public class Methods {
    //5.1
    public static String BMIclasification(double b_m_i){
        String result = "";
        if(b_m_i < 18.5){
            result = "You are Underweight";
        }else if(b_m_i >= 18.5 && b_m_i <= 24.9){
            result = "You are on Healthy Weight";
        }else if(b_m_i >= 25 && b_m_i <= 29.9){
            result = "You have Overweight";
        }else if(b_m_i >= 30 && b_m_i < 40){
            result = "You have Obesity";
        }else if(b_m_i >= 40){
            result = "You have Class 3 Obesity";
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("BMI CALCULATOR");

        System.out.println("Input your body weight");
        double weight = 0.0;
        try{
            weight = Double.parseDouble(input.nextLine());
        }catch (NumberFormatException e){
            System.err.println("You must enter a number");
            return;
        }

        System.out.println("Input your height (cm)");
        double height = 0.0;

        try{
            height = Double.parseDouble(input.nextLine());
        }catch (NumberFormatException e){
            System.err.println("You must enter a number");
            return;
        }

        height /= 100;

        double b_m_i = weight / Math.pow(height, 2);

        System.out.println("Your BMI is " + b_m_i);
        System.out.println(BMIclasification(b_m_i));
    }
}
