package project.tronku.miwokapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class Numbers extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        int a = 0;

        ArrayList<String> words = new ArrayList<String>();

        words.add("One");
        words.add("Two");
        words.add("Three");
        words.add("Four");
        words.add("Five");
        words.add("Six");
        words.add("Seven");
        words.add("Eight");
        words.add("Nine");
        words.add("Ten");

        LinearLayout RootView = findViewById(R.id.RootView);
        for (a = 0; a < 10; a++) {
            TextView WordView = new TextView(this);
            WordView.setText(words.get(a));
            RootView.addView(WordView);
        }
    }

}
