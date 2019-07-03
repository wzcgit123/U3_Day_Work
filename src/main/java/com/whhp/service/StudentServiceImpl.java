package com.whhp.service;


import com.whhp.entity.StudentInfo;
import com.whhp.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {


    @Autowired
    private StudentMapper studentMapper;

    @Override
    public List<StudentInfo> selectAll() {
        return studentMapper.selectAll();
    }
}
