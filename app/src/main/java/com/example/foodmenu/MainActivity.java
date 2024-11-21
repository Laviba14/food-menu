package com.example.foodmenu;

import android.os.Bundle;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView foodRecyclerView;
    private FoodAdapter foodAdapter;
    private List<FoodItem> foodList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        foodRecyclerView = findViewById(R.id.foodRecyclerView);

        // Set GridLayoutManager with 2 columns
        foodRecyclerView.setLayoutManager(new GridLayoutManager(this, 2));

        foodList = new ArrayList<>();
        foodList.add(new FoodItem("Pizza", "$10", R.drawable.pizza));
        foodList.add(new FoodItem("Burger", "$5", R.drawable.burger));
        foodList.add(new FoodItem("Pasta", "$8", R.drawable.pasta));

        foodAdapter = new FoodAdapter(this, foodList);
        foodRecyclerView.setAdapter(foodAdapter);
    }
}


