package com.minkyu.springjpa.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/deleteapi")
public class DeleteController {

    @DeleteMapping("/delete/{variable}")
    public String delete(@PathVariable String variable) {
        return variable;
    }

}
