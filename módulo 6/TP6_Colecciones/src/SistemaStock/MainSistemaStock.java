/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package SistemaStock;

import java.util.List;

public class MainSistemaStock {
    public static void main(String[] args) {
        Inventario inv = new Inventario();

        // 1. Crear al menos cinco productos con diferentes categorías y agregarlos al inventario.
        Producto p1 = new Producto("P001", "Arroz 1kg", 800.0, 50, CategoriaProducto.ALIMENTOS);
        Producto p2 = new Producto("P002", "Auriculares", 2500.0, 15, CategoriaProducto.ELECTRONICA);
        Producto p3 = new Producto("P003", "Remera", 1200.0, 30, CategoriaProducto.ROPA);
        Producto p4 = new Producto("P004", "Sartén", 3200.0, 8, CategoriaProducto.HOGAR);
        Producto p5 = new Producto("P005", "Leche 1L", 450.0, 100, CategoriaProducto.ALIMENTOS);

        inv.agregarProducto(p1);
        inv.agregarProducto(p2);
        inv.agregarProducto(p3);
        inv.agregarProducto(p4);
        inv.agregarProducto(p5);

        // 2. Listar todos los productos mostrando su información y categoría.
        System.out.println("LISTADO DE PRODUCTOS:");
        inv.listarProductos();
        System.out.println();

        // 3. Buscar un producto por ID y mostrar su información.
        System.out.println("BUSCAR PRODUCTO P002:");
        Producto buscado = inv.buscarProductoPorId("P002");
        if (buscado != null) buscado.mostrarInfo();
        else System.out.println("No encontrado.");
        System.out.println();

        // 4. Filtrar y mostrar productos que pertenezcan a una categoría específica.
        System.out.println("FILTRAR POR CATEGORIA: ALIMENTOS");
        List<Producto> alimentos = inv.filtrarPorCategoria(CategoriaProducto.ALIMENTOS);
        alimentos.forEach(Producto::mostrarInfo);
        System.out.println();

        // 5. Eliminar un producto por su ID y listar los productos restantes.
        System.out.println("ELIMINAR PRODUCTO P003:");
        boolean eliminado = inv.eliminarProducto("P003");
        System.out.println("Eliminado? " + eliminado);
        inv.listarProductos();
        System.out.println();

        // 6. Actualizar el stock de un producto existente.
        System.out.println("ACTUALIZAR STOCK P001 a 40:");
        inv.actualizarStock("P001", 40);
        System.out.println(inv.buscarProductoPorId("P001"));
        System.out.println();

        // 7. Mostrar el total de stock disponible.
        System.out.println("TOTAL DE STOCK: " + inv.obtenerTotalStock());
        System.out.println();

        // 8. Obtener y mostrar el producto con mayor stock.
        System.out.println("PRODUCTO CON MAYOR STOCK:");
        Producto mayor = inv.obtenerProductoConMayorStock();
        if (mayor != null) mayor.mostrarInfo();
        System.out.println();

        // 9. Filtrar productos con precios entre $1000 y $3000.
        System.out.println("PRODUCTOS CON PRECIO ENTRE 1000 Y 3000:");
        List<Producto> rangoPrecio = inv.filtrarProductosPorPrecio(1000, 3000);
        rangoPrecio.forEach(Producto::mostrarInfo);
        System.out.println();

        // 10. Mostrar las categorías disponibles con sus descripciones.
        inv.mostrarCategoriasDisponibles();
    }
}