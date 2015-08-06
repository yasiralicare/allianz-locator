package com.yasirali.allianz.healthcarelocator;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

/**
 * Created by yasirali on 8/6/15.
 */
public class AllianzApplication extends Application {

    @Override
    public void onCreate() {

        // Enable Local Datastore for parse.
        Parse.enableLocalDatastore(this);

        Parse.initialize(this, getString(R.string.parse_app_id), getString(R.string.parse_client_key));

        testParseSdk();
    }

    private void testParseSdk(){
        ParseObject testObject = new ParseObject("TestObject");
        testObject.put("foo", "bar");
        testObject.saveInBackground();
    }
}
