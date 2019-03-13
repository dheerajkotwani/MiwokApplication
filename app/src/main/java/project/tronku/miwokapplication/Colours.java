package project.tronku.miwokapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Colours extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colours);

        ArrayList<String> words = new ArrayList<String>();

        words.add("Red");
        words.add("Orange");
        words.add("White");
        words.add("Blue");
        words.add("Pink");
        words.add("Yellow");
        words.add("Brown");
        words.add("Violet");
        words.add("Indigo");
        words.add("Black");

        ArrayAdapter<String> itemsAdapter=new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,words);
        ListView listview=(ListView) findViewById(R.id.list);
        listview.setAdapter(itemsAdapter);
    }
}
