package com.mytests.spring.springdocopenapimvctest0.controllers;

import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.tags.Tags;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Tags({
        @Tag(name = "controller_tag1", description = "description for controller_tag1"),
        @Tag(name = "controller_tag2", description = "description for controller_tag2"),

})
@RestController
@RequestMapping("/withTags")
public class ControllerWithTags {

    @Tags({
            @Tag(name = "test0_tag1", description = "test0 tag1 description"),
            @Tag(name = "test0_tag2", description = "test0 tag2 description")
    })
    @GetMapping(value = "/test0")
    public String test0_method() {
        return "test0";
    }

    @Tag(name = "test1_tag", description = "test1 tag description")
    @GetMapping(value = "/test1")
    public String test1_method() {
        return "test1";
    }

    @GetMapping(value = "/test2")
    public String test2_method() {
        return "test2";
    }


}
