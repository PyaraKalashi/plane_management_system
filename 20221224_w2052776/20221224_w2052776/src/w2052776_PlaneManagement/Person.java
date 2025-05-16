package w2052776_PlaneManagement;

import javax.swing.plaf.PanelUI;

//Part B
//Task 7
//Attributes
public class Person {
   private String Name;
   private String SurName;
   private String  Email;
   // Object
   public Person(String Name,String SurName,String  Email){
      this.Name = Name;
      this.SurName = SurName;
      this.Email = Email;
   }
   //Getters
   public String getName(){

      return Name;
   }
   public String getSurName(){

      return SurName;
   }
   public String getEmail(){

      return Email;
   }
   //Setters
   public void setName(String Name){

      this.Name = Name;
   }
   public void setSurName(String Surname){

      this.SurName = Surname;
   }
   public void setEmail(String Email){

      this.Email = Email;
   }
   /**
   Method to print the personal information
    */
   public void print_Personal_Information(){
      System.out.println("Name :- "+ Name);
      System.out.println("Surname :- "+ SurName);
      System.out.println("Email :- " + Email);
   }
}
