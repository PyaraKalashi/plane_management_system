package w2052776_PlaneManagement;
//Task 8
//Attributes

import java.io.IOException;
import java.io.PrintWriter;

public class Ticket {
    private String Row;
    private int Seat;
    private int Price;
    private Person person;

    // Object
    public Ticket(String Row, int Seat, int Price, Person person) {
        this.Row = Row;
        this.Seat = Seat;
        this.Price = Price;
        this.person = person;

    }
    //Getters
    public String getRow(){
        return Row; }
    public int getSeat(){
        return Seat; }
    public double getPrice(){
        return Price ;}
    public Person getPerson(){
        return person ;}
    //Setters
    public void setRow(String Row){
        this.Row=Row; }
    public void setSeat(int Seat){
        this.Seat = Seat;
    }
    public void setPrice(int Price){
        this.Price=Price;
    }
    public void setPerson(Person person) {
        this.person=person;
    }
    /*
    Method to print the personal information
     */
    public void Ticket_Information(){
        System.out.println("Row :- " + Row);
        System.out.println("Seat :- " + Seat);
        System.out.println("Price :- €"+ Price);
        System.out.println("Person Information");
        person.print_Personal_Information();
    }
    //Task 12
    /**
     Method for file handling
     */
    public void save(String fileName) throws IOException {

        try (PrintWriter writer = new PrintWriter(fileName)) {
            writer.println("Client Information");
            writer.println("Name: " + person.getName());
            writer.println("Surname: " + person.getSurName());
            writer.println("Email: " + person.getEmail());
            writer.println("------------------------------------------------------");
            writer.println("Client Ticket Information");
            writer.println("Row: " + Row);
            writer.println("Seat: " + Seat);
            writer.println("Price: €" + Price);
        }
    }


}
