package model;

import javax.persistence.*;//Maps Java objects to database tables and vice versa (Implements ORM?).

/**
 * Created by CoT on 10/14/17.
 */

@Entity//Marks this class as an entity bean, so it must have a no-argument constructor that is visible with at least protected scope.
@Table(name = "student")//You can customize this mapping using the name, schema, and catalog attributes of the @Table annotation.
public class Student {

    @Id//Indicates the member field below is the primary key of the current entity.
    @Column//It enables you to customize the mapping between the entity attribute and the database column.
    @GeneratedValue(strategy = GenerationType.IDENTITY)//Hibernate relies on an auto-incremented database column to generate the primary key.
    private int id;//The primary key.

    @Column//It enables you to customize the mapping between the entity attribute and the database column.
    private String studentName;

    public Student() {
    }

    public int getId() {
        return id;
    }//Retrieves the Primary Key.

    public void setId(int id) {
        this.id = id;
    }//Sets the Primary Key.

    public String getStudentName() {
        return studentName;
    }//Retrieves the

    public void setStudentName(String name) {
        this.studentName = name;
    }//Sets the
}
