package com.jin.tasks.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Getter;

@Getter
@Entity
public class Task {

    @Id
    private String taskId;
    private String taskName;
    private String taskCreateDate;
    private String taskType;
    private String taskState;
    private String resultDataSource;
    private String remark;
    private String taskResultDescr;
    private String taskStartTime;
    private String taskEndTime;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "task")
    private List<SubTask> subTasks = new ArrayList<>();
}
