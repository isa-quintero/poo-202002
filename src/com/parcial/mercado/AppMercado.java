package com.parcial.mercado;

import java.util.List;

public class AppMercado {
    public static void main(String[] args) {
        Producto cerveza = new Producto(1, "Cerveza", 2, 4000, TipoProducto.LICOR);
        Producto manzana = new Producto(2, "Manzana", 4, 600, TipoProducto.FRUTA);
        Producto pan = new Producto(3, "Pan Campesino", 1, 5000, TipoProducto.PAN);

        Mercado mercado = new Mercado("Carulla");
        mercado.getProductos().add(cerveza);
        mercado.getProductos().add(manzana);

        mercado.agregar(manzana);
        mercado.agregar(cerveza);

        imprimirProductos(mercado.getProductos());
    }

    public static void imprimirProductos(List<Producto> productos) {
        productos.forEach(producto -> {
            System.out.println(producto.getNombre());
        });
    }
}
