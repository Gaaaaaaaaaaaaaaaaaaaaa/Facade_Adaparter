/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.util.HashMap;
import java.util.Map;

public class StockServicio {
    private Map<String, Integer> stock = new HashMap<>();
        
             public StockServicio(){
                 stock.put("Laptop", 10);
                 stock.put("Teclado", 49);
                 stock.put ("Disco SSD", 15);
                 stock.put ("Procesador Ryzen 5 3400g", 90);
             }
             public void validarStock (String producto, int cantidad)   
                     throws Exception {
                 if (cantidad<=0) 
                     throw new Exception("La cantidad debe ser positiva");
             }
}

