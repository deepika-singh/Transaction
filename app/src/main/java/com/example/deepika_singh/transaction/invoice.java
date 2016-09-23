package com.example.deepika_singh.transaction;


import android.os.Bundle;

import android.widget.ListView;
import android.app.Activity;


public class invoice extends Activity {

    ListView listView;
    String[] list_items;
    String[] list_price;
    InvoiceAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_invoice);
        listView = (ListView) findViewById(R.id.listview);
        list_items = getResources().getStringArray(R.array.list_items);
        list_price = getResources().getStringArray(R.array.list_price);
        int i =0;
        adapter = new InvoiceAdapter(getApplicationContext(),R.layout.row_layout);
        listView.setAdapter(adapter);
        for(String items: list_items)
        {
            InvoiceData invoice = new InvoiceData(list_items[i],items,list_price[i]);
            adapter.add(invoice);
            i++;
        }

    }


}
