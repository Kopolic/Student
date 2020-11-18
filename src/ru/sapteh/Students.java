package ru.sapteh;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Students {
    private final int id;
    private final String lastName;
    private final String firstName;
    private final String surname;
    private final Date date;
    public Students(int id, String lastName, String firstName, String surname, Date date){
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.surname = surname;
        this.date = date;
    }
    public int getId() {
        return id;
    }
    public int getYear(){
        Date dateToday = new Date();
        return (int)((dateToday.getTime()-getDate().getTime())/1000/60/60/24/365);
    }
    public String getDateBirthday(){
        return new SimpleDateFormat("EEE/d/MMM").format(getDate());
    }
    public String getLastName() {
        return lastName;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getSurname() {
        return surname;
    }
    public Date getDate() {
        return date;
    }
    public String russianDate(){
        return new SimpleDateFormat("dd/MM/yyyy").format(getDate());
    }
    public String createStudent(){
        return String.format("%d %s %s %s %s Возраст: %d    %s ", getId(),getLastName(),getFirstName(),getSurname(),russianDate(), getYear(), getDateBirthday());
    }
}
