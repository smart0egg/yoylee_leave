package com.qihang.serviceImpl;

import com.qihang.dao.LeaveDao;
import com.qihang.model.Leave;
import com.qihang.service.LeaveService;
import com.qihang.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class LeaveServiceImpl implements LeaveService {

    @Autowired
    LeaveDao leaveDao;

    public List<Leave> GetAllLeave(){
        return leaveDao.SelectAllLeave();
    }
}