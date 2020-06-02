package com.isoft.travellodge.controller;

import com.isoft.travellodge.model.Customer;
import com.isoft.travellodge.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @PostMapping("/addNewCustomer")
    public String addNewCustomer(Customer customer) {
        customerService.addNewCustomer(customer);
        return "registerSuccessfulPage";
    }

}
