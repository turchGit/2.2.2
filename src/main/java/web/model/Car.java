package web.model;

public class Car {
    int price;
    int weight;
    String name;

    public Car(int price, int weight, String name) {
        this.price = price;
        this.weight = weight;
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
