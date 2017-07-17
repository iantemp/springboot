package com.example.demo.domain.dto;


import javax.persistence.*;

/**
 * Created by Ian Gabriel on 7/13/2017.
 */

    @Entity(name = "TEMP_CUSTOMER")
    public class Customers {

        @Id
        @GeneratedValue(strategy= GenerationType.AUTO)
        private Long id;

        @Column(name = "firstname")
        private String firstName;

        @Column(name = "lastname")
        private String lastName;

        public Customers(){}

        public Customers(Long id, String firstName, String lastName) {
            this.id = id;
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public Long getId() {
            return id;
        }

        public void setId(Long id) {

            this.id = id;
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

        @Override
        public String toString() {
            return String.format(
                "Customers[id=%d, firstName='%s', lastName='%s']",
                id, firstName, lastName);
        }
    }

