/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.aldrin.jreport.dao;


import com.aldrin.jreport.model.Course;
import java.util.ArrayList;

/**
 *
 * @author ALDRIN B. C.
 */
public interface CourseDAO {

    public Long getMaxId();

    public void addCourse(Course course);

    public void updateCourse(Course course);

    public void deleteCourse(Course course);

    public ArrayList<Course> selectCourse();

    public void comboBoxCourse();

}
