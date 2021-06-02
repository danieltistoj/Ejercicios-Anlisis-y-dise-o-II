/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patronsingleton2;

import java.util.ArrayList;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Patronsingleton2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       ArrayList<ServerConnection> arrayConexiones = new ArrayList<ServerConnection>();
       ServerConnection conexion = null;
       arrayConexiones = conexion.createInstance();
       
       arrayConexiones.get(0).algo();
       arrayConexiones.get(1).algo();
      
       System.out.println("Tamaño del array: "+arrayConexiones.size());
    }
    
}
