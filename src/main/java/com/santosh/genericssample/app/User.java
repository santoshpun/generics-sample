package com.santosh.genericssample.app;

import com.santosh.genericssample.ModelBase;
import lombok.Getter;

@Getter
public class User extends ModelBase {
    private int id;
    private String name;

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
