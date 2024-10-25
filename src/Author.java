import java.util.ArrayList;

public class Author {
    private String name;
    private ArrayList<Title> titles = new ArrayList<>();

    public Author(String name) {
        this.name = name;
    }

    public void addTitle(Title title) {
        titles.add(title);
    }

    public float calculateTotalPay(){
        float total = 0;
        for (Title i : titles) {
            total += i.calculateRoyalties();
        }
        return total;
    }

    public String getName(){
        return name;
    }
}
