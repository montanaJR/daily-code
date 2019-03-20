package org.montanajr.lab04.zad01;

public interface Task {

    public void addTask(Task t);

    public String getTaskName();

    public void setTaskLevel(Integer level);

    public Integer getTaskLevel();

    public void setTascDescByLevel();

}
