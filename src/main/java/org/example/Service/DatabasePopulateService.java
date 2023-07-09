package org.example.Service;

import org.example.Classes.Client;
import org.example.Classes.Project;
import org.example.Classes.ProjectWorker;
import org.example.Classes.Worker;
import org.example.Database.Database;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class DatabasePopulateService {
    public static void main(String[] args) {
        populateWorkerTable();
        populateClientTable();
        populateProjectTable();
        populateProjectWorkerTable();
    }
    public static void populateWorkerTable(){
        String sql = "insert worker(NAME, BIRTHDAY, LEVEL, SALARY) values (?,?,?,?)";
        try{
            Connection connection = Database.getInstance().getConnection();
            connection.setAutoCommit(false);
            PreparedStatement statement = connection.prepareStatement(sql);
            for(Worker worker : new Worker().generateTenWorkersList()){
                statement.setString(1, worker.getName());
                statement.setDate(2, Date.valueOf(worker.getBirthday()));
                statement.setString(3, worker.getLevel());
                statement.setInt(4, worker.getSalary());
                statement.addBatch();
            }
            statement.executeBatch();
            connection.commit();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void populateClientTable(){
        String sql = "insert client(Name) values(?)";
        try{
            Connection connection = Database.getInstance().getConnection();
            connection.setAutoCommit(false);
            PreparedStatement statement = connection.prepareStatement(sql);
            for(Client client : new Client().generateFiveClient()){
                statement.setString(1, client.getName());
                statement.addBatch();
            }
            statement.executeBatch();
            connection.commit();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void populateProjectTable(){
        String sql = "insert project(CLIENT_ID, START_DATE, FINISH_DATE) values (?,?,?)";
        try {
            Connection connection = Database.getInstance().getConnection();
            connection.setAutoCommit(false);
            PreparedStatement statement = connection.prepareStatement(sql);
            for(Project project : new Project().generateFiveProjectsList()){
                statement.setInt(1, project.getId());
                statement.setDate(2, Date.valueOf(project.getStartDate()));
                statement.setDate(3, Date.valueOf(project.getFinishDate()));
                statement.addBatch();
            }
            statement.executeBatch();
            connection.commit();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void populateProjectWorkerTable(){
        String sql = "insert project_worker(project_ID, WORKER_ID) values (?,?)";
        try{
            Connection connection = Database.getInstance().getConnection();
            connection.setAutoCommit(false);
            PreparedStatement statement = connection.prepareStatement(sql);
            for(ProjectWorker projectWorker : new ProjectWorker().generateProjectWorkerList()){
                statement.setInt(1, projectWorker.getProjectId());
                statement.setInt(2, projectWorker.getWorkerId());
                statement.addBatch();
            }
            statement.executeBatch();
            connection.commit();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
