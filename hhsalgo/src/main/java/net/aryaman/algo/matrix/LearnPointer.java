package net.aryaman.algo.matrix;

public class LearnPointer {

    static class Address {
        public Address(String city, String zipcode) {
            super();
            this.city = city;
            this.zipcode = zipcode;
        }
        public String city;
        public String zipcode;
    }

    static class Person {
        public Person(int age, String name, Address addr) {
            super();
            this.age = age;
            this.name = name;
            this.addr = addr;
        }
        public int age;
        public String name;
        public Address addr;
    }

    public static void main(String[] args) {
        Address schoolAddr = new Address("Sunnyvale", "94087");
        Address homeAddr = new Address("Cupertino", "95014");


        System.out.println("homeAddress: " + homeAddr + " schoolAddress: " + schoolAddr);


        Person p1 = new Person(13, "Aryaman", homeAddr);
        System.out.println("address: " + p1.addr);

        p1.addr = schoolAddr;
        System.out.println("address: " + p1.addr);


        Person p2 = new Person(42, "Tej", homeAddr);
        System.out.println("address: " + p2.addr);

        p1.addr = homeAddr;
        System.out.println("address: " + p1.addr);

        Address workAddr = new Address("Palo Alto", "94304");
        p2.addr = workAddr;


    }

}
