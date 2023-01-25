package com.mytests.spring.springdocopenapimvctest0.controllers;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/withOperation")
public class ControllerWithOperation {

    @Operation(summary = "test1_operation",
            operationId = "test1_id",
            description = "test1_operation_description", tags = "foo",
            parameters = {@Parameter(name = "dummy", description = "dummy parameter", required = false)}
    )
    @GetMapping("/test1")
    public String test1() {
        return "test1";
    }

    @GetMapping("/test2")
    public String test2() {
        return "test2";
    }

    @PostMapping("/exception")
    @Operation(
            summary = "Trigger an exception",
            responses = {
                    @ApiResponse(responseCode = "403", description = "oops")
            }
    )
    public void throwException(
            @Parameter(description = "Exception message") @RequestParam(name = "message", defaultValue = "test exception") String message) {
        throw new RuntimeException(message);
    }

}
