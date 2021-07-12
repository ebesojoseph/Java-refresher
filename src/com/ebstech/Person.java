package com.ebstech;

@JsonSerializable
public class Person {
    @JsonElement(key = "First name")
    private String firstName;
    @JsonElement(key = "Last name")
    private String lastName;
    @JsonElement(key = "age")
    private String age;

    @Init
    public String initNames() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
