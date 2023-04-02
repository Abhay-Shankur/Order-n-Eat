package com.application.orderneat.dataModel;

public class CardViewModel {
    private int imgId;
    private String dishName;
    private String dishFrom;
    private int dishPrice;
    private float dishRating;

    public CardViewModel(int imgId, String dishName, String dishFrom, int dishPrice, float dishRating) {
        this.imgId = imgId;
        this.dishName = dishName;
        this.dishFrom = dishFrom;
        this.dishPrice = dishPrice;
        this.dishRating = dishRating;
    }

    public int getImgId() {
        return imgId;
    }

    public void setImgId(int imgId) {
        this.imgId = imgId;
    }

    public String getDishName() {
        return dishName;
    }

    public void setDishName(String dishName) {
        this.dishName = dishName;
    }

    public String getDishFrom() {
        return dishFrom;
    }

    public void setDishFrom(String dishFrom) {
        this.dishFrom = dishFrom;
    }

    public int getDishPrice() {
        return dishPrice;
    }

    public void setDishPrice(int dishPrice) {
        this.dishPrice = dishPrice;
    }

    public float getDishRating() {
        return dishRating;
    }

    public void setDishRating(float dishRating) {
        this.dishRating = dishRating;
    }
}
