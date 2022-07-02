package com.formacionbdi.springboot.app.items.springbootservicioitem.models.service;

import com.formacionbdi.springboot.app.items.springbootservicioitem.models.Item;

import java.util.List;

public interface ItemService {

  List<Item> findAll();
  Item findById (Long id, Integer cantidad);
}
