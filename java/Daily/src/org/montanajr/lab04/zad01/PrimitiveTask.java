package org.montanajr.lab04.zad01;

public class PrimitiveTask implements Task {
    private String taskName;
    private int taskLevel;
    private String taskLevelDesc;

    public PrimitiveTask(String tName) {
        this.taskName = tName;
        this.taskLevel = 0;
        this.taskLevelDesc = "";
    }

    @Override
    public void addTask(Task t) {
        //not implemented
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public void setTaskLevel(Integer level) {
        this.taskLevel = level;
    }

    @Override
    public Integer getTaskLevel() {
        return taskLevel;
    }

    @Override
    public void setTascDescByLevel() {

    }


    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("PrimitiveTask{");
        sb.append("taskName='").append(taskName).append('\'');
        sb.append(", taskLevel=").append(taskLevel);
        sb.append('}');
        return sb.toString();
    }
}
