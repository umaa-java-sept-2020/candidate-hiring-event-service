package com.uuv.candidatehiringeventservice.controller;

import com.uuv.candidatehiringeventservice.model.Company;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CompanyController {
    @GetMapping("/company")
    public List<Company> getAllAddressList(){
        return null;
    }
    @GetMapping("/company/{uuid}")
    public Company getCompanyById(@PathVariable ("uuid") String uid){
        return null;
    }
    @PostMapping("/company")
    public Company createCompany(@RequestBody Company company){
        return null;
    }
    @PutMapping("/company/{uuid}")
    public Company updateCompany(@RequestBody Company company ,@PathVariable ("uuid") String uid){
        return null;
    }
    @DeleteMapping("/company/{uuid}")
    public Company deleteCompany(@PathVariable("uuid") String uid){
        return null;
    }
}