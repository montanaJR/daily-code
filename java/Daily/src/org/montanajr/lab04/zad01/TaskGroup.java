package org.montanajr.lab04.zad01;

import java.util.ArrayList;
import java.util.List;

public class TaskGroup implements Task {

    private List<Task> tasks = new ArrayList<Task>();
    private String taskName;

    public TaskGroup(String taskName) {
        this.taskName = taskName;
    }

    @Override
    public void addTask(Task t) {
        tasks.add(t);
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public void setTaskLevel(Integer level) {
        // auto
    }

    @Override
    public Integer getTaskLevel() {
        Integer sum = 0;
        for(Task t : tasks){
            sum = sum + t.getTaskLevel();
        }
        return sum;
    }

    @Override
    public void setTascDescByLevel() {

    }


}