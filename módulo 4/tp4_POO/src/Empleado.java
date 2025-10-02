/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author herre
 */
public class Empleado {

    /**
     * @param args the command line arguments
     */
    
        
// Declaramos los atributos 
      private int id; 
      private String nombre; 
      private String puesto; 
      private double salario; 
      
      private static int totalEmpleados = 0;
      
      public int getId() { 
          return id; 
}
      public void setId(int id) { 
          this.id = id; 
} 
      public String getNombre() { 
          return nombre; 
}
      public void setNombre(String nombre) { 
          this.nombre = nombre; 
}
      public String getPuesto() { 
          return puesto; 
} 
      public void setPuesto(String puesto) { 
          this.puesto = puesto; 
} 
      public double getSalario() { 
          return salario; 
} 
      public void setSalario(double salario) { 
          this.salario = salario; 
} 
      public static int getTotalEmpleados() { 
          return totalEmpleados; 
} 
      public static void setTotalEmpleados(int totalEmpleados) { 
           Empleado.totalEmpleados = totalEmpleados; 
}
    }
    

