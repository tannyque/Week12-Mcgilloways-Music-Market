package shop;

import behaviours.ISell;

import java.util.ArrayList;

public class Shop {

    private String name;
    private ArrayList<ISell> stock;

    public Shop(String name, ArrayList<ISell> stock) {
        this.name = name;
        this.stock = stock;
    }

    public String getName() {
        return name;
    }

    public int stockCount(){
        return this.stock.size();
    }

    public void addStock(ISell stock){
        this.stock.add(stock);
    }

    public void removeStock(Stock item){
        if (stock.contains(item)) {
            stock.remove(item);
        }
    }

    public double calculateTotalProfit(){
        double total = 0;
        for(ISell item: this.stock){
            total += item.calculateMarkup();
        }
        return total;
    }

}
