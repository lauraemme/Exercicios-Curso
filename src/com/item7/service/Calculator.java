package com.item7.service;

import com.item7.Person;

public class Calculator {

    public static Person olderPerson (Person[] people){
        Person olderPerson = people[0];
        String olderPersonName2 = "";

        for (Person person: people){
            if(person.age > olderPerson.age){
                olderPerson = person;
            } else if (person.age == olderPerson.age){
                olderPersonName2 = person.name;
            }
        }

        if (olderPersonName2 == ""){
            return new Person("",0);
        } else {
            return olderPerson;
        }
    }

    public static Person youngerPerson (Person[] people){
        Person youngerPerson = people[0];

        String youngerPersonName2 = "";

        for (Person person: people){
            if(person.age < youngerPerson.age){
                youngerPerson = person;
            } else if (person.age == youngerPerson.age){
                youngerPersonName2 = person.name;
            }
        }

        if (youngerPersonName2 == ""){
            return new Person("",0);
        } else {
            return youngerPerson;
        }
    }

    public static float averageAge (Person[] people){
        float sum = 0;

        for (Person person: people){
            sum += person.age;
        }

        return  sum / people.length;
    }
}
