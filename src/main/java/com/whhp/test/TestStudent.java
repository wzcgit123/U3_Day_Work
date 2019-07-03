package com.whhp.test;

import com.whhp.entity.StudentInfo;
import com.whhp.service.StudentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/SqlStudentConfig.xml")
public class TestStudent {

    @Autowired
    private StudentService studentService;

    @Test
    public void selectAll(){
        List<StudentInfo>  studentInfoList = studentService.selectAll();

        for (StudentInfo studentInfo : studentInfoList) {

            System.out.println(studentInfo);
        }
    }

}
