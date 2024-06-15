package com.shipsaving.wms.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/wms/inbound")
public class InboundManagementController {

    @GetMapping("/create")
    public String createInboundOrder(){
        return "create inbound order";
    }
}
