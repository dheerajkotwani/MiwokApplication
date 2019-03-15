package project.tronku.miwokapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class Numbers extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        int a = 0;

        ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("One","ek"));
        words.add(new Word("Two","do"));
//        words.add("Three");
//        words.add("Four");
//        words.add("Five");
//        words.add("Six");
//        words.add("Seven");
//        words.add("Eight");
//        words.add("Nine");
//        words.add("Ten");

        
//        ArrayAdapter<Word> itemsAdapter=new ArrayAdapter<>(this,R.layout.list_layout,words);
//        ListView listview=(ListView) findViewById(R.id.list);
//        listview.setAdapter(itemsAdapter);
    }
}


