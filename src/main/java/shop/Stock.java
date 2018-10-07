package shop;

import behaviours.ISell;

public abstract class Stock implements ISell {

    private String brand;
    private String model;
    private Double purchasePrice;
    private Double sellingPrice;

    public Stock(String brand, String model, Double purchasePrice, Double sellingPrice) {
        this.brand = brand;
        this.model = model;
        this.purchasePrice = purchasePrice;
        this.sellingPrice = sellingPrice;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public Double getPurchasePrice() {
        return purchasePrice;
    }

    public Double getSellingPrice() {
        return sellingPrice;
    }

    public Double calculateMarkup() {
        return (sellingPrice - purchasePrice);
    }
}
