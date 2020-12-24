package com.uuv.candidatehiringeventservice.controller;

import com.uuv.candidatehiringeventservice.model.Address;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AddressController {
    @GetMapping("/addresses")
    public List<Address> getAllAddressList(){
        return null;
    }
    @GetMapping("/addresses/{uuid}")
    public Address getAddressByUid(@PathVariable ("uuid") String uid){
        return null;
    }
    @PostMapping("/addresses")
    public Address createAddress(@RequestBody Address address){
        return null;
    }
    @PutMapping("/addresses/{uuid}")
    public Address updateAddress(@RequestBody Address address ,@PathVariable ("uuid") String uid){
       return null;
    }
    @DeleteMapping("/addresses/{uuid}")
    public Address deleteAddress(@PathVariable("uuid") String uid){
        return null;
    }

}
