import java.util.ArrayList;

public class House extends ArrayList<House>{
    
    @Override
    public String toString() {
        return "House [City=" + City + ", marla=" + marla + ", price=" + price + "]";
    }

    private String City;
    private int marla;
    private int price;
    
    public House(String city, int marla, int price) {
        City = city;
        this.marla = marla;
        this.price = price;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public int getMarla() {
        return marla;
    }

    public void setMarla(int marla) {
        this.marla = marla;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
    
}
