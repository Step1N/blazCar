package com.blazcar.shopper.controller;

import com.blazcar.shopper.dto.ItemDTO;
import com.blazcar.shopper.dto.ItemsDTO;
import com.blazcar.shopper.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ItemsController {

  @Autowired
  ItemService itemService;

  @GetMapping("/")
  public String healthCheck() {
    return "Hey, thanks for checking i'm healthy!";
  }


  @GetMapping("/item")
  public ItemDTO findItem() {
    return null;
  }

  @PostMapping("/storeItem/")
  public ItemDTO saveInventory(@RequestBody ItemDTO itemDTO) {

    return itemService.storeItem(itemDTO);
  }

  @GetMapping("/items")
  public ItemsDTO findItems() {
    return null;
  }

  @GetMapping("/item/{itemName}")
  public ItemsDTO findItems(@RequestParam("itemName") String itemName) {

    return null;
  }

}
