import java.util.Scanner; 
import java.util.ArrayList;
import java.time.LocalDate;

class Main {
    private static ArrayList<Event> events = new ArrayList<>();
    public static int count = 0;
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("*******************************");
        System.out.println("*                             *");
        System.out.println("*   Welcome to EventKeeper!   *");
        System.out.println("*                             *");
        System.out.println("*******************************");

        System.out.println("Please identify yourself.");
        System.out.println("1. Guest");
        System.out.println("2. Admin");

        int selection = myObj.nextInt();
        switch (selection)
        {
            case 1:
                break;
            case 2:
                adminMenu(selection, myObj);
                break;
            default:
                main(null);
                break;
        }
    }

    private static void adminMenu(int selection, Scanner scanner)
    {
        System.out.println("*******************************");
        System.out.println("*                             *");
        System.out.println("*  Welcome to the Admin Panel *");
        System.out.println("*                             *");
        System.out.println("*         Administrator       *");
        System.out.println("*                             *");
        System.out.println("*******************************");

        System.out.println("Please select an option.");
        System.out.println("1. Add new event");
        System.out.println("2. Modify existing event");
        System.out.println("3. Delete event");
        System.out.println("4. Show list of events");
        System.out.println("5. Seach for events");

        selection = scanner.nextInt();
        switch (selection)
        {
            case 1:
                addNewEvent(scanner);
                adminMenu(selection, scanner);
                break;
            case 4:
                showListOfEvents();
                adminMenu(selection, scanner);
                break;
            default:
                break;
        }
    }

    private static void addNewEvent(Scanner scanner)
    {
        scanner.nextLine();
        System.out.println("Enter event name:");
        String name = scanner.nextLine();

        System.out.println("Enter event amount:");
        int amount = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Enter event date (yyyy-mm-dd):");
        String dateString = scanner.nextLine();
        LocalDate date = LocalDate.parse(dateString);

        System.out.println("Enter event location:");
        String location = scanner.nextLine();

        System.out.println("Enter event type:");
        String type = scanner.nextLine();

        Event newEvent = new Event(name, amount, date, location, type, Main.count);
        events.add(newEvent);

        System.out.println("Event added: " + newEvent);
        Main.count++;
    }

    private static void showListOfEvents() {
        if (events.isEmpty()) {
            System.out.println("No events found.");
        } else {
            for (Event event : events) {
                String eventID = String.format("%05d", Main.count);
                System.out.println("=== Event ID" + eventID + " ===");
                String eventName = event.getName();
                System.out.println("Name: " + eventName);
                int eventAmount = event.getAmount();
                System.out.println("Amount: " + eventAmount);
                LocalDate eventDate = event.getDate();
                System.out.println("Date: " + eventDate);
                String eventType = event.getType();
                System.out.println("Type: " + eventType);
                System.out.println(" ");
            }
        }
    }
}