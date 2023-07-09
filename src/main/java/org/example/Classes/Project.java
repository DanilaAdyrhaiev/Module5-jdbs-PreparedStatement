package org.example.Classes;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Getter
public class Project {
    private int id;
    private LocalDate startDate;
    private LocalDate finishDate;
    public  Project(){}
    private Project(int id, LocalDate startDate, LocalDate finishDate){
        this.id = id;
        this.startDate = startDate;
        this.finishDate = finishDate;
    }

    public List<Project> generateFiveProjectsList(){
        List<Project> projects = new ArrayList<>();
        projects.add(new Project(1, LocalDate.of(2020, 12, 1), LocalDate.of(2021, 7, 15)));
        projects.add(new Project(2, LocalDate.of(2021, 1, 1), LocalDate.of(2021, 2, 1)));
        projects.add(new Project(3, LocalDate.of(2021, 1, 15), LocalDate.of(2021, 5, 15)));
        projects.add(new Project(4, LocalDate.of(2021, 3, 11), LocalDate.of(2022, 6, 12)));
        projects.add(new Project(5, LocalDate.of(2022, 12, 15), LocalDate.of(2023, 6, 3)));
        return projects;
    }
}
