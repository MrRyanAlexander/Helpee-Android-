package com.lgmra.helpee;

import android.app.ListActivity;
import android.os.Bundle;


import com.parse.ParseAnalytics;
import com.parse.ParseObject;
import com.parse.ParseQueryAdapter;

/**
 * Created by ryanalex on 1/2/15.
 */
public class HelpeeFeedActivity extends ListActivity {

    private HelpeeFeedAdapter helpeeFeedAdapter;
    private ParseQueryAdapter<ParseObject> mainAdapater;


    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getListView().setClickable(false);

        mainAdapater = new ParseQueryAdapter<ParseObject>(this, "Help");
        mainAdapater.setTextKey("who");
        mainAdapater.setImageKey("img");

        helpeeFeedAdapter = new HelpeeFeedAdapter(this);

        setListAdapter(helpeeFeedAdapter);

        Issue test = new Issue();
        test.postIssue(new Issue.IssueInt(){

            @Override
            public void doSomething() {
                ParseObject testObject = new ParseObject("AnotherTest");
                testObject.put("foo", "Hello World");
                testObject.saveInBackground();
            }
        });

        ParseAnalytics.trackAppOpenedInBackground(getIntent());
    }
}
