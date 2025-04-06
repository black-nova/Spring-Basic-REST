package com.quiz.quizapp;
import com.quiz.quizapp.datamodel.Students;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.quiz.quizapp.repo.questionnire;

@Controller
public class Webcontroller {

    @Autowired
    public questionnire questions;

    @RequestMapping("/")
    //@ResponseBody
    public String home()
    {
        return "home.jsp";
    }
    @RequestMapping(value="/saveStudent")
    public String saveStudents( Students student)
    {   
        //ModelAndView mv = new ModelAndView("details.jsp");
        //mv.addObject("student", student);
        questions.save(student);
        //System.out.println(student);
        return "redirect:/";
    }
}
