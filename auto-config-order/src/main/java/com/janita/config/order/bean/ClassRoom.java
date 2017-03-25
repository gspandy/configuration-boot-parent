package com.janita.config.order.bean;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Janita on 2017-03-25 14:47
 */
public class ClassRoom implements Serializable{

    private Integer classroomId;

    private User user;

    public Integer getClassroomId() {
        return classroomId;
    }

    public void setClassroomId(Integer classroomId) {
        this.classroomId = classroomId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "ClassRoom{" +
                "classroomId=" + classroomId +
                ", user=" + user +
                '}';
    }
}
