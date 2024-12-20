package com.example.assesment;

import java.util.ArrayList;
import java.util.List;

public class JsonList {
    private String address;
    private String suburb;
    private String state;
    private String postcode;
    private String price;

    public JsonList(String address, String suburb, String state, String postcode, String price) {
        this.address = address;
        this.suburb = suburb;
        this.state = state;
        this.postcode = postcode;
        this.price = price;
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

    public static void addProperty(String address, String suburb, String state, String postcode, String price) {
        List<JsonList> propertyList = new ArrayList<>();
        propertyList.add(new JsonList(address, suburb, state, postcode, price));
    }

    public static List<JsonList> getSamplePropertyList() {
        List<JsonList> propertyList = new ArrayList<>();
        propertyList.add(new JsonList("360", "Pier Point Road", "Cairns", "4870", "200000"));
        propertyList.add(new JsonList("250", "Sheridan St", "Cairns", "4870", "350000"));
        propertyList.add(new JsonList("86", "Taylor St", "Trinity Beach", "4879", "800000"));
        propertyList.add(new JsonList("17", "Martin St", "Cairns", "4870", "550000"));
        propertyList.add(new JsonList("715", "Mulgrave rd", "Earlivile", "4898", "40000"));
        return propertyList;
    }
}