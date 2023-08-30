package com.jbeans.sonarjacoco.service;

import org.springframework.stereotype.Service;

@Service
public class MessageService {
    public String getColor(String code){
        String color=null;
        if(code.equals("gr")){
            color="Green";
        } else if (code.equals("re")) {
            color="Red";
        }
        return color;
    }

    public String getShape(String code) {
        String shape=null;
        if(code.equals("tr")){
            shape="Triangle ";
        } else if (code.equals("sq")) {
            shape="Square";
        }
        return shape;
    }
}
