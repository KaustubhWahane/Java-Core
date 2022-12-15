package com.anudip.LabAssessment15Dec;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
 
@Entity
@Table(name="Applicant")
public class Applicant {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "Applicant_Id")
    private int applicantId;
   
    @Column(name = "FirstName")
    private String firstName;
   
    @Column(name = "LastName")
    private String lastName;
   
    @Column(name = "Age")
    private int age;
   
    @Column(name = "Education")
    private String education;
   
   
    public int getApplicantId() {
        return applicantId;
    }
    public void setApplicantId(int applicantId) {
        this.applicantId = applicantId;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public Applicant() {
		super();
	}
	@Override
	public String toString() {
		return "Applicant [applicantId=" + applicantId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", age=" + age + ", education=" + education + "]";
	}
	public String getEducation() {
        return education;
    }
    public void setEducation(String education) {
        this.education = education;
    }
}