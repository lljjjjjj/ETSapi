package com.project.etsapi.service.Implment;

import com.project.etsapi.mapper.StudentMapper;
import com.project.etsapi.entity.Student;
import com.project.etsapi.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    StudentMapper studentMapper;

    @Override
    public int addStudent(Student student){
        try {
            return studentMapper.addStudent(student);
        }
        catch (Exception e){
            return -1;
        }
    }

    @Override
    public int deleteStudent(String student_ID){
        return studentMapper.deleteStudent(student_ID);
    }

    @Override
    public int setStudent(Student student){
        if(studentMapper.getStudent(student.getStudent_ID())!=null){
            return studentMapper.setStudent(student);
        }
        // 不存在则返回-1
        else {
            return -1;
        }
    }

    @Override
    public Student getStudent(String student_ID){
        return studentMapper.getStudent(student_ID);
    }

    @Override
    public List<Student> getAll(){
        return studentMapper.getAll();
    }
}
