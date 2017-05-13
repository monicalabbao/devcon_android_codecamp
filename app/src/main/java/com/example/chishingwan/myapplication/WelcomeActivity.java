package com.example.chishingwan.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;

/**
 * Created by Chi Shing Wan on 5/13/2017.
 */

public class WelcomeActivity extends AppCompatActivity {

    RecyclerView rvShoppingList;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        henlo();
        bindViews();
    }

    private void bindViews() {
        rvShoppingList = (RecyclerView) findViewById(R.id.rv_shoppinglist);
        rvShoppingList.setLayoutManager(new LinearLayoutManager(this));
        rvShoppingList.setAdapter(new ShoppingListAdapter());
    }

    private void henlo() {
        Intent intent = getIntent();
        String name = intent.getStringExtra("Name");
        getSupportActionBar().setTitle("Hello " + name);
    }

/*    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            onBackPressed();
        }
        return super.onOptionsItemSelected(item);
    }*/

/*    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }*/
}
