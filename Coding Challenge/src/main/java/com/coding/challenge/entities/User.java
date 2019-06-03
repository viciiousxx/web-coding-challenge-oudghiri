package com.coding.challenge.entities;


import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name="User")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull
    @Column(name = "first_name")
    private String firstName;

    @NotNull
    @Column(name = "last_name")
    private String lastName;

    @NotNull
    @Email
    @Column(name = "email" , nullable = false, unique = true)
    private String email;

    @NotNull
    @Column(name = "tel")
    private String telephone;

    @NotNull
    @Size( min = 8 , max = 32 )
    @Column(name= "pwd")
    private String password;

    @NotNull
    @OneToOne
    private Coordinate coordinate;

    public User(@NotNull String firstName, @NotNull String lastName, @NotNull @Email String email, @NotNull String telephone, @NotNull @Size(min = 8, max = 32) String password, @NotNull Coordinate coordinate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.telephone = telephone;
        this.password = password;
        this.coordinate = coordinate;
    }

    public User() {
    }

    public User getCoordinate() {
        this.coordinate = coordinate;
        return this;
    }

    public void setCoordinate(Coordinate coordinate) {
        this.coordinate = coordinate;
    }

    public User getId() {
        this.id = id;
        return this;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getFirstName() {
        this.firstName = firstName;
        return this;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public User getLastName() {
        this.lastName = lastName;
        return this;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public User getEmail() {
        this.email = email;
        return this;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public User getTelephone() {
        this.telephone = telephone;
        return this;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public User getPassword() {
        this.password = password;
        return this;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
