package com.betsol.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CertificationController {



    @RequestMapping(value="certifications/certification", method = RequestMethod.GET)
    public ModelAndView certification(){
        ModelAndView modelAndView = new ModelAndView();

        modelAndView.setViewName("certifications/certification");
        return modelAndView;
    }

    @RequestMapping(value="certifications/microsoft", method = RequestMethod.GET)
    public ModelAndView microsoft(){
        ModelAndView modelAndView = new ModelAndView();

        modelAndView.setViewName("certifications/microsoft");
        return modelAndView;
    }

    @RequestMapping(value="certifications/awscertifications", method = RequestMethod.GET)
    public ModelAndView aws(){
        ModelAndView modelAndView = new ModelAndView();

        modelAndView.setViewName("certifications/awscertifications");
        return modelAndView;
    }

    @RequestMapping(value="certifications/oracle", method = RequestMethod.GET)
    public ModelAndView oracle(){
        ModelAndView modelAndView = new ModelAndView();

        modelAndView.setViewName("certifications/oracle");
        return modelAndView;
    }


}
