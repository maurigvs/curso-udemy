package org.udemy.exceptions;

public class BusinessException extends Exception {

    public BusinessException(String msg){
        super(msg);
    }

    public void printMessage(){
        System.out.println("Operation error: " + this.getMessage());
    }
}
