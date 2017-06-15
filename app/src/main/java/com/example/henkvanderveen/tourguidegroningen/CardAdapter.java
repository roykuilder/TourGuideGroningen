package com.example.henkvanderveen.tourguidegroningen;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CardAdapter extends ArrayAdapter<Card>  {
    /**
     * Create a new {@link CardAdapter} object.
     *
     * @param context is the current context (i.e. Activity) that the adapter is being created in.
     * @param list is the list of {@link Card}s to be displayed.
     */
    public CardAdapter(Context context, ArrayList<Card> list) {
        super(context, 0, list);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.item_layout, parent, false);
        }

        //Get the card object for the current position.
        Card currentCard = getItem(position);

        // Set the title for the current Card.
        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.item_title);
        miwokTextView.setText(currentCard.getCardTitle());

        // Find and set the main body text.
        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.main_text);
        defaultTextView.setText(currentCard.getCardMainText());

        // Find the ImageView in the list_item.xml layout with the ID image.
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.item_image);
        imageView.setImageResource(currentCard.getCardPicture());


        return listItemView;
    }
}