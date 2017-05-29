/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptionhandlingwithoutdefaulthandler;

/**
 *
 * @author tiago.lucas
 */
public class ExceptionHandlingWithoutDefaultHandler {

    /**
     * @param args the command line arguments
     */
    static void subroutine(){
        int d=0;
        int a=10/d;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        ExceptionHandlingWithoutDefaultHandler.subroutine();
    }
    
}
