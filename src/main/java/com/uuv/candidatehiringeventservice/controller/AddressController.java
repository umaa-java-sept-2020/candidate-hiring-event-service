package com.uuv.candidatehiringeventservice.controller;

import com.uuv.candidatehiringeventservice.model.Address;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AddressController {

    @GetMapping("/address/")
    public String getAllAddress() {
        return "All the employee list";
    }
    @PostMapping("/address/")
    public String saveAddress(){
        return "save address";
    }
    @PutMapping("/address/update")
    public String updateAddress(){
        return "update address";
    }
    @DeleteMapping("/address/delete")
    public String deleteAddress(){
        return "delete address";
    }
}
