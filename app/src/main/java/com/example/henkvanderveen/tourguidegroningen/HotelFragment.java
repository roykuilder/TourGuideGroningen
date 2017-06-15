package com.example.henkvanderveen.tourguidegroningen;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class HotelFragment extends Fragment {


    public HotelFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.content_list, container, false);


        final ArrayList<Card> hotel = new ArrayList<Card>();
        hotel.add(new Card(R.string.test_string, R.string.test_string, R.string.test_string,
                R.string.test_string, R.string.test_string, R.drawable.hotel_image_nh));
        hotel.add(new Card(R.string.test_string, R.string.test_string, R.string.test_string,
                R.string.test_string, R.string.test_string, R.drawable.hotel_image_nh));
        hotel.add(new Card(R.string.test_string, R.string.test_string, R.string.test_string,
                R.string.test_string, R.string.test_string, R.drawable.hotel_image_nh));
        hotel.add(new Card(R.string.test_string, R.string.test_string, R.string.test_string,
                R.string.test_string, R.string.test_string, R.drawable.hotel_image_nh));

        CardAdapter adapter = new CardAdapter(getActivity(), hotel);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }

}
