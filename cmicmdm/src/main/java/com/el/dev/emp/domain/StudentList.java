package com.el.dev.emp.domain;

/**
 * Created by Vincent on 2016/9/20.
 */
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="list")
public class StudentList {

    List<Student> students;    //所有学生信息的集合

    @XmlElement(name = "student")
    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

}
