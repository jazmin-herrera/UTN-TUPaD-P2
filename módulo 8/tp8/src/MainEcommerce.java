
import ecommerce.modelos_p1.Cliente;
import ecommerce.modelos_p1.Pedido;
import ecommerce.modelos_p1.Producto;
import ecommerce.pagos_p1.TarjetaCredito;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author herre
 */
public class MainEcommerce {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        Cliente cliente = new Cliente("Jazmín", "jazmin@mail.com");
        Pedido pedido = new Pedido(cliente);

        pedido.agregarProducto(new Producto("Auriculares", 25000));
        pedido.agregarProducto(new Producto("Mouse Gamer", 18000));

        System.out.println("Total del pedido: $" + pedido.calcularTotal());
        pedido.cambiarEstado("En preparación");

        TarjetaCredito tarjeta = new TarjetaCredito("Jazmín Herrera");
        double totalConDescuento = tarjeta.aplicarDescuento(pedido.calcularTotal());
        tarjeta.procesarPago(totalConDescuento);
    }
} 