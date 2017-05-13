package com.example.chishingwan.myapplication;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Chi Shing Wan on 5/13/2017.
 */

public class ShoppingListAdapter extends RecyclerView.Adapter<ShoppingListAdapter.ShoppingListViewHolder> {

    ArrayList<ShoppingListItem> list;

    public ShoppingListAdapter() {
        list = new ArrayList<>();
        populateList();
    }

    private void populateList() {
        ShoppingListItem item1 = new ShoppingListItem();
        item1.setName("Raisins");
        item1.setQty(1);
        item1.setPrice(45.00);
        list.add(item1);

        ShoppingListItem item2 = new ShoppingListItem();
        item2.setName("Flour");
        item2.setQty(2);
        item2.setPrice(37.00);
        list.add(item2);

        ShoppingListItem item3 = new ShoppingListItem();
        item3.setName("The Elder Scrolls V Skyrim");
        item3.setQty(1);
        item3.setPrice(999.00);
        list.add(item3);
    }

    @Override
    public ShoppingListViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_shopping, parent, false);
        return new ShoppingListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ShoppingListViewHolder holder, int position) {
        holder.itemName.setText(list.get(position).getName());
        holder.itemPrice.setText("Php " + list.get(position).getPrice());
        holder.itemQty.setText("" + list.get(position).getQty());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    protected class ShoppingListViewHolder extends RecyclerView.ViewHolder {
        TextView itemName;
        TextView itemQty;
        TextView itemPrice;
        public ShoppingListViewHolder(View itemView) {
            super(itemView);
            itemName = (TextView) itemView.findViewById(R.id.item_name);
            itemQty = (TextView) itemView.findViewById(R.id.item_qty);
            itemPrice = (TextView) itemView.findViewById(R.id.item_price);
        }
    }

}
