package com.sid993100.JopApp;

import com.sid993100.JopApp.model.JobPost;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class JobController {

//    ===============================home page========================================method
//    if i want to map for two url-> we have to create Array -> @RequestMapping({"/", "home"})
//    here we use get and post method-->when get data use getMapping-> when post use postMapping
    @GetMapping({"/", "home"})
    public String home(){
        return "home";
    }
//    ================================end home page===================================

//    =================================add job======================================method
    @GetMapping("addjob")
    public String addJob(){
        return "addjob";
    }
//    =================================end add job======================================

//    =================================handel form======================================method
    @PostMapping("handleForm")
    public String handleForm(JobPost JobPost){
         return "success";
    }
}
