/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yaroslav.dao;

import com.yaroslav.model.Student;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Yaroslav
 */
@Local
public interface StudentDaoLocal {

    void addStudent(Student student);

    void editStudent(Student student);

    void deleteStudent(int studentId);

    Student getStudent(int studentId);

    List<Student> getAllStudents();
    
}
