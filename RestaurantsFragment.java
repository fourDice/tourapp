package com.example.android.tourapp;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class RestaurantsFragment extends Fragment{

    public RestaurantsFragment(){

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate( R.layout.word_list, container, false );

        final ArrayList<Word> words = new ArrayList<Word>();
        words.add( new Word( R.string.restaurants_one, R.string.restaurants_details_one, R.drawable.ale_works ) );
        words.add( new Word( R.string.restaurants_two, R.string.restaurants_details_two, R.drawable.roost ) );
        words.add( new Word( R.string.restaurants_three, R.string.restaurants_details_three, R.drawable.open_range ) );
        words.add( new Word( R.string.restaurants_four, R.string.restaurants_details_four, R.drawable.jam ) );
        words.add( new Word( R.string.restaurants_five, R.string.restaurants_details_five, R.drawable.garage ) );

        Adapter adapter = new Adapter( getActivity(), words, R.color.category_restaurants );

        ListView listView = rootView.findViewById( R.id.list );

        listView.setAdapter(adapter);

        return rootView;
    }
}
