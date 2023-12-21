package org.example.Exceptions;

public class Exceptions {
    public static class IllegalOverDraftException extends Exception{
        public IllegalOverDraftException(){
            super("You have reached your overdraft limit!");
        }
    }


    public static class Bank{
        private static int DISPOLIMIT = 1000;
        private double account_balance;

        public void withdraw(double amount) throws IllegalOverDraftException{
            if(amount > DISPOLIMIT){
                throw new IllegalOverDraftException();
            }else{
                if(amount > account_balance){
                    System.out.println("You cant withdraw that amount");
                }else{
                    account_balance -= amount;
                }

            }
        }

        public void deposit(double amount){
            account_balance += amount;
        }

        public double accountBalanceQuery(){
            return account_balance;
        }
    }

    public static void main(String[] args) {
        Bank mybank = new Bank();

        mybank.deposit(100.0);
        System.out.println(mybank.accountBalanceQuery());

        try {
            mybank.withdraw(1000.1);
        }catch (IllegalOverDraftException exception){
            System.err.println(exception.getMessage());
        }

        System.out.println(mybank.accountBalanceQuery());
    }
}
