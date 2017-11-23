package com.devmenu;

import android.os.Bundle;

import com.devmenu.devmenubridge.CustomDevOptionsHandler;
import com.facebook.react.ReactActivity;

public class MainActivity extends ReactActivity {

    /**
     * Returns the name of the main component registered from JavaScript.
     * This is used to schedule rendering of the component.
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getReactInstanceManager().getDevSupportManager()
                .addCustomDevOption("My Test",
                        new CustomDevOptionsHandler(getReactInstanceManager()));
    }

    @Override
    protected String getMainComponentName() {
        return "devMenu";
    }
}
