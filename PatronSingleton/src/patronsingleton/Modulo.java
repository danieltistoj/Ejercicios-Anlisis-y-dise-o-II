/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package patronsingleton;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Modulo {
    private ServerConnection serverConnection;
    public Modulo(){
        ServerConnection s = serverConnection.createInstance();
        s.algo();
    }

}
