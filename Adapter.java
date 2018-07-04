package com.example.android.tourapp;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;


public class Adapter extends ArrayAdapter<Word> {

    private int mColorResourceId;

    public Adapter(Context context, ArrayList<Word> words, int colorResourceId){
        super(context, 0, words);
        mColorResourceId = colorResourceId;
    }

    @Override
    public  View getView(int position, View convertView, ViewGroup parent){
        View listItemView = convertView;
        if (listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate( R.layout.list_item, parent, false );
        }

        Word currentWord = getItem(position);

        TextView bozemanTextView = listItemView.findViewById( R.id.bozeman_text_view );
        bozemanTextView.setText( currentWord.getDefaultPark() );

        TextView defaultTextView = listItemView.findViewById( R.id.details );
        defaultTextView.setText( currentWord.getDetails() );

        ImageView imageView = listItemView.findViewById( R.id.image );
        if (currentWord.hasImage()){
            imageView.setImageResource( currentWord.getImageResourceId() );
            imageView.setVisibility( View.VISIBLE );
        } else { imageView.setVisibility( View.GONE );
    }

    View textContainer = listItemView.findViewById( R.id.text_container );
        int color = ContextCompat.getColor( getContext(), mColorResourceId );
        textContainer.setBackgroundColor( color );
        return listItemView;
    }
}