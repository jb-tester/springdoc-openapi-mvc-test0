package com.mytests.spring.springdocopenapimvctest0.model;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * *
 * <p>Created by irina on 11/22/2021.</p>
 * <p>Project: springdoc-openapi-mvc-test0</p>
 * *
 */
@Schema(name = "api1_data", description = "data object for api1")
public class Api1Data {

    String prop1;
    String prop2;

    public Api1Data(String prop1, String prop2) {
        this.prop1 = prop1;
        this.prop2 = prop2;
    }
    @Schema(name="first_property", description = "api1_data prop1")
    public String getProp1() {
        return prop1;
    }

    public void setProp1(String prop1) {
        this.prop1 = prop1;
    }
    @Schema(name="second_property", description = "api1_data prop2")
    public String getProp2() {
        return prop2;
    }

    public void setProp2(String prop2) {
        this.prop2 = prop2;
    }

    @Override
    public String toString() {
        return "Api1Data{" +
                "prop1='" + prop1 + '\'' +
                ", prop2='" + prop2 + '\'' +
                '}';
    }
}
