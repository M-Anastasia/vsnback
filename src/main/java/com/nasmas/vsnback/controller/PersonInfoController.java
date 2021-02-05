package com.nasmas.vsnback.controller;

import com.nasmas.vsnback.model.PersonInfo;
import com.nasmas.vsnback.service.PersonInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class PersonInfoController {

    @Autowired
    private PersonInfoService personInfoService;

    @GetMapping("/person_info/{id}")
    public ResponseEntity<PersonInfo> getPersonInfoById(@PathVariable Long id) {
        PersonInfo personInfo = personInfoService.getPersonInfoById(id);
        if (personInfo == null) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        } else return new ResponseEntity<>(personInfo, HttpStatus.OK);
    }
}
