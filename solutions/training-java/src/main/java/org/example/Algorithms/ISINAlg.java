package org.example.Algorithms;
import java.util.*;
public class ISINAlg {
    public static short algorithm(String rawisin){

        String isinCode;
        final int OFFSET = 55;

        isinCode = rawisin.toUpperCase();

        String[] chopCode = isinCode.split("");

        Vector<String> formatedCode = new Vector<String>();
        Vector<Integer> weight = new Vector<Integer>();
        int init = 2;

        //Formating to show the numbered string and creating weight array

        for (String element : chopCode) {
            char letter = element.charAt(0);
            if(letter >= 'A'){
                String value =Integer.toString(letter - OFFSET);
                formatedCode.add(value.substring(0,1));
                formatedCode.add(value.substring(1,2));
                if(init == 2){
                    weight.add(0,init);
                    weight.add(0,1);
                }else{
                    weight.add(0,init);
                    weight.add(0,2);
                }
            }else{
                formatedCode.add(element);
                if (init == 2){
                    weight.add(0,init);
                    init = 1;
                }else {
                    weight.add(0,init);
                    init = 2;
                }
            }
        }

        //Formating the product array into the correct numbers

        Vector<Integer> productModified = new Vector<Integer>();
        short total = 0;

        for(int i = 0; i < formatedCode.size(); i++){
            int product = Integer.parseInt(formatedCode.get(i)) * weight.get(i);
            if(product >= 10){
                String auxValue;
                auxValue = Integer.toString(product).substring(0,1);
                total += Integer.parseInt(auxValue);
                auxValue = Integer.toString(product).substring(1,2);
                total += Integer.parseInt(auxValue);
            }else{
                total += product;
            }
        }

        total %= 10;

        if (total == 0)
            return 0;
        else
            total = (short) (10 - total);
            return total;

    }
}
