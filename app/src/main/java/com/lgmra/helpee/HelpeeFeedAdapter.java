package com.lgmra.helpee;

/**
 * Created by ryanalex on 1/2/15.
 */

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.parse.GetDataCallback;
import com.parse.ParseException;
import com.parse.ParseFile;
import com.parse.ParseImageView;
import com.parse.ParseObject;
import com.parse.ParseQuery;
import com.parse.ParseQueryAdapter;

/*
 * The FeedAdapter is an extension of ParseQueryAdapter
 * that has a custom layout for feed_item_view, including a
 * big image, issue description, and vote data
 * star.
 */

public class HelpeeFeedAdapter extends ParseQueryAdapter<ParseObject> {

    public HelpeeFeedAdapter(Context context) {
        super(context, new ParseQueryAdapter.QueryFactory<ParseObject>() {
            public ParseQuery<ParseObject> create() {

                ParseQuery query = new ParseQuery("Help");
                return query;
            }
        });
    }

    @Override
    public View getItemView(ParseObject help, View v, ViewGroup parent) {

        if (v == null) {
            v = View.inflate(getContext(), R.layout.activity_feed, null);
        }

        super.getItemView(help, v, parent);

        ParseImageView mealImage = (ParseImageView) v.findViewById(R.id.icon);
        ParseFile photoFile = help.getParseFile("img");
        if (photoFile != null) {
            mealImage.setParseFile(photoFile);
            mealImage.loadInBackground(new GetDataCallback() {
                @Override
                public void done(byte[] data, ParseException e) {
                    // nothing to do
                }
            });
        }

        TextView titleTextView = (TextView) v.findViewById(R.id.text1);
        titleTextView.setText("testing");

        return v;
    }

}



