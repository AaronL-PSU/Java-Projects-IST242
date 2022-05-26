/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question;

import java.util.Scanner;

/**
 *
 * @author Aaron
 */
public class NumericQuestion extends Question {
    
     public boolean checkAnswer(String response) {
         
         double res = Double.parseDouble(response);
         double ans = Double.parseDouble(answer);
         if (Math.abs((res - ans))<=.01){
             return true;
         }
         else{
             return false;
         }
    }
}
