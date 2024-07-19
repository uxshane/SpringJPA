package com.minkyu.springjpa.controller;

import com.minkyu.springjpa.dto.MemberDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/putapi")
public class PutController {

    @PutMapping("/default")
    public String putDefault() {
        return "default put";
    }

    @PutMapping("/member")
    public String putMember(@RequestBody Map<String, Object> putData) {
        StringBuilder sb = new StringBuilder();
        putData.forEach(
                (key, value) -> sb.append(key).append("=").append(value)
        );

        return sb.toString();
    }

    @PutMapping("/member2")
    public String putMember2(@RequestBody MemberDTO memberDTO) {
        return memberDTO.toString();
    }

    @PutMapping("/member3")
    public MemberDTO putMember3(@RequestBody MemberDTO memberDTO) {
        return memberDTO;
    }

    @PutMapping("/member4")
    public ResponseEntity<MemberDTO> putMember4(@RequestBody MemberDTO memberDTO) {
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(memberDTO);
    }

}
