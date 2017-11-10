package com.tocean.crm.controller;

import com.tocean.crm.common.base.baseObject.Response;
import com.tocean.crm.entity.Student;
import com.tocean.crm.entity.Viloation;
import com.tocean.crm.service.ViloationService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@Slf4j
@RequestMapping(value = "/student")
public class ViloationController {
    @Autowired
    private ViloationService viloationService;

    @GetMapping(value="/api/ViloationBystudent_id")
    public Response ViloationBystudent_id(HttpServletRequest request){
        try{
            String id = request.getParameter("student_id");
            List<Viloation> viloations = viloationService.findByStudent_id(id);
            return Response.ok(viloations);
        } catch (Exception e) {
            return Response.fail(e.getMessage());
        }
    }

    @GetMapping(value="/api/ViloationByConfirmer")
    public Response ViloationByConfirmer(HttpServletRequest request){
        try{
            String confirmer = request.getParameter("confirmer");
            List<Viloation> viloations = viloationService.findByConfirmer(confirmer);
            return Response.ok(viloations);
        } catch (Exception e) {
            return Response.fail(e.getMessage());
        }
    }
}
