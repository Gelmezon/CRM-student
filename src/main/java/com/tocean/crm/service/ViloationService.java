package com.tocean.crm.service;


import com.tocean.crm.entity.Viloation;

import java.util.List;

public interface ViloationService {
    public List<Viloation> findByStudent_id(String student_id);

    /**
     * 根据登录名查询学生
     *
     * @return 查询结果
     */
    public List<Viloation> findByConfirmer(String confirmer);
}
