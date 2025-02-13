package com.mjc.stage2;

import lombok.EqualsAndHashCode;
import lombok.ToString;

@EqualsAndHashCode
@ToString
public class Employee {
    private String name;
    private String lastName;
    private String position;
    private String phone;
    private String email;
    private String carNumber;

    public Employee() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }

    public static EmployeeBuilder getBuilder() {
        return new EmployeeBuilder();
    }

    public static class EmployeeBuilder {
        private Employee employee;

        public EmployeeBuilder() {
            employee = new Employee();
        }

        public Employee setName(String name) {
            employee.setName(name);
            return employee;
        }

        public Employee setLastName(String lastName) {
            employee.setLastName(lastName);
            return employee;
        }

        public Employee setPosition(String position) {
            employee.setPosition(position);
            return employee;
        }

        public Employee setPhone(String phone) {
            employee.setPhone(phone);
            return employee;
        }

        public Employee setEmail(String email) {
            employee.setEmail(email);
            return employee;
        }

        public Employee setCarNumber(String carNumber) {
            employee.setCarNumber(carNumber);
            return employee;
        }

        public Employee build() {
            return employee;
        }
        // Write your code here!
    }
}
