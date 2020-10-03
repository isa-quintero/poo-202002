package com.parcial.mercado;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Mercado {
    public static final byte CAPACIDAD = 18;
    private String supermercado;
    private List<Producto> productos;

    public Mercado(String supermercado) {
        this.supermercado = supermercado;
        this.productos = new ArrayList<>();
    }

    public boolean agregar(Producto p) {
        if (this.productos.size() < CAPACIDAD) {
            Producto productoBuscado = buscar(p.getNombre());

            if (productoBuscado == null) {
                this.productos.add(p);
                return true;
            } else {
                System.out.println("El producto " + productoBuscado.getNombre()  + " ya existe");
                return false;
            }
        } else {
            System.out.println("El mercado ya está lleno");
            return false;
        }
    }

    public boolean retirar(String nombre) {
        return this.productos.removeIf(producto -> {
            return producto.getNombre().equals(nombre);
        });
//        Producto productoBuscado = buscar(nombre);
//
//        if (productoBuscado == null) {
//            System.out.println("El producto " + nombre + " no existe en el carrito.");
//            return false;
//        } else {
//            this.productos.remove(productoBuscado);
//            return true;
//        }
    }

    public Producto buscar(String nombre) {
        return this.productos.stream()
                .filter(producto -> {
                        return producto.getNombre().equals(nombre);
                })
                .findFirst()
                .orElse(null);
    }

    public Producto buscar(int codigo) {
        Producto productoBuscado = null;

        for (Producto producto : this.productos) {
            if (producto.getCodigo() == codigo) {
                productoBuscado = producto;
                break;
            }
        }

        return productoBuscado;
    }

    public List<Producto> buscarPorTipo(String tipo) {
        return this.productos.stream()
                .filter(producto -> {
                    return producto.getTipo().equals(tipo);
                }).collect(Collectors.toList());

//        List<Producto> productosBuscados = new ArrayList<>();
//
//        for (Producto producto : this.productos) {
//            if (producto.getTipo().equals(tipo)) {
//                productosBuscados.add(producto);
//            }
//        }
//
//        return productosBuscados;
    }

    public int calcularTotal() {
        return this.productos.stream().mapToInt(p -> p.getCantidad() * p.getPrecio()).sum();
    }

    public List<Producto> getProductos() {
        return productos;
    }
}
