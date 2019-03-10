package project.tronku.miwokapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView numbers=findViewById(R.id.numbers);
        TextView family=findViewById(R.id.family);
        TextView colours=findViewById(R.id.colors);
        TextView phrases=findViewById(R.id.phrases);

        numbers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,Numbers.class);
                startActivity(i);
            }
        });

        family.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,Family.class);
                startActivity(i);
            }
        });

        colours.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,Colours.class);
                startActivity(i);
            }
        });

        phrases.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,Phrases.class);
                startActivity(i);
            }
        });

    }
}
