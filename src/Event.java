import java.time.LocalDate;

public class Event {
    private String name;
    private int amount;
    private LocalDate date;
    private String location;
    private String type;
    private int id;

    public Event(String name, int amount, LocalDate date, String location, String type, int id)
    {
        this.name = name;
        this.amount = amount;
        this.date = date;
        this.location = location;
        this.type = type;
        this.id = id;
    }


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmount() {
        return this.amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public LocalDate getDate() {
        return this.date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getLocation() {
        return this.location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }
}