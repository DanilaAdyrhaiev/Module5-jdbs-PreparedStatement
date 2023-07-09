package org.example.Classes;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Getter
public class Worker {
    private String name;
    private LocalDate birthday;
    private String level;
    private int salary;
    public Worker(String name, LocalDate birthday, String level, int salary){
        this.name = name;
        this.birthday = birthday;
        this.level = level;
        this.salary = salary;
    }

    public Worker(){

    }

    public List<Worker> generateTenWorkersList(){
        List<Worker> workers = new ArrayList<>();
        workers.add(new Worker("Dan", LocalDate.of(2002, 11, 07), "Senior", 99000));
        workers.add(new Worker("Ivan", LocalDate.of(2000, 12,17), "Junior", 12000));
        workers.add(new Worker("Maks", LocalDate.of(1994,1,23), "Middle", 4000));
        workers.add(new Worker("Vika", LocalDate.of(2001,11,10), "Middle", 5000));
        workers.add(new Worker("George", LocalDate.of(2004,12,15), "Trainee", 900));
        workers.add(new Worker("Victor", LocalDate.of(2000,5,02), "Junior", 12000));
        workers.add(new Worker("Kate", LocalDate.of(1992,8,01), "Senior", 90000));
        workers.add(new Worker("Lisa", LocalDate.of(1994,3,04), "Junior", 12000));
        workers.add(new Worker("Victoria", LocalDate.of(1991,9,01), "Middle", 45000));
        workers.add(new Worker("Vlad", LocalDate.of(1971,12,17), "Senior", 99000));
        return workers;
    }
}
