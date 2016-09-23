package com.example.deepika_singh.transaction;

/**
 * Created by deepika_singh on 9/23/2016.
 */

public class InvoiceData {
    private String list_items;
    private String list_price;

    public String getList_items() {
        return list_items;
    }

    public InvoiceData(String list_item, String list_items, String list_price){
        this.setList_items(list_items);
        this.setList_price(list_price);
    }

    public void setList_items(String list_items) {
        this.list_items = list_items;
    }

    public String getList_price() {
        return list_price;
    }

    public void setList_price(String list_price) {
        this.list_price = list_price;
    }
}
