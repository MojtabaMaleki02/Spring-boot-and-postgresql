package com.example.demo.student;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getStudent(){
        return studentRepository.findAll();
    }

    public void addNewStudent(Student student){
        Optional<Student> studentByName = studentRepository.findStudentByName(student.getName());

        if (studentByName.isPresent()){
            throw new IllegalStateException("You are already registered!!");
        }
        studentRepository.save(student);

    }

    public void deleteStudent(Long studentId) {
        boolean exists = studentRepository.existsById(String.valueOf(studentId));
        if (!exists){
            throw new IllegalStateException("Student with id "+ studentId +" does not exists!!");
        }else {
            studentRepository.deleteById(String.valueOf(studentId));
        }
    }

    @Transactional
    public void updateStudent(Long studentId, String name, String course) {

        Student student = studentRepository.findById(String.valueOf(studentId))
                .orElseThrow(() -> new IllegalStateException("Student with id " + studentId + " does not exist!"));

        if (name != null && name.length() > 0 && !Objects.equals(student.getName(), name)){
            student.setName(name);
        }


        if (course != null && course.length() > 0 && !Objects.equals(student.getCourse(), course)) {
            student.setCourse(course);
        }


    }
}

















