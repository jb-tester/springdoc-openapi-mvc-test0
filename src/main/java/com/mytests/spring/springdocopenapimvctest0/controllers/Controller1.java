package com.mytests.spring.springdocopenapimvctest0.controllers;

import com.mytests.spring.springdocopenapimvctest0.model.Api1Data;

import java.util.ArrayList;
import java.util.List;

/**
 * *
 * <p>Created by irina on 11/22/2021.</p>
 * <p>Project: springdoc-openapi-mvc-test0</p>
 * *
 */
//@RestController
public class Controller1 implements Api1 {

    List<Api1Data> datas = new ArrayList<>();

    @Override
    public String m11() {
        return "m11";
    }

    @Override
    public String m12(String param1) {
        datas.add(new Api1Data("created by m12", param1));
        return "m12 " + param1;
    }

    @Override
    public String all() {
        String rez = "api1 data:";
        for (Api1Data data : datas) {
            rez = rez + data.toString() + "\n";
        }
        return rez;
    }

    @Override
    public void addData(Api1Data data) {
        datas.add(data);
    }
}
