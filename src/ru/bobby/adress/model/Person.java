package ru.bobby.adress.model;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.StringProperty;

import java.time.LocalDate;

/**
 * Created by User on 10.08.2015.
 */
public class Person {

    private final StringProperty firstName;
    private final StringProperty lastName;
    private final StringProperty street;
    private final IntegerProperty postalCode;
    private final StringProperty city;
    private final ObjectProperty<LocalDate> birthday;

    public Person() {
        this(null, null);
    }

    public Person(StringProperty firstName, StringProperty lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
