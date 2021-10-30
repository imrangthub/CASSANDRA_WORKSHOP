package com.imranmadbar.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Table("user_tbl")
public class UserEntity {

    @PrimaryKey
    private int id;
    private String name;
    private String address;
    private int age;

    public UserEntity(String name, String address, int age) {
        this.name = name;
        this.address = address;
        this.age = age;
    }
}