/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MODEL;


import CONTROLLER.controller;
public   class PaymentService implements ITransaction{
    
    controller ct=new controller();
    
    public void payAmount(int amount, String trxID,char ch) {
        // Logic for payment processing
        ct.print_transaction_info(ch);
    }

   

}
