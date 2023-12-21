package org.example.Interfaces;

public class Interfaces {
    public interface Flyable{
        void currentLocation(double x, double y);
        int speed(int x);
        void destination(String country);
    }

    public static class Plane implements Flyable{
        public double LocationX;

        public double LocationY;

        public String Destination;


        public Plane() {
            LocationX = 0.0;
            LocationY = 0.0;
            Destination = "";
        }

        @Override
        public void currentLocation(double x, double y) {
            LocationX = x;
            LocationY = y;
        }

        @Override
        public int speed(int x) {
            return x;
        }

        @Override
        public void destination(String country) {
            Destination = country;
        }

        @Override
        public String toString() {
            StringBuilder str = new StringBuilder();
            str.append("Plane{");
            str.append("LocationX=" + LocationX + ", ");
            str.append("LocationY=" + LocationY + ", ");
            str.append("Speed= " + speed(500));
            str.append("Destination='" + Destination + "}");

            return str.toString();
        }
    }

    public interface Driveable{
        void drive(int speed);
        String brake();
    }

    public static class Car implements Driveable{
        @Override
        public void drive(int speed) {
            System.out.println("The car is driving about " + speed + " km/h");
        }

        @Override
        public String brake() {
            return "The car is braking";
        }
    }

    public static class Train implements Driveable{
        @Override
        public void drive(int speed) {
            System.out.println("The train is driving about " + speed + " km/h");
        }

        @Override
        public String brake() {
            return "The train is braking";
        }
    }

    public static void main(String[] args) {

        //11.1

        /*Plane AJ13 = new Plane();
        AJ13.currentLocation(35.4982813, 50.2131756);
        AJ13.destination("Spain");
        System.out.println(AJ13.toString());*/

        //11.2
        Car newcar = new Car();
        Train newtrain = new Train();

        newcar.drive(120);
        newtrain.drive(350);
        System.out.println(newcar.brake());
        System.out.println(newtrain.brake());
    }
}
