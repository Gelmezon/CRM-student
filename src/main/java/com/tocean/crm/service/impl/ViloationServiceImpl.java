package com.tocean.crm.service.impl;

import com.tocean.crm.dao.StudentDao;
import com.tocean.crm.dao.ViloationDao;
import com.tocean.crm.entity.Viloation;
import com.tocean.crm.service.ViloationService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("ViloationService")
@Slf4j
public class ViloationServiceImpl implements ViloationService {
    @Autowired
    private ViloationDao viloationDao;
    @Override
    public List<Viloation> findByStudent_id(String student_id) {
        List<Viloation> viloations=viloationDao.findByStudent_id(student_id);
        return  viloations;
    }

    @Override
    public List<Viloation> findByConfirmer(String confirmer) {
        List<Viloation> viloations=viloationDao.findByStudent_id(confirmer);
        return  viloations;
    }
}
