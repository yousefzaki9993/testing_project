package com.example.demo1;

import java.util.ArrayList;
import java.util.List;

class Doctor {
    private static int doctorId = 0;
    private String name;
    private String department;
    private String phone;
    private List<Appointment> appointments;
    private double bill_amount;

    public Doctor(String name, String department, String phone , double bill_amount) {
        doctorId++;
        this.name = name;
        this.department = department;
        this.phone = phone;
        this.bill_amount = bill_amount;
        this.appointments = new ArrayList<>();
    }
    
    public void add_appointment(Appointment app) {
    	if( app != null )
    		appointments.add(app);
    }

    public double getBill_amount() {
        return bill_amount;
    }

    public void setBill_amount(double bill_amount) {
        this.bill_amount = bill_amount;
    }

    public int getDoctorId() {
        return doctorId;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public List<Appointment> getAppointments() {
        return appointments;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}