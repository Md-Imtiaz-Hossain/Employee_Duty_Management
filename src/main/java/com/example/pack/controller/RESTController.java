package com.example.pack.controller;


import com.example.pack.model.Duty;

import com.example.pack.model.DutyLog;
import com.example.pack.service.DutyLogService;
import com.example.pack.service.DutyService;
import com.example.pack.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/rest")
public class RESTController {


    @Autowired
    private DutyLogService dutyLogService;

    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private DutyService dutyService;

    @RequestMapping({"/hello"})
    public String firstPage() {
        return "Hello World";
    }

    ///duties              GET                        token  200               duty-list:Array
    @GetMapping("/duties")
    public List<Duty> allDutyInformation(Model model) {
        List<Duty> allDuty = dutyService.getAllDuty();
        System.out.println(allDuty);
        return allDuty;
    }

    ///duties/{id}         GET                        token 200                duty-details:object
    @GetMapping("/duty")
    public List<Duty> dutyInformation(Model model, @RequestParam("id") Long id ) {
        List<Duty> allDuty = Collections.singletonList(dutyService.getDutyById(id));
        System.out.println(allDuty);
        return allDuty;
    }

    @GetMapping("/dutyLog")
    public List<DutyLog> allDutyLogInformation(Model model) {
        List<DutyLog> allDutyLog = dutyLogService.getAllDutyLog();
        System.out.println(allDutyLog);
        return allDutyLog;
    }

}
