package com.example.car.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    public static class Student {
        private String firstname;
        private String lastname;
        private String phone;
        private int age;

        public Student(String firstname, String lastname, String phone, int age) {
            this.firstname = firstname;
            this.lastname = lastname;
            this.phone = phone;
            this.age = age;
        }

        public String getFirstname() {
            return firstname;
        }

        public void setFirstname(String firstname) {
            this.firstname = firstname;
        }

        public String getLastname() {
            return lastname;
        }

        public void setLastname(String lastname) {
            this.lastname = lastname;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        @Override
        public String toString() {
            return "Student {" +
                    "firstname='" + firstname + '\'' +
                    ", lastname='" + lastname + '\'' +
                    ", phone='" + phone + '\'' +
                    ", age=" + age +
                    '}';
        }
    }

    @PostMapping("/student")
    public void addStudent(@RequestBody Student student) {
        System.out.println(student);
    }
}
