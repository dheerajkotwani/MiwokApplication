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


        ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("One","lutti",R.drawable.number_one,R.color.number));
        words.add(new Word("Two","otiiko",R.drawable.number_two,R.color.number));
        words.add(new Word("Three","tolookosu",R.drawable.number_three,R.color.number));
        words.add(new Word("Four","oyyisa",R.drawable.number_four,R.color.number));
        words.add(new Word("Five","otiiko",R.drawable.number_five,R.color.number));
        words.add(new Word("Six","temmokka",R.drawable.number_six,R.color.number));
        words.add(new Word("Seven","kenekaku",R.drawable.number_seven,R.color.number));
        words.add(new Word("Eight","kawinta",R.drawable.number_eight,R.color.number));
        words.add(new Word("Nine","wo'e",R.drawable.number_nine,R.color.number));
        words.add(new Word("Ten","na'aacha",R.drawable.number_ten,R.color.number));

        WordAdapter itemsAdapter=new WordAdapter(this, words);
//        ArrayAdapter<Word> itemsAdapter=new ArrayAdapter<>(this,R.layout.list_layout,words);
        ListView listview=(ListView) findViewById(R.id.list);
        listview.setAdapter(itemsAdapter);
    }
}


