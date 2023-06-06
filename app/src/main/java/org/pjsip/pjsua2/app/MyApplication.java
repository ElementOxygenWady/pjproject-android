package org.pjsip.pjsua2.app;

import android.app.Application;
import android.content.Context;

public class MyApplication extends Application {
    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        xcrash.XCrash.init(this);
    }
}
