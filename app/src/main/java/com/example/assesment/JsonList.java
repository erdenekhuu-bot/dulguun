package com.example.assesment;
import java.util.ArrayList;
import java.util.List;
public class JsonList {
    private String address;
    private String suburb;
    private String state;
    private String postcode;
    private String price;

    private static List<JsonList> propertyList = new ArrayList<>();

    JsonList(String address, String suburb, String state, String postcode, String price){
        this.address = address;
        this.suburb = suburb;
        this.state = state;
        this.postcode = postcode;
        this.price = price;
    }
    public static void addProperty(String address, String suburb, String state, String postcode, String price) {
        propertyList.add(new JsonList(address, suburb, state, postcode, price));
    }

    public static List<JsonList> getPropertyList() {
        return propertyList;
    }

    public String getAddress() {
        return address;
    }

    public String getSuburb() {
        return suburb;
    }

    public String getState() {
        return state;
    }

    public String getPostcode() {
        return postcode;
    }

    public String getPrice() {
        return price;
    }
}
