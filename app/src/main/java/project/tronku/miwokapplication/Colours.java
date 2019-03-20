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

        ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("Red","weṭeṭṭi",R.drawable.color_red));
        words.add(new Word("Green","chokokki",R.drawable.color_green));
        words.add(new Word("Brown","ṭakaakki",R.drawable.color_brown));
        words.add(new Word("Gray","ṭopoppi",R.drawable.color_gray));
        words.add(new Word("Black","kululli",R.drawable.color_black));
        words.add(new Word("White","kelelli",R.drawable.color_white));
        words.add(new Word("Dusty Yellow","ṭopiisә",R.drawable.color_dusty_yellow));
        words.add(new Word("Mustard Yellow","chiwiiṭә",R.drawable.color_mustard_yellow));


        WordAdapter itemsAdapter=new WordAdapter(this,words,R.color.colors);
        ListView listview=(ListView) findViewById(R.id.colors);
        listview.setAdapter(itemsAdapter);
    }
}
