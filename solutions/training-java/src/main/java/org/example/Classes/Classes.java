package org.example.Classes;

public class Classes {
    public static class Person{
        private String name = "";
        private int age = 0;
        private int weight = 0;
        private int height = 0;

        Person(String name, int age, int weight, int height){
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.height = height;
        }

        public String checkMajority(){
            String chain;

            if(this.age >= 18){
                chain = this.name + " have age majority";
            }else{
                chain = this.name + " have no age majority";
            }
            return chain;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public int getWeight() {
            return weight;
        }

        public int getHeight() {
            return height;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public void setWeight(int weight) {
            this.weight = weight;
        }

        public void setHeight(int height) {
            this.height = height;
        }

        @Override

        public String toString(){
            String chain = "Name --> " + this.name + ", age --> " + this.age + ", weight-height --> " + this.weight  + " - " + this.height;

            return  chain;
        }

    };

    public static class Adress{
        private String street;
        private String postCode;
        private String city;

        public Adress() {
            street = "";
            postCode = "";
            city = "";
        }

        public Adress(String street, String postCode, String city) {
            this.street = street;
            this.postCode = postCode;
            this.city = city;
        }

        @Override
        public String toString() {
            return "Address: " + street + ", " + postCode + " " + city;
        }
    };

    public static class Customer{
        private String name;
        private String first_name;
        private Adress adress;

        public Customer(String name, String first_name, Adress adress) {
            this.name = name;
            this.first_name = first_name;
            this.adress = new Adress();
            this.adress = adress;
        }

        @Override
        public String toString() {
            return "Customer: " + name + " " + first_name + "\n" + adress.toString()+"\n";
        }
    };

    public static void main(String[] args) {
        //9.1
        /*Person pedro =  new Person("Pedro", 23, 92, 181);
        System.out.println(pedro.toString());
*/
        //9.2
        Customer max = new Customer("Max", "Mustermann", new Adress("Musterstr. 18", "32222", "Am See"));
        Customer manfred = new Customer("Manfred", "Schmidt", new Adress("Hauptbahnhof. 2", "43332",  "City centre"));
        Customer lisa = new Customer("Lisa", "Lee", new Adress("Stuttgarter Weg 22", "23333", "Schlosspark"));

        Customer[] arrayCustomers = {max, manfred, lisa};


        for(int i = 0; i < arrayCustomers.length; i++){
            System.out.println("___Customer No."+i+"___");
            System.out.println(arrayCustomers[i].toString());
        }
    }
}
