package com.cart.buy.buycart;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import com.cart.buy.buycart.adapter.RecyclerViewDataAdapter;
import com.cart.buy.buycart.model.SectionDataModel;
import com.cart.buy.buycart.model.SingleItemModel;

import java.util.ArrayList;

public class HomeActivity extends AppCompatActivity {

    ArrayList<SectionDataModel> allSampleData;
    ArrayList<String> products = new ArrayList<>();
    ArrayList<String> names = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        products.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRwe1uM_8WsclGfQTj3mD0oRExsk0ibAdQ05njfqgNCmREDe1Ecag");
        products.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQUpeNSvSowqhVziArsAF5MgdSpd8829Bs_8TwXlbca_5ABvgZ2");
        products.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRQB93B6rg6-m1uIycW8Bj3j6N8nC-VuXutQH4pcEMlU2NB10MbFA");
        products.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQjR9_Bha2A-04OcjyVPA1fv-KfJ9Xl-bEblgg-DkgwmXXz6vIyJQ");
        products.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQjR9_Bha2A-04OcjyVPA1fv-KfJ9Xl-bEblgg-DkgwmXXz6vIyJQ");
        products.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRwe1uM_8WsclGfQTj3mD0oRExsk0ibAdQ05njfqgNCmREDe1Ecag");
        products.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQUpeNSvSowqhVziArsAF5MgdSpd8829Bs_8TwXlbca_5ABvgZ2");
        products.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRQB93B6rg6-m1uIycW8Bj3j6N8nC-VuXutQH4pcEMlU2NB10MbFA");
        products.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQjR9_Bha2A-04OcjyVPA1fv-KfJ9Xl-bEblgg-DkgwmXXz6vIyJQ");
        products.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQjR9_Bha2A-04OcjyVPA1fv-KfJ9Xl-bEblgg-DkgwmXXz6vIyJQ");

        names.add("Chips");
        names.add("Jam Bottels");
        names.add("Banana Fresh");
        names.add("Cans");
        names.add("Chips");
        names.add("Jam Bottels");
        names.add("Banana Fresh");
        names.add("Cans");

        allSampleData = new ArrayList<SectionDataModel>();

        createDummyData();
        RecyclerView my_recycler_view = (RecyclerView) findViewById(R.id.my_recycler_view);
        my_recycler_view.setHasFixedSize(true);
        RecyclerViewDataAdapter adapter = new RecyclerViewDataAdapter(this, allSampleData);
        my_recycler_view.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        my_recycler_view.setAdapter(adapter);

    }



    public void createDummyData() {
        for (int i = 1; i <= 4; i++) {
            SectionDataModel dm = new SectionDataModel();
            if(i == 1) {
                dm.setHeaderTitle("Best Seller");
            } else {
                dm.setHeaderTitle("Pick For You");
            }

            ArrayList<SingleItemModel> singleItem = new ArrayList<>();
            for (int j = 0; j <= 5; j++) {
                String product, name;
                if(products.size() - 1  > j) {
                    product = products.get(j);
                } else {
                    product = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRkQaTFsAwiKOa0-4veH8Lu_hK2fbwIiegguewzIXRzQuSlv3NGGw";
                }
                if(names.size() - 1  > j) {
                    name = names.get(j);
                } else  {
                    name = "Fruits & Products";
                }
                singleItem.add(new SingleItemModel(name, product));
            }
            dm.setAllItemsInSection(singleItem);
            allSampleData.add(dm);
        }
    }
}


