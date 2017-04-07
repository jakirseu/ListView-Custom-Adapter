package me.jakir.listviewcustomadaptar;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<ShoppingList> shoppingLists = new ArrayList<ShoppingList>();
    ListView list;
    ShoppingListAdapter adapter;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        populateListView();
    }

    private void populateListView() {

        ShoppingList shopping1 = new ShoppingList("Buy Coffee", false);
        shoppingLists.add(shopping1);

        ShoppingList shopping2 = new ShoppingList("Buy Milk", true);
        shoppingLists.add(shopping2);

        adapter = new ShoppingListAdapter(this, R.layout.list_item, shoppingLists);
        list = (ListView) findViewById(R.id.list_view);
        list.setAdapter(adapter);


    }


}
