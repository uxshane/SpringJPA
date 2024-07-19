package com.minkyu.springjpa.controller;

import com.minkyu.springjpa.data.dto.MemberDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/postapi")
public class PostController {

    @PostMapping("/default")
    public String defaultPost() {
        return "Default Post";
    }

    @PostMapping("/member")
    public String postMember(@RequestBody Map<String, Object> postData) {
        StringBuilder sb = new StringBuilder();
        postData.forEach((key, value) ->
                sb.append(key).append(" : ").append(value).append("\n"));
        return sb.toString();
    }

    @PostMapping("/member2")
    public String postMember2(@RequestBody MemberDTO memberDTO) {
        return memberDTO.toString();
    }

}
