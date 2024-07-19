package com.minkyu.springjpa.data.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter
@ToString
public class MemberDTO {

    private String name;
    private int age;

}
