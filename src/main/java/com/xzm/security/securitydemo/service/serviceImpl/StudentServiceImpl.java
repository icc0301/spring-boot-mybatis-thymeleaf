package com.xzm.security.securitydemo.service.serviceImpl;

import com.xzm.security.securitydemo.dao.StudentDao;
import com.xzm.security.securitydemo.entity.StudentEntity;
import com.xzm.security.securitydemo.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    private final StudentDao studentDao;

    public StudentServiceImpl(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    @Override
    public StudentEntity queryById(Integer id) {
        return studentDao.queryById(id);
    }

    @Override
    public List<StudentEntity> queryAllByLimit(int offset, int limit) {
        return studentDao.queryAllByLimit(offset, limit);
    }

    @Override
    public int insert(StudentEntity student) {
        return studentDao.insert(student);
    }

    @Override
    public int update(StudentEntity student) {
        return studentDao.update(student);
    }

    @Override
    public boolean deleteById(Integer id) {
        return studentDao.deleteById(id) > 0;
    }
}
