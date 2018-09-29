package com.romaintestard;

public class NegativePaymentException extends Exception {
    // Define class variable
    double payment;

    //1. Constructor that takes the value that would be throw the exception
    // 2. Assign value of local variable class variable
    public NegativePaymentException(double payment) {
       this.payment = payment;
    }

    // 3. Override the toString() method to include the specific exception message
    public String toString() {
        return "Error: Negative payments are not allowed! " + payment;
    }

}
