package com.adapterdesign.adapter.adapter;

import org.springframework.beans.factory.annotation.Autowired;

public class AssignmentWork {
    @Autowired
    private Pen p;

    public Pen getP() {
        return p;
    }

    public void setP(Pen p) {
        this.p = p;
    }

    public String writeAssignment(String str){
          p.write(str);
          return str;
    }
}
