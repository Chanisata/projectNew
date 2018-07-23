package models;

/**
 * Created by COM2-06-PC on 10/7/2561.
 */
public class foot {
    private String id,name;
    private int price;

    public foot() {
    }

    public foot(String id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getprice() {
        return price;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setprice(int price) {
        this.price = price;
    }
}
