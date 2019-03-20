package project.tronku.miwokapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Phrases extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phrases);

        ArrayList<Word> words=new ArrayList<Word>();

        words.add(new Word("Where are you going?","minto wuksus",-1));
        words.add(new Word("What is your name?","tinnә oyaase'nә",-1));
        words.add(new Word("My name is...?","oyaaset...",-1));
        words.add(new Word("How are you feeling?","michәksәs?",-1));
        words.add(new Word("I'm feeling good","kuchi achit",-1));
        words.add(new Word("Are you coming?","әәnәs'aa?",-1));
        words.add(new Word("Yes, I'm coming","hәә’әәnәm",-1));
        words.add(new Word("I'm coming","әәnәm",-1));
        words.add(new Word("Let's go","yoowutis",-1));
        words.add(new Word("Come here","әnni'nem",-1));

        WordAdapter itemAdapter= new WordAdapter(this, words, R.color.phrases);
        ListView listView=(ListView) findViewById(R.id.list);
        listView.setAdapter(itemAdapter);
    }
}
