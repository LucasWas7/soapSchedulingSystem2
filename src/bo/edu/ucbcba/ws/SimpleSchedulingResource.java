
package bo.edu.ucbcba.ws;


import bo.edu.ucbcba.model.Clase;
import bo.edu.ucbcba.model.Student;
import java.util.ArrayList;
import java.util.Arrays;

import java.util.HashMap;
import java.util.List;

import java.util.Map;


public class SimpleSchedulingResource {
    
   private Map<String, Student> studentsMap;
   
   private Map<String,Clase> classMap;
   
   private Map<String, List<Student>> studentsByClass;
   
   private Map<String, List<Clase>> classesByStudent;

    public Map<String, List<Student>> getStudentsByClass() {
        return studentsByClass;
    }

    public void setStudentsByClass(Map<String, List<Student>> studentsByClass) {
        this.studentsByClass = studentsByClass;
    }

    public Map<String, List<Clase>> getClassesByStudent() {
        return classesByStudent;
    }

    public void setClassesByStudent(Map<String, List<Clase>> classesByStudent) {
        this.classesByStudent = classesByStudent;
    }
   

    public Map<String, Student> getStudentsMap() {
        return studentsMap;
    }

    public void setStudentsMap(Map<String, Student> studentsMap) {
        this.studentsMap = studentsMap;
    }

    public Map<String, Clase> getClassMap() {
        return classMap;
    }

    public void setClassMap(Map<String, Clase> classMap) {
        this.classMap = classMap;
    }
   

    public SimpleSchedulingResource() {
        studentsMap = new HashMap<>();
        classMap = new HashMap<>();
        studentsByClass = new HashMap<>();
        classesByStudent = new HashMap<>();
    }
    
    public Student createStudent(String studentId, String lastName, String firstName) {
        Student student = new Student(studentId, firstName, lastName);
        if(studentsMap.get(studentId)==null){
            studentsMap.put(studentId, student);
            classesByStudent.put(studentId, new ArrayList<>());
        }
        return student;
    }

    
    public Student editStudent (String studentId, String lastName, String firstName) {
        Student student = studentsMap.get(studentId);
        if (student!=null){
            student.setFirstname(firstName);
            student.setLastname(lastName);
            studentsMap.put(studentId, student);
        }
        return student;
    }
    
    public void deleteStudent (String studentId){
        studentsMap.remove(studentId);
    }
    
    public Student retrieveStudent(String studentId) {
        return studentsMap.get(studentId);
    }
    
    public Clase createClass(String code, String title, String description) {
        Clase clase = new Clase(code, title, description);
        if(classMap.get(code)==null){
            classMap.put(code, clase);
            studentsByClass.put(code, new ArrayList<>());
        }
        return clase;
    }

    public Clase retrieveClass(String code) {
        return classMap.get(code);
    }
    
    public Clase editClass (String code, String title, String description) {
        // TODO validate input data
        Clase clase = classMap.get(code);
        if (clase!=null){
            clase.setTitle(title);
            clase.setDescription(description);
            classMap.put(code, clase);
        }
        return clase;
    }
    
    public void deleteClass (String code){
        classMap.remove(code);
    }
    
    public void addStudentToClass(String studentId,String code){
        Student student = studentsMap.get(studentId);
        Clase clase = classMap.get(code);
        if(student!=null && clase!=null){
            studentsByClass.get(code).add(student);
            classesByStudent.get(studentId).add(clase);
        }
    }
    
    public void showAllStudentsOfClass(String code){
        Clase clase = classMap.get(code);
        if (clase!=null){
            clase.show();
         System.out.println(Arrays.asList(studentsByClass.get(code)));
        }
    }
    
    public void showAllClassesOfStudent(String studentId){
        Student student = studentsMap.get(studentId);
        if (student!=null){
            student.show();
            System.out.println(Arrays.asList(classesByStudent.get(studentId)));
        }
    }
    
    public void showClass(String code){
        Clase clase = classMap.get(code);
        clase.show();
    }
    
    public void showStudent(String studentId){
        Student student = studentsMap.get(studentId);
        student.show();
    }
   
}
