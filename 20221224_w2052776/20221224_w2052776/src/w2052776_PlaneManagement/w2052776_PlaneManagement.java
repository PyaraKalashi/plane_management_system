package w2052776_PlaneManagement;

import java.io.File;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

//Task 1
//Making arrays
public class w2052776_PlaneManagement {
    static Ticket[] TicketsArray=new Ticket[52];
    static int count=1;
    public static void main(String[] args) {

        int option = 0;

        Scanner input = new Scanner(System.in);

        int RowsOfThePlane[][] = new int[4][];
        RowsOfThePlane[0] = new int[14];
        RowsOfThePlane[1] = new int[12];
        RowsOfThePlane[2] = new int[12];
        RowsOfThePlane[3] = new int[14];

        // Creating 2d array for the Seating plan

        // Task 2

        // Adding the user menu

        System.out.println("************ Welcome to the plane management system ************");

        while (true) {
            System.out.println("*******************************************************");
            System.out.println("*                Menu Options                         *");
            System.out.println("*******************************************************");
            System.out.println("        1) Buy a seat                                  ");
            System.out.println("        2) Cancel a seat                               ");
            System.out.println("        3) Find first available seat                   ");
            System.out.println("        4) Show seating plan                           ");
            System.out.println("        5) Print tickets information and total sales   ");
            System.out.println("        6) Search ticket                               ");
            System.out.println("        0) Quit                                        ");
            System.out.println("*******************************************************");

            boolean correct = false;

            while (!correct) {

                try {
                    System.out.print("Please select an option :- ");
                    option = input.nextInt();
                    correct = true;
                }

                catch (InputMismatchException e) {
                    System.out.println("Please enter numbers.");
                    input.nextLine();
                }

            }

            /*
            Calling all methods
             */

            if (option == 1) {
                System.out.println("Buy a seat");
                w2052776_PlaneManagement BookingTheSeats=new w2052776_PlaneManagement();
                BookingTheSeats.buy_seat(RowsOfThePlane,TicketsArray);
            }

            else if (option == 2) {
                System.out.println("Cancel a seat");
                w2052776_PlaneManagement CancelingTheSeats=new w2052776_PlaneManagement();
                CancelingTheSeats.cancel_seat(RowsOfThePlane,TicketsArray);
            }

            else if (option == 3) {
                System.out.println("Finding the first available seat");
                w2052776_PlaneManagement FindingTheFirstAvailableSeats=new w2052776_PlaneManagement();
                FindingTheFirstAvailableSeats.find_first_available(RowsOfThePlane);
            }

            else if (option == 4) {
                System.out.println("Showing the seating plan");
                w2052776_PlaneManagement ShowingTheSeatPlan=new w2052776_PlaneManagement();
                ShowingTheSeatPlan.show_seating_plan(RowsOfThePlane);
            }

            else if (option == 5) {
                System.out.println("Printing tickets information and total sales");
                System.out.println("You choosed option 5");
                w2052776_PlaneManagement TicketPrinting = new w2052776_PlaneManagement();
                TicketPrinting.print_tickets_info(TicketPrinting.TicketsArray);
            }

            else if (option == 6) {
                System.out.println("Seaching ticket");
                w2052776_PlaneManagement SearchTicket = new w2052776_PlaneManagement();
                SearchTicket.search_ticket(RowsOfThePlane,TicketsArray);
            }

            else if (option == 0) {
                System.out.println("Quit.");
                break;
            }

            else {
                System.out.println("Invalid option.");
            }

        }

    }

    // Task 3
    /**
    Method for buy seat
     */
    public void buy_seat(int[][] RowsOfThePlane,Ticket[] TicketsArray) {
        boolean has;
        String Name;
        String SurName;
        String Email;
        String Row;
        int Seat;
        int Price;
        int UserPreference;
        String LetterOfTheRow;
        int NumberOfTheSeat;

        Scanner input = new Scanner(System.in);

        if (count < 52) {
            while (true) {
                while (true) {
                    System.out.print("Enter the row letter you want :- ");
                    String fullInput = input.nextLine();
                    char firstChar = fullInput.charAt(0);
                    LetterOfTheRow = String.valueOf(Character.toUpperCase(firstChar));
                    if (LetterOfTheRow.equalsIgnoreCase("A")) {
                        break;
                    }

                    else if (LetterOfTheRow.equalsIgnoreCase("B")) {
                        break;
                    }

                    else if (LetterOfTheRow.equalsIgnoreCase("C")) {
                        break;
                    }

                    else if (LetterOfTheRow.equalsIgnoreCase("D")) {
                        break;
                    }

                    else {
                        System.out.println("Please enter a valid seat row letter from A to D.");
                        System.out.println("Please Select a different row letter or a Seat number.");
                        continue;
                    }

                }

                Row = LetterOfTheRow;

                if (LetterOfTheRow.equalsIgnoreCase("A")) {
                    while (true) {
                        try {
                            System.out.print("Enter the seat number that want to reserve :- ");
                            NumberOfTheSeat = input.nextInt();
                            if (NumberOfTheSeat < 1 || NumberOfTheSeat > 14) {
                                System.out.println("Please Enter a valid number for the seat.");
                            }

                            else {
                                Seat = NumberOfTheSeat;
                                break;
                            }
                        }

                        catch (InputMismatchException e) {
                            System.out.println("Invalid seat number.");
                            input.nextLine();
                        }
                    }

                    if (RowsOfThePlane[0][NumberOfTheSeat - 1] == 0) {
                        RowsOfThePlane[0][NumberOfTheSeat - 1] = 1;
                        break;
                    }

                    else {
                        System.out.println("Sorry the seat you asked is already reserved.");
                        System.out.println("Please select a different row letter or seat number.");
                        continue;
                    }
                }

                else if (LetterOfTheRow.equalsIgnoreCase("B")) {
                    while (true) {
                        try {
                            System.out.print("Enter the seat number that want to reserve :- ");
                            NumberOfTheSeat = input.nextInt();

                            if (NumberOfTheSeat < 1 || NumberOfTheSeat > 12) {
                                System.out.println("Please Enter a valid number for the seat.");
                            }

                            else {
                                Seat = NumberOfTheSeat;
                                break;
                            }
                        }

                        catch (InputMismatchException e) {
                            System.out.println("Invalid seat number.");
                            input.nextLine();

                        }
                    }

                    if (RowsOfThePlane[1][NumberOfTheSeat - 1] == 0) {
                        RowsOfThePlane[1][NumberOfTheSeat - 1] = 1;
                        break;
                    }

                    else {
                        System.out.println("Sorry the seat you asked is already reserved.");
                        System.out.println("Please select a different row letter or a seat number.");
                        continue;
                    }
                }

                else if (LetterOfTheRow.equalsIgnoreCase("C")) {
                    while (true) {
                        try {
                            System.out.print("Enter the seat number that want to reserve :- ");
                            NumberOfTheSeat = input.nextInt();

                            if (NumberOfTheSeat < 1 || NumberOfTheSeat > 12) {
                                System.out.println("Please Enter a valid number for the seat.");
                            }

                            else {
                                Seat = NumberOfTheSeat;
                                break;
                            }
                        }

                        catch (InputMismatchException e) {
                            System.out.println("Invalid seat number.");
                            input.nextLine();
                        }
                    }

                    if (RowsOfThePlane[2][NumberOfTheSeat - 1] == 0) {
                        RowsOfThePlane[2][NumberOfTheSeat - 1] = 1;
                        break;
                    }

                    else {
                        System.out.println("Sorry the seat you asked is already reserved.");
                        System.out.println("Please select a different row letter or a seat number.");
                        continue;
                    }
                }
                else {
                    while (true) {
                        try {
                            System.out.print("Enter the seat number that want to reserve :- ");
                            NumberOfTheSeat = input.nextInt();
                            if (NumberOfTheSeat < 1 || NumberOfTheSeat > 14) {
                                System.out.println("Please Enter a valid number for the seat.");
                            }
                            else {
                                Seat = NumberOfTheSeat;
                                break;
                            }
                        }
                        catch (InputMismatchException e) {
                            System.out.println("Invalid seat number.");
                            input.nextLine();
                        }
                    }
                    if (RowsOfThePlane[3][NumberOfTheSeat - 1] == 0) {
                        RowsOfThePlane[3][NumberOfTheSeat - 1] = 1;
                        break;
                    }
                    else {
                        System.out.println("Sorry the seat you asked is already reserved.");
                        System.out.println("Please select a different row letter or a seat number.");
                        continue;
                    }
                }
            }
            // Prices of tickets

            if (NumberOfTheSeat >= 1 && NumberOfTheSeat <= 5) {
                Price = 200;
            } else if (NumberOfTheSeat >= 6 && NumberOfTheSeat <= 9) {
                Price = 150;
            } else {
                Price = 180;
            }
            while(true){
                System.out.print("Enter your name :- ");
                Name = input.next();
                if(Name.length()>5 && Name.length()<=100){
                    break;
                }
                else{
                    System.out.println("Enter a name which has minimum of 6 letters and maximum of 100 characters.");
                    continue;
                }
            }
            while (true){
                System.out.print("Enter your surname :- ");
                SurName = input.next();
                if(SurName.length()>5 && SurName.length()<=100){
                    break;
                }
                else{
                    System.out.println("Enter a surname which has minimum of 6 letters and maximum of 100 characters.");
                    continue;
                }
            }
            while (true){
                System.out.print("Enter your email :- ");
                Email = input.next();
                has=Email.contains("@gmail.com");
                if(has==true){
                    break;
                }
                else{
                    System.out.println("Invalid Gmail.");
                }

            }

            Person person = new Person(Name, SurName, Email);
            Ticket ticket = new Ticket(Row, Seat, Price, person);
            System.out.println("You have successfully purchased the seat.");
            for (int i = 0; i < TicketsArray.length; i++) {
                if (TicketsArray[i] == null) {
                    TicketsArray[i] = ticket;
                    try {
                        ticket.save( TicketsArray[i].getRow()+TicketsArray[i].getSeat()+".txt");
                        System.out.println("Ticket has been saved.");
                    } catch (IOException e) {
                        System.err.println("Error occur while saving " + e.getMessage());
                    }
                    count++;
                    break;
                    //Exit after assigning one ticket
                }
            }
            Seat = NumberOfTheSeat;
            while (true) {
                try {
                    System.out.print("If you want to return back to the main menu enter 7 :-");
                    UserPreference = input.nextInt();
                    if (UserPreference != 7) {
                        System.out.println("Please enter number 7.");
                    } else {
                        break;
                    }
                }
                catch (InputMismatchException e) {
                    System.out.println("Please enter only number 7.");
                    input.nextLine();
                }
            }
        }

        else {
            System.out.println("The tickets have been sold out.");
        }
    }
    // Task 4

    /**
      Method to Cancel the seat
     */
    public void cancel_seat(int[][]  RowsOfThePlane, Ticket[] TicketArray) {
        int Seat ;
        String Row;
        int UserPreference;
        String LetterOfTheRow;
        int NumberOfTheSeat;
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.print("Enter the row letter that you want to cancel :- ");
            String fullInput = input.nextLine();
            char firstChar = fullInput.charAt(0);
            LetterOfTheRow = String.valueOf(Character.toUpperCase(firstChar));
            if (LetterOfTheRow.equalsIgnoreCase("A")) {
                break;
            }
            else if (LetterOfTheRow.equalsIgnoreCase("B")) {
                break;
            }
            else if (LetterOfTheRow.equalsIgnoreCase("C")) {
                break;
            }
            else if (LetterOfTheRow.equalsIgnoreCase("D")) {
                break;
            }
            else {
                System.out.println("Please enter a valid seat row letter from A to D.");
                continue;
            }
        }
        Row = LetterOfTheRow;
        while (true) {
            if (LetterOfTheRow.equalsIgnoreCase("A")) {
                while (true) {
                    try {
                        System.out.print("Enter the seat number that want to cancel from the reservation :- ");
                        NumberOfTheSeat = input.nextInt();
                        if (NumberOfTheSeat < 1 || NumberOfTheSeat > 14) {
                            System.out.println("Please Enter a valid number for the seat.");
                        } else {
                            Seat = NumberOfTheSeat;
                            break;
                        }
                    } catch (InputMismatchException e) {
                        System.out.println("Invalid seat number.");

                    }
                }
                if (RowsOfThePlane[0][NumberOfTheSeat - 1] == 1) {
                    RowsOfThePlane[0][NumberOfTheSeat - 1] = 0;
                } else {
                    System.out.println("The seat is available.");
                    break;
                }
            } else if (LetterOfTheRow.equalsIgnoreCase("B")) {
                while (true) {
                    try {
                        System.out.print("Enter the seat number that want to cancel from the reservation :- ");
                        NumberOfTheSeat = input.nextInt();
                        if (NumberOfTheSeat < 1 || NumberOfTheSeat > 12) {
                            System.out.println("Please Enter a valid number for the seat.");
                        } else {
                            Seat = NumberOfTheSeat;
                            break;
                        }
                    } catch (InputMismatchException e) {
                        System.out.println("Invalid seat number");
                    }
                }
                if (RowsOfThePlane[1][NumberOfTheSeat - 1] == 1) {
                    RowsOfThePlane[1][NumberOfTheSeat - 1] = 0;
                } else {
                    System.out.println("The seat is available.");
                    break;
                }
            } else if (LetterOfTheRow.equalsIgnoreCase("C")) {
                while (true) {
                    try {
                        System.out.print("Enter the seat number that want to cancel from the reservation :- ");
                        NumberOfTheSeat = input.nextInt();
                        if (NumberOfTheSeat < 1 || NumberOfTheSeat > 12) {
                            System.out.println("Please Enter a valid number for the seat.");
                        } else {
                            Seat = NumberOfTheSeat;
                            break;
                        }
                    } catch (InputMismatchException e) {
                        System.out.println("Invalid seat number.");
                    }
                }
                if (RowsOfThePlane[2][NumberOfTheSeat - 1] == 1) {
                    RowsOfThePlane[2][NumberOfTheSeat - 1] = 0;
                } else {
                    System.out.println("The seat is available.");
                    break;
                }
            } else {
                while (true) {
                    try {
                        System.out.print("Enter the seat number that want to cancel from the reservation :- ");
                        NumberOfTheSeat = input.nextInt();
                        if (NumberOfTheSeat < 1 || NumberOfTheSeat > 14) {
                            System.out.println("Please Enter a valid number for the seat.");
                        } else {
                            Seat = NumberOfTheSeat;
                            break;
                        }
                    } catch (InputMismatchException e) {
                        System.out.println("Invalid seat number.");
                    }
                }
                if (RowsOfThePlane[3][NumberOfTheSeat - 1] == 1) {
                    RowsOfThePlane[3][NumberOfTheSeat - 1] = 0;
                } else {
                    System.out.println("This seat is available.");
                    break;
                }
            }
            System.out.println("This seat is cancelled");
            for (int i = 0; i < TicketArray.length; i++) {
                if (TicketArray[i] != null) {
                    String fileName = TicketArray[i].getRow() + TicketArray[i].getSeat() + ".txt"; // Construct file name
                    File file = new File(fileName);
                    if (file.exists()) {
                        file.delete();
                        System.out.println("Due to Ticket cancellation the saved ticket file has been deleted.");
                    } else {
                        System.err.println("No file Found" + fileName);
                    }
                    TicketArray[i] = null;
                    count--;
                    break;
                    // Exit after assigning one ticket
                }
            }
            break;
        }
            //Going back to the menu
            while (true) {
                try{
                    System.out.print("If you want to return back to the main menu enter 7 :-");
                    UserPreference= input.nextInt();
                    if(UserPreference!=7) {
                        System.out.println("Please enter number 7.");
                    }
                    else {
                        break;
                    }
                }
                catch (InputMismatchException e) {
                    System.out.println("Please enter only number 7.");
                    input.nextLine();
                }
            }
    }
    //Task 5
    /**
    A method to find the first available seat
     */
    public void find_first_available(int [][] RowsOfThePlane) {
        Scanner input = new Scanner(System.in);
        boolean SeatAvailable = false;
        for (int p = 0; p < RowsOfThePlane.length && !SeatAvailable; p++) {
            for (int y = 0; y < RowsOfThePlane[p].length;y++){
                if (RowsOfThePlane[p][y]==0){
                    SeatAvailable=true;
                    if (RowsOfThePlane[0][y]==0){
                        System.out.println("The available seat row is :- A." );
                        System.out.println("The seat number is :- "+(y+1)+".");
                    }
                    else if (RowsOfThePlane[1][y]==0){
                        System.out.println("The available seat row is :- B.");
                        System.out.println("The seat number is :- "+(y+1)+".");
                    }
                    else if (RowsOfThePlane[2][y]==0){
                        System.out.println("The available seat row is :- C.");
                        System.out.println("The seat number is :- "+(y+1)+".");
                    }
                    else{
                        System.out.println("The available seat row is :- D.");
                        System.out.println("The seat number is :- "+(y+1)+".");
                    }
                break;
                }
            }
        }
        //Going back to the menu
        while (true) {
            try{
                System.out.print("If you want to return back to the main menu enter 7 :-");
                int UserPreference= input.nextInt();
                if(UserPreference!=7) {
                    System.out.println("Please enter number 7.");
                }
                else {
                    break;
                }
            }
            catch (InputMismatchException e) {
                System.out.println("Please enter only number 7.");
                input.nextLine();
            }
        }
    }

    //Task 6
    /**
    A method to show the seating plan
     */
    public void show_seating_plan(int [][] RowsOfThePlane){
        int UserPreference;
        Scanner input = new Scanner(System.in);
        for(int[] i :RowsOfThePlane){
            for(int element : i){
                if(element==0){
                    System.out.print(" O ");
                }
                else{
                    System.out.print(" X ");
                }
            }
            System.out.println();
            if(i == RowsOfThePlane[1]) {
                System.out.println();
            }
        }
        //Going back to the menu
        while (true) {
            try{
                System.out.print("If you want to return back to the main menu enter 7 :-");
                UserPreference= input.nextInt();
                if(UserPreference!=7) {
                    System.out.println("Please enter number 7.");
                }
                else {
                    break;
                }
            }
            catch (InputMismatchException e) {
                System.out.println("Please enter only number 7.");
                input.nextLine();
            }
        }
    }
    //Task 10
    /**
    A method for printing ticket information
     */
    public static void print_tickets_info(Ticket [] TicketArray){
        int Total_Tickets_Sold = 0;  // This variable is used to calculate the total sales of the tickets
        int UserPreference;
        Scanner input = new Scanner(System.in);
        for(int j=0 ; j < TicketArray.length; j++) {
            if (TicketArray[j] != null) {
                TicketArray[j].Ticket_Information();
                Total_Tickets_Sold+=TicketsArray[j].getPrice();
            }
        }
        System.out.println("Total of the sold tickets Price is :- €" +Total_Tickets_Sold);
        while (true) {
            try {
                System.out.print("If you want to return back to the main menu enter 7 :- ");
                UserPreference = input.nextInt();
                if (UserPreference !=7) {
                    System.out.println("Please enter only number 7.");
                    input.nextLine();
                }
                else {
                    break;
                }
            }
            catch (InputMismatchException e) {
                System.out.println("Please enter only number 7.");
                input.nextLine();
            }
        }
    }
    //Task 11
    /**
     A method to search tickets the user need
     */
    public void search_ticket(int [][] RowsOfThePlane ,Ticket[] TicketsArray) {

        int Seat;
        String Row;
        int UserPreference;
        String LetterOfTheRow;
        int NumberOfTheSeat;
        boolean found=false;
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.print("Enter the row letter you want to search :- ");
            String fullInput = input.nextLine();
            char firstChar = fullInput.charAt(0);
            LetterOfTheRow = String.valueOf(Character.toUpperCase(firstChar));
            if (LetterOfTheRow.equalsIgnoreCase("A")) {
                break;
            }
            else if (LetterOfTheRow.equalsIgnoreCase("B")) {
                break;
            }
            else if (LetterOfTheRow.equalsIgnoreCase("C")) {
                break;
            }
            else if (LetterOfTheRow.equalsIgnoreCase("D")) {
                break;
            }
            else {
                System.out.println("Please enter a valid seat row letter from A to D.");
                continue;
            }
        }
        Row = LetterOfTheRow;
        if (LetterOfTheRow.equalsIgnoreCase("A")) {
           while (true) {
               try {
                   System.out.print("Enter the seat number that you want to search :- ");
                   NumberOfTheSeat = input.nextInt();
                   if (NumberOfTheSeat < 1 || NumberOfTheSeat > 14) {
                       System.out.println("Please enter a valid number of seat.");
                   }
                   else {
                       Seat = NumberOfTheSeat;
                       break;
                   }
               }
               catch (InputMismatchException e ) {
                   System.out.println("Invalid seat number.");
               }
           }
        }
        else if (LetterOfTheRow.equalsIgnoreCase("B")) {
            while (true) {
                try {
                    System.out.print("Enter the seat number that you want to search :- ");
                    NumberOfTheSeat = input.nextInt();
                    if (NumberOfTheSeat < 1 || NumberOfTheSeat > 12) {
                        System.out.println("Please enter a valid number of seat.");
                    }
                    else {
                        Seat = NumberOfTheSeat;
                        break;
                    }
                }
                catch (InputMismatchException e) {
                    System.out.println("Invalid seat number.");
                }
            }
        }
        else if (LetterOfTheRow.equalsIgnoreCase("C")) {
            while (true) {
                try {
                    System.out.print("Enter the seat number you want to search :- ");
                    NumberOfTheSeat = input.nextInt();
                    if (NumberOfTheSeat < 1 || NumberOfTheSeat > 12) {
                        System.out.println("Please enter a valid seat number.");
                    }
                    else {
                        Seat = NumberOfTheSeat;
                        break;
                    }
                }
                catch (InputMismatchException e) {
                    System.out.println("Invalid seat number.");
                }
            }
        }
        else {
            while (true) {
                try {
                    System.out.print("Enter the seat number that you want to search :- ");
                    NumberOfTheSeat = input.nextInt();
                    if (NumberOfTheSeat < 1 || NumberOfTheSeat > 14) {
                        System.out.println("Please enter a valid seat number.");
                    }
                    else {
                        Seat = NumberOfTheSeat;
                        break;
                    }
                }
                catch (InputMismatchException e) {
                    System.out.println("Invalid seat number.");
                }
            }
        }
        for (int j=0; j<TicketsArray.length; j++) {
            if(TicketsArray[j]!=null && TicketsArray[j].getRow().equals(LetterOfTheRow) && TicketsArray[j].getSeat()==NumberOfTheSeat) {
                TicketsArray[j].Ticket_Information();
                found=true;
                break;
            }

        }
        if(!found){
            System.out.println("No information founded . The seat is available.");
        }
        while(true) {
            try {
                System.out.print("If you want to return to the main menu enter 7 :- ");
                UserPreference = input.nextInt();
                if(UserPreference !=7) {
                    System.out.println("Please enter number 7.");
                }
                else {
                    break;
                }
            }
            catch (InputMismatchException e) {
                System.out.println("Please enter only number 7.");
                input.nextLine();
            }
        }
    }
}
