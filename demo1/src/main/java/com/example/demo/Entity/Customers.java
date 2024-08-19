package com.example.demo.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Entity
@Table(name = "Customersdb")
@NoArgsConstructor
@AllArgsConstructor
public class Customers {
    @Id
    @Column(name= "Customer_ID", nullable = false)
    @GeneratedValue
    private int id;
    @Column(name = "Customer_Name", nullable = false)
    private String customerName;
    @Column(name = "Customer_Surname", nullable = false)
    private String customerSurname;
    @Column(name = "Customer_Mail", nullable = false)
    private String customerMail;
}
