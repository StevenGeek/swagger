package com.steven.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@RestController
@RequestMapping("steven/")
public class Swagger2CustomController {
    @RequestMapping(value = "info/", method = RequestMethod.GET)
    @ApiOperation(value = "返回给的参数+ Test Success!", notes = "note随便输")
    public String fuzzyQueryCityInfo(@ApiParam(value = "返回参数") @RequestParam(required = false, value = "steven") String steven) {
        return steven + " Test Success!";
    }
}
