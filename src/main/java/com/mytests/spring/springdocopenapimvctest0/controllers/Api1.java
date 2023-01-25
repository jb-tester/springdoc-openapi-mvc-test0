package com.mytests.spring.springdocopenapimvctest0.controllers;

import com.mytests.spring.springdocopenapimvctest0.model.Api1Data;
import io.swagger.v3.oas.annotations.Hidden;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


/**
 * *
 * <p>Created by irina on 11/22/2021.</p>
 * <p>Project: springdoc-openapi-mvc-test0</p>
 * *
 */
/*@Tags({
@Tag(name = "api11", description = "the API for Api1: tag1"),
@Tag(name = "api12", description = "the API for Api1: tag2")
})*/
public interface Api1 {

    @Hidden
    @Tag(name = "api11", description = "the API for Api1: tag1")
    @Operation(summary = "api1:get mapping1", description = "m11 mapping description", tags = {"api11"})
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "successful operation"),
            @ApiResponse(responseCode = "400", description = "Invalid status value")})
    @GetMapping(value = "/test_api1/m11", produces = {"application/xml", "application/json"})
    String m11();

    @Tag(name = "api12", description = "the API for Api1: tag2")
    @Operation(summary = "api1:get mapping2", description = "m12 mapping with pathvar description")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "successful operation"),
            @ApiResponse(responseCode = "400", description = "Invalid status value")})
    @GetMapping(value = "/test_api1/m12/{param1}", produces = {"application/xml", "application/json"})
    String m12(@Parameter(description = "some path variable", required = true) @PathVariable("param1") String param1);

    @Tag(name = "api11", description = "the API for Api1: tag1")
    @Operation(summary = "api1:get all datas", description = "return all data", tags = {"api11"})
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "successful operation"),
            @ApiResponse(responseCode = "400", description = "Invalid status value")})
    @GetMapping(value = "/test_api1/all", produces = {"application/xml", "application/json"})
    String all();

    @Operation(summary = "api1: add data", description = "Add new data")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Successful operation", content = {@Content(mediaType = "application/xml", schema = @Schema(implementation = Api1Data.class)), @Content(mediaType = "application/json", schema = @Schema(implementation = Api1Data.class))}),
            @ApiResponse(responseCode = "405", description = "Invalid input")
    })
    @PostMapping(value = "/test_api1/add", consumes = {"application/json"})
    void addData(
            @Parameter(description = "Create new data", required = true)
            @Valid
            @RequestBody(description = "Created data object", required = true,
                    content = @Content(
                            schema = @Schema(implementation = Api1Data.class))) Api1Data data);
}
