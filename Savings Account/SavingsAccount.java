/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package savingsaccount;

/**
 *
 * @author Aaron
 */
public class SavingsAccount {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double amount = Double.parseDouble(amountField.getText());
        double interest = Double.parseDouble(interestField.getText());
        double year = Double.parseDouble(yearField.getText());
        double balance = (amount*(1+interest*year));
    }
    
}
