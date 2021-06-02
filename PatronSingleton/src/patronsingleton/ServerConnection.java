/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package patronsingleton;

import java.util.ArrayList;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class ServerConnection {
      
      static ServerConnection instance;
      //static ArrayList<ServerConnection> arrayConexiones = new ArrayList<ServerConnection>();
      private ServerConnection(){
         
      }
      public static ServerConnection createInstance(){
          if(instance == null){
              instance = new ServerConnection();
          }
          return instance;
      }
      public void algo(){
          System.out.println("algo");
      }
      
     
}
