package me.hoonick.springbootjpa.test;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class Test {
    @Id
    @GeneratedValue
    private String id;
    private String name;
}
