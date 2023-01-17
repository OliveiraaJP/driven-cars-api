package com.carsapi.api.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.carsapi.api.dto.CarDTO;

@RestController
@RequestMapping("/api/cars")
public class CarController {
    
    @PostMapping()
    public void postCar(@RequestBody CarDTO req){
        System.out.println("Todos os dados:");
        System.out.println(req);
        System.out.println("\n");
        System.out.println("Modelo e ano:");
        System.out.println(req.modelo() + " " + req.anoModelo());
        System.out.println("\n");
    }
}
