package com.blazcar.shopper.serviceImpl;

import com.blazcar.shopper.dto.ItemDTO;
import com.blazcar.shopper.dto.ItemsDTO;
import com.blazcar.shopper.entity.Item;
import com.blazcar.shopper.repository.ItemRepository;
import com.blazcar.shopper.service.ItemService;
import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ItemServiceImpl implements ItemService {

  @Autowired
  ItemRepository itemRepository;

  @Autowired
  DozerBeanMapper dozerBeanMapper;

  @Override
  public ItemDTO findItemById(String itemID) {

    Optional<Item> optionItem = itemRepository.findById(itemID);
    ItemDTO itemDTO = dozerBeanMapper.map(optionItem.get(), ItemDTO.class);

    return itemDTO;
  }

  @Override
  public ItemDTO storeItem(ItemDTO itemDTO) {
    Item item = dozerBeanMapper.map(itemDTO, Item.class);
    Item savedItem = itemRepository.save(item);

    itemDTO = dozerBeanMapper.map(savedItem, ItemDTO.class);

    return itemDTO;
  }

  @Override
  public ItemsDTO findItems() {

    return null;
  }

  @Override
  public ItemDTO findItemByName(String itemName) {
    return null;
  }

  @Override
  public ItemsDTO findMissingItems() {
    return null;
  }
}
