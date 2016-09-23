package com.example.deepika_singh.transaction;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by deepika_singh on 9/23/2016.
 */

public class InvoiceAdapter extends ArrayAdapter {
    List list = new ArrayList();
    InvoiceAdapter(Context context, int resource) {
        super(context, resource);
    }

    public class DataHandler{
        TextView item;
        TextView price;
    }

    @Override
    public void add(Object object){
        super.add(object);
        list.add(object);
    }

    @Override
    public int getCount(){
        return this.list.size();
    }

    @Override
    public Object getItem(int position){
        return this.list.get(position);
    }

@Override
    public View getView(int position, View convertView, ViewGroup parent){
        View row;
        row = convertView;
        DataHandler handler;
        if(convertView == null)
        {
            LayoutInflater inflater = (LayoutInflater) this.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            row = inflater.inflate(R.layout.row_layout,parent,false);
            handler = new DataHandler();
            handler.item = (TextView)row.findViewById(R.id.item);
            handler.item = (TextView)row.findViewById(R.id.price);
            row.setTag(handler);

        }
        else{
            handler = (DataHandler) row.getTag();
        }
        InvoiceData data;
        data = (InvoiceData) this.getItem(position);

        handler.item.setText(data.getList_items());
        handler.price.setText(data.getList_price());



        return row;
    }
}

