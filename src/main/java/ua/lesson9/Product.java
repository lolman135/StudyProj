package ua.lesson9;

class Product<T> {
    private T id;
    private int price;

    Product (T id, int price){
        this.id = id;
        this.price = price;
    }

    public T getId(){
        return id;
    }

    public int getPrice() {
        return price;
    }
}
