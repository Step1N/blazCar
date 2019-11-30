package com.blazcar.shopper.service;

import com.blazcar.shopper.dto.ItemDTO;
import com.blazcar.shopper.dto.ItemsDTO;
import com.blazcar.shopper.entity.Item;

public interface ItemService {

  public ItemDTO findItemById(String itemID);

  public ItemsDTO findItems();

  public ItemDTO findItemByName(String itemName);

  public ItemsDTO findMissingItems();

  public ItemDTO storeItem(ItemDTO itemDTO);
}
