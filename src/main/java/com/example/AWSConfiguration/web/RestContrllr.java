package com.example.AWSConfiguration.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class RestContrllr
{
    @GetMapping(value = { "/api" })
    public String getEmployeesByIdWithOptional()
    {
            return " something new after changes in new docker ";
    }
}
