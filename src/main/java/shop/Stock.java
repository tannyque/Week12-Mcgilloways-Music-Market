package shop;

import behaviours.ISell;

public abstract class Stock implements ISell {

    private Double purchasePrice;
    private Double sellingPrice;

    public Stock(Double purchasePrice, Double sellingPrice) {
        this.purchasePrice = purchasePrice;
        this.sellingPrice = sellingPrice;
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
