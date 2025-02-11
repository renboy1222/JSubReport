/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aldrin.jreport.model;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 *
 * @author ALRIN B.C.
 */
@Setter
@Getter
@ToString
public class Student {

    private Long id;
    private String studentId;
    private String firstname;
    private String middlename;
    private String surname;
    private String gender;
    private String email;
    private String mobileNo;
    private String address;
    private String dateOfBirth;
    private Citizenship citizenship;
    private Course course;
    private CivilStatus civilStatus;
    private byte[] photo;
    private Boolean deleted;
}
