# plane_management_system
This is a Java-based console application for managing airplane seat bookings. It allows users to buy and cancel seats, view the seating plan, save/load data, and more. This system is built using basic arrays and object-oriented principles.

## Features

- **Buy a Seat** – Select a seat by row (A–D) and seat number to purchase a ticket.
- **Cancel a Seat** – Cancel a previously booked seat by row and seat number.
- **Find First Available Seat** – Automatically identifies the first unbooked seat.
- **Show Seating Plan** – Visual representation of the current seat layout.
- **Save/Load Data** – Save seat bookings and ticket data to files and reload them later.
- **Show Tickets Info** – Display all purchased tickets with customer and price information.
- **Sort Tickets** – View tickets sorted by price in ascending order.

## Seat Layout

- **Row A**: 14 seats
- **Row B**: 12 seats
- **Row C**: 12 seats
- **Row D**: 14 seats

Empty seats are represented by `0` and booked seats by `1`.

## Files

- `Main.java` – Entry point of the application. Handles the menu and user interactions.
- `Ticket.java` – Class to store ticket details including row, seat, price, and customer info.
- `Customer.java` – Class to store customer details: name, surname, and email.
- `seatingData.txt` – Stores seat booking data.
- `ticketData.txt` – Stores ticket details.

## How to Run

1. Open the project in IntelliJ IDEA or any Java IDE.
2. Make sure all `.java` files are in the same package or directory.
3. Run `Main.java`.
4. Follow the on-screen prompts to interact with the system.

## Dependencies

- Java 8 or higher
- No external libraries required

