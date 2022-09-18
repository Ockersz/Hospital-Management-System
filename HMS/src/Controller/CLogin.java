/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.MLogin;

/**
 *
 * @author Asiri
 */
public class CLogin {
    
    public static int registerEmployee(String name,int age,String address,int tp,String gender,String username,String password)
    {
        int i = 0;
        MLogin login = new MLogin();
        i = login.registerEmployee(name, age, address, tp, gender,username, password);
        
        return i;
    }
    
     public static boolean submitLoginDetails(String username, String password)
     {
         MLogin login  = new MLogin();
         boolean i = login.submitLoginDetails(username, password);
         return i;
     }
    
}
