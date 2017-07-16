package net.aryaman.algo.person;

public class Person {

    public Person() {
        super();
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "Person [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", social=" + social
                + ", address=" + address + ", age=" + age + "]";
    }

    /**
     * @param id
     * @param firstName
     * @param lastName
     * @param social
     * @param address
     * @param age
     */
    public Person(String id, String firstName, String lastName, String social, String address, int age) {
        super();
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.social = social;
        this.address = address;
        this.age = age;
    }

    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the social
     */
    public String getSocial() {
        return social;
    }

    /**
     * @param social the social to set
     */
    public void setSocial(String social) {
        this.social = social;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    private String id;
    private String firstName;
    private String lastName;
    private String social;
    private String address;
    private int age;


}
