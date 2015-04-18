package com.lgmra.helpee;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseACL;
import com.parse.ParseCrashReporting;
import com.parse.ParseUser;
import com.parse.ParseObject;

/**
 * Created by ryanalex on 1/2/15.
 */
public class HelpeeApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();


        // Initialize Crash Reporting.
        ParseCrashReporting.enable(this);

        // Add your initialization code here
        Parse.initialize(this, "OEwx0JnSAPsfiKZbdb9vrigk2CsOxluqyQInOFuO", "t10hIBu4irqwUxkkJhgiechh71xpCIKLIQLSKvlh");


        ParseUser.enableAutomaticUser();
        ParseACL defaultACL = new ParseACL();

        // If you would like all objects to be private by default, remove this line.
        defaultACL.setPublicReadAccess(true);

        ParseACL.setDefaultACL(defaultACL, true);
    }

}
