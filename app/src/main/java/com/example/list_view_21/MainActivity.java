package com.example.list_view_21;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listView = findViewById(R.id.mylist);
        // creating array of list
        String names []= {"Akriti", "Prakriti", "Kriti","Riti","Ram","Shyam"};
        // displaying list using arrayAdapter
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.list_item, R.id.list_items, names);
        listView.setAdapter(adapter);
        // Handling click event on list items
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                // Retrieving value from array
                String value = adapter.getItem(position);

                // Displaying value in to Toast
                Toast.makeText(getApplicationContext(), "You just clicked on " + value, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
