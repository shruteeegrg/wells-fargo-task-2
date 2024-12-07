package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

public class Client {

    @Id
    @GeneratedValue()
    private Long clientId;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String phone;

    @Column(nullable = false)
    private String address;

    @ManyToOne
    @JoinColumn(name = "advisorId", nullable = false)
    private Advisor advisor;

    public Client() {

    }

    public Client(String firstName, String lastName, String email, String phone, String address, Advisor advisor) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.advisor = advisor;
    }

    public Long getClientId() {
        return clientId;
    }

    public void setClientId(Long clientId) {
        this.clientId = clientId;
    }

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public Advisor getAdvisor() {
        return advisor;
    }
    public void setAdvisor(Advisor advisor) {
        this.advisor = advisor;
    }
}
