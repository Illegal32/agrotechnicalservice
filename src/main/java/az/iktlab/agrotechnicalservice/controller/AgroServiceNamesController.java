package az.iktlab.agrotechnicalservice.controller;

import az.iktlab.agrotechnicalservice.service.AgroService;
import az.iktlab.agrotechnicalservice.dao.model.CodeBeautify;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AgroServiceNamesController {

    @Autowired
    AgroService service;

    @GetMapping("/data1")
    public CodeBeautify getAgro() {
        return service.getAgroServices();
    }
}
