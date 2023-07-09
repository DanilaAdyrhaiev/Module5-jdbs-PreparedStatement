package org.example.Classes;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class ProjectWorker {
    private  int projectId;
    private int workerId;
    public ProjectWorker(){}
    private ProjectWorker(int projectId, int workerId){
        this.projectId = projectId;
        this.workerId = workerId;
    }

    public List<ProjectWorker> generateProjectWorkerList(){
        List<ProjectWorker> projectWorkers = new ArrayList<>();
        projectWorkers.add(new ProjectWorker(1,5));
        projectWorkers.add(new ProjectWorker(1,6));
        projectWorkers.add(new ProjectWorker(2, 4));
        projectWorkers.add(new ProjectWorker(2, 7));
        projectWorkers.add(new ProjectWorker(3, 3));
        projectWorkers.add(new ProjectWorker(3,8));
        projectWorkers.add(new ProjectWorker(4, 2));
        projectWorkers.add(new ProjectWorker(4, 9));
        projectWorkers.add(new ProjectWorker(5, 1));
        projectWorkers.add(new ProjectWorker(5, 10));
        return  projectWorkers;
    }
}
