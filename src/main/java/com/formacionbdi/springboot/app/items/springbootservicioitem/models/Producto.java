package com.formacionbdi.springboot.app.items.springbootservicioitem.models;

import lombok.Getter;
import lombok.Setter;

import java.beans.Transient;
import java.util.Date;

@Getter
@Setter
public class Producto {

  private Long id;
  private String nombre;
  private Double precio;
  private Date createAt;
  private Integer port;
}
