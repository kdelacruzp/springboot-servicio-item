package com.formacionbdi.springboot.app.items.springbootservicioitem.clients;

import com.formacionbdi.springboot.app.commons.springbootserviciocommons.models.entity.Producto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import javax.ws.rs.Path;
import java.util.List;

@FeignClient(name = "servicio-productos")
public interface ProductoClienteRest {

  @GetMapping("/listar")
  List<Producto> listar();
  @GetMapping("/ver/{id}")
  Producto detalle(@PathVariable Long id);

  @PostMapping("/crear")
  Producto crear(@RequestBody Producto producto);

  @PutMapping("/editar/{id}")
  Producto update(@RequestBody Producto producto, @PathVariable Long id);

  @DeleteMapping("/eliminar/{id}")
  void eliminar(@PathVariable Long id);
}
