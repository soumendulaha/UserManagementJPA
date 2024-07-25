/*
 * package com.UserManagement.Model;
 * 
 * import java.util.List;
 * 
 * import javax.persistence.CascadeType; import javax.persistence.Column; import
 * javax.persistence.Entity; import javax.persistence.GeneratedValue; import
 * javax.persistence.GenerationType; import javax.persistence.Id; import
 * javax.persistence.JoinColumn; import javax.persistence.OneToMany; import
 * javax.persistence.OneToOne; import javax.persistence.Table;
 * 
 * import lombok.Data;
 * 
 * @Entity
 * 
 * @Table(name = "Student", schema = "jpa")
 * 
 * @Data public class Student {
 * 
 * @Id
 * 
 * @GeneratedValue(strategy = GenerationType.IDENTITY) private Long studentId;
 * 
 * @Column(name="StudentName") private String studentName;
 * 
 * // @OneToOne(cascade = CascadeType.ALL)
 * // @JoinColumn(name="studentDetailsId") // private StudentDetails
 * studentDetails; //
 * 
 * @OneToMany(cascade = CascadeType.ALL)
 * 
 * @JoinColumn(name="studentId") private List<Course> listOfCourse;
 * 
 * 
 * 
 * 
 * }
 */