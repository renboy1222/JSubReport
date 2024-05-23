/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.aldrin.jreport.dao;


import com.aldrin.jreport.model.Instructor;
import java.util.ArrayList;

/**
 *
 * @author ALDRIN B. C.
 */
public interface InstructorDAO {

    public Long getMaxId();

    public void addInstructor(Instructor instructor);

    public void updateInstructor(Instructor instructor);

    public void deleteInstructor(Instructor instructor);

    public ArrayList<Instructor> selectInstructor();

    public void comboBoxInstructor();

    public Instructor findPhotoByInstructorId(Instructor instructor);

}
