package com.minkyu.springjpa.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Builder
public class MemberDTO {

    String name;
    int age;

    @Override
    public String toString() {
        return "MemberDTO [name=" + name + ", age=" + age + "]";
    }
}
