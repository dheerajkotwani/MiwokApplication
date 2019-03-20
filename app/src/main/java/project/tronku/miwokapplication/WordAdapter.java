package project.tronku.miwokapplication;

import android.app.Activity;
import android.media.Image;
import android.media.MediaPlayer;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {

    private int mColorResourceId;
    private MediaPlayer mediaPlayer;

    public WordAdapter(Activity context, ArrayList<Word> words, int colorResourceId) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, words);
        mColorResourceId = colorResourceId;
    }


    @Override
    public View getView(int position,  View convertView,  ViewGroup parent) {
//        return super.getView(position, convertView, parent);
        View listItemView=convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_layout, parent, false);
        }

        Word currentWord = getItem(position);

//        LinearLayout background = (LinearLayout) listItemView.findViewById(R.id.linear_layout_text);
//        background.setBackgroundColor(currentWord.getBackground());

        ImageView image=(ImageView) listItemView.findViewById(R.id.list_image);
        if(currentWord.hasImage()){
        image.setImageResource(currentWord.getImage());
        image.setVisibility(View.VISIBLE);}
        else{
            image.setVisibility(View.GONE);
        }

        TextView english= (TextView) listItemView.findViewById(R.id.english);
        english.setText(currentWord.getDefaultTranslation());

        TextView miwok= (TextView) listItemView.findViewById(R.id.miwok);
        miwok.setText(currentWord.getMiwokTranslation());

        View textContainer = listItemView.findViewById(R.id.list_layout);
        int color = ContextCompat.getColor(getContext(),mColorResourceId);
        textContainer.setBackgroundColor(color);



//        listItemView.setOnClickListener(new View.OnClickListener(){
//
//            @Override
//            public void onClick(View view) {
//                mediaPlayer = (MediaPlayer) MediaPlayer.create(Numbers.this,Word.getAudio());
//                mediaPlayer.start();
//            }
//        });


        return listItemView;
    }

}
