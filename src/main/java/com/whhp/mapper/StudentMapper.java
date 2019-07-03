package com.whhp.mapper;

import com.whhp.entity.StudentInfo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface StudentMapper {


    List<StudentInfo> selectAll();
}
