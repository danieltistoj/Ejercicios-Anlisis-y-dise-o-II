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
public class ServerConnection {
    
      static int contador = 2;
      //static ServerConnection instance;
      static ArrayList<ServerConnection> arrayConexiones = new ArrayList<ServerConnection>();
      private ServerConnection(){
         
      }
      public static ArrayList createInstance(){
          if(arrayConexiones.size()==0){
               for(int i=0; i<contador;i++){
                   
                   ServerConnection conexion = new ServerConnection();
                   arrayConexiones.add(conexion);
                   System.out.println("se creo la conexion "+(i+1));
          }
          }
        return arrayConexiones;
      }
      
      public void algo(){
          System.out.println("algo");
      }
      
      

}
