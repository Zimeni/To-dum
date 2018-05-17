package com.limore.zhibek.to_dum.Model;

public class Task {

    private String taskName;
    private Boolean isTaskDone;
    private String taskCategory;

    public Task(){

    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public Boolean getTaskDone() {
        return isTaskDone;
    }

    public void setTaskDone(Boolean taskDone) {
        isTaskDone = taskDone;
    }

    public String getTaskCategory() {
        return taskCategory;
    }

    public void setTaskCategory(String taskCategory) {
        this.taskCategory = taskCategory;
    }


}
