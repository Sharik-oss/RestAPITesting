package com.javatpoint.server.main.versioning;

public class PersonV1 {
    private String name;
    public PersonV1(){
        super();
    }

    public String getName() {
        return name;
    }

    public PersonV1(String name) {
        super();
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
