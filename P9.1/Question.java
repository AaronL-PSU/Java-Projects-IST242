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
/** A question with a text and an answer. */
public class Question {
    protected String text;
    protected String answer;
    protected String response;
   
    public Question() {
        text = "";
        answer = "";
    }
    public void getResponse(){
        Scanner sc = new Scanner(System.in);
        response = sc.nextLine();
    }
   
    public void setText(String questionText) {
        text = questionText;
    }
    public void setAnswer(String correctAnswer) {
        answer = correctAnswer;
    }
   
    public boolean checkAnswer(String response) {
        return response.equals(answer);
    }
    public void display() {
        System.out.println(text);
    }
}

