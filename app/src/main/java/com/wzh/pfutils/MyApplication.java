package com.wzh.pfutils;

import android.app.Application;

import com.tencent.mmkv.MMKV;
import com.wzh.pfutils.utils.PreferencesMMKVHolder;
import com.wzh.pfutils.utils.PreferencesManager;

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        MMKV.initialize(this);
        PreferencesManager.getInstance().setPreferencesHolder(new PreferencesMMKVHolder());
    }
}
