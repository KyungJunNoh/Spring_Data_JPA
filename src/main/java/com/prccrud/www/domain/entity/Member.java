package com.prccrud.www.domain.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Member {
    @Id @GeneratedValue
    private Long idx;
    private String id;
    private String name;


    public Member(Long idx, String id, String name) {
        this.idx = idx;
        this.id = id;
        this.name = name;
    }

    public void update(String id, String name){
        this.id = id;
        this.name = name;
    }
}
