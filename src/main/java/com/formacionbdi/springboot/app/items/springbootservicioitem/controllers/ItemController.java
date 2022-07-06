package com.formacionbdi.springboot.app.items.springbootservicioitem.controllers;

import com.formacionbdi.springboot.app.items.springbootservicioitem.models.Item;
import com.formacionbdi.springboot.app.items.springbootservicioitem.models.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ItemController {

  @Autowired
  @Qualifier("serviceFeign")
  private ItemService itemService;

  @GetMapping("/listar")
  public List<Item> listar(@RequestParam(name = "nombre", required = false) String nombre,
                           @RequestHeader(name = "token-request", required = false) String token){
    System.out.println(nombre);
    System.out.println(token);
    return itemService.findAll();
  }

  @GetMapping("/ver/{id}/cantidad/{cantidad}")
  public Item detalle(@PathVariable Long id, @PathVariable Integer cantidad) {
    return itemService.findById(id, cantidad);
  }


}
