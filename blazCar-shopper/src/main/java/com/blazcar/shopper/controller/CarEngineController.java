package com.blazcar.shopper.controller;

import com.blazcar.shopper.dto.CarEngineDTO;
import com.blazcar.shopper.service.CarEngineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarEngineController {

  @Autowired
  CarEngineService carEngineService;

  @GetMapping("/carEngine")
  public CarEngineDTO findCarEngine() {
    return null;
  }

  @PostMapping("/storeEngine")
  public CarEngineDTO storeCarEngines(@RequestBody CarEngineDTO carEngineDTO) {
    return carEngineService.storeCarEngine(carEngineDTO);
  }
}
