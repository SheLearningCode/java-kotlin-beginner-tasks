package org.example.Inheritance;

public class Inheritance {

    static class Vehicle{
        String motorLord;

        Vehicle(){
            this.motorLord = "";
        }

        Vehicle(String motorLord){
            this.motorLord = motorLord;
        }

        @Override
        public String toString(){
            return "The owner of the Vehicle is " + motorLord;
        }
    }

    static class Motorcycle extends Vehicle{
        String colour;
        String plateNumber;

        Motorcycle(String colour, String plateNumber){
            this.colour = colour;
            this.plateNumber = plateNumber;
            super.motorLord = "Pedro Pelegrina";
        }

        @Override
        public String toString() {
            return "Motorcycle{" +
                    "colour='" + colour + '\'' +
                    ", PlateNumber='" + plateNumber + '\'' +
                    ", MotorLord='" +  super.toString()+ '\'' +
                    '}';
        }
    };

    static class Car extends Vehicle{
        String colour;
        String plateNumber;

        Car(String colour, String plateNumber){
            this.colour = colour;
            this.plateNumber = plateNumber;
            super.motorLord = "Pedro Pelegrina";
        }

        @Override
        public String toString() {
            return "Car{" +
                    "colour='" + colour + '\'' +
                    ", PlateNumber='" + plateNumber + '\'' +
                    ", MotorLord='" +  super.toString()+ '\'' +
                    '}';
        }
    };

    static class Truck extends Vehicle{
        String colour;
        String plateNumber;

        Truck(String colour, String plateNumber){
            this.colour = colour;
            this.plateNumber = plateNumber;
            super.motorLord = "Pedro Pelegrina";
        }

        @Override
        public String toString() {
            return "Truck{" +
                    "colour='" + colour + '\'' +
                    ", PlateNumber='" + plateNumber + '\'' +
                    ", MotorLord='" +  super.toString()+ '\'' +
                    '}';
        }
    };


    public static void main(String[] args) {
        Motorcycle yamaha = new Motorcycle("Red", "123 ASSD");
        Car bmw = new Car("Blue", "456 FGH");
        Truck jeep = new Truck("Yellow", "789 QWE");

        System.out.println(yamaha.toString());
        System.out.println(bmw.toString());
        System.out.println(jeep.toString());
    }
}
