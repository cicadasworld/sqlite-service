package com.jin.tasks.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Getter;

@Getter
@Entity
public class SubTask {

    @Id
    private String subTaskId;
    private String subTaskName;
    private int subTaskStep;
    private String taskState;
    private String taskStateCode;
    private String currentUser;
    private String stateDate;
    private String taskStateEnglish;

    @ManyToOne
    @JoinColumn(name = "task_Id", insertable = false, updatable = false)
    @JsonIgnore
    private Task task;
}
