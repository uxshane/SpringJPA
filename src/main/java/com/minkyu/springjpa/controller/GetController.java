package com.minkyu.springjpa.controller;

import com.minkyu.springjpa.data.dto.MemberDTO;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api")
public class GetController {

    @GetMapping("/name")
    public String getName() {
        return "Minkyu";
    }

    @GetMapping("/variable1/{variable}")
    public String getVariable1(@PathVariable("variable") String variable) {
        return variable;
    }

    @GetMapping("/variable2/{variable}")
    public String getVariable2(@PathVariable("variable") String var) {
        return var;
    }

    @GetMapping("/request1")
    public String getRequestParam1(@RequestParam String name,
                                   @RequestParam String age) {

        return name + " / " + age;
    }

    @GetMapping("/request2")
    public String getRequestParam2(
            @RequestParam Map<String, String> params) {
        StringBuilder sb = new StringBuilder();
        params.forEach((key, value) -> {
            sb.append(key).append(" : ").append(value).append("\n");
        });
        return sb.toString();
    }

    @GetMapping("/request3")
    public String getRequestParam3(MemberDTO memberDTO) {
        return memberDTO.toString();
    }

}
