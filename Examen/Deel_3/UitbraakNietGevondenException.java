package Examen.Deel_3;

public class UitbraakNietGevondenException extends Exception {
    //fields
    private String message;
    //constructor
    public UitbraakNietGevondenException(String message) {
        super(message);
    } 
}
