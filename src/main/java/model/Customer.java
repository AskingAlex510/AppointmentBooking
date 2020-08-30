package model;

import javax.persistence.*;//Maps Java objects to database tables and vice versa (Implements ORM?).

/**
 * Created by CoT on 6/18/18.
 */
@Entity//Marks this class as an entity bean, so it must have a no-argument constructor that is visible with at least protected scope.
public class Customer {

    @Id//Indicates the member field below is the primary key of the current entity.
    @GeneratedValue(strategy = GenerationType.IDENTITY)//Hibernate relies on an auto-incremented database column to generate the primary key.
    private int id;//The primary key.

    @Column//It enables you to customize the mapping between the entity attribute and the database column.
    private String username;
    private String password;
    private String customerName;
    private String customerAddress;
    private String customerPhone;
    private String service;
    private String bookingTime;

    public Customer() {
    }

    public String getService() {return service;}

    public void setService(String service) {this.service = service;}

    public String getBookingTime() {return bookingTime;}

    public void setBookingTime(String bookingTime) { this.bookingTime = bookingTime; }

    public int getId() {
        return id;
    }//Retrieves the Primary Key.

    public void setId(int id) {
        this.id = id;
    }//Sets the Primary Key.

    public String getUsername() {
        return username;
    }//Retrieves the Username.

    public void setUsername(String username) {
        this.username = username;
    }//Sets the Username.

    public String getPassword() {
        return password;
    }//Retrieves the Password

    public void setPassword(String password) {
        this.password = password;
    }//Sets the Password.

    public String getCustomerName() {
        return customerName;
    }//Retrieves the Customer Name.

    public void setCustomerName(String name) {
        this.customerName = name;
    }//Sets the Customer Name.

    public String getCustomerAddress() {
        return customerAddress;
    }//Retrieves the Customer Address.

    public void setCustomerAddress(String customerAddress) { this.customerAddress = customerAddress; }//Sets the Customer Address.

    public String getCustomerPhone() {
        return customerPhone;
    }//Retrieves the Customer Phone Number.

    public void setCustomerPhone(String customerPhone) { this.customerPhone = customerPhone; }//Sets the Customer Phone Number.
}
