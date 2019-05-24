package com.wzh.pfutils.utils;

public class PreferencesManager {

    private IPreferencesHolder preferencesHolder;

    private PreferencesManager() {
    }

    public static PreferencesManager getInstance() {
        return PreferencesManagerHolder.INSTANCE;
    }

    private static class PreferencesManagerHolder {
        private static PreferencesManager INSTANCE = new PreferencesManager();
    }

    public void setPreferencesHolder(IPreferencesHolder preferencesHolder) {
        this.preferencesHolder = preferencesHolder;
    }

    public IPreferencesHolder getPreferencesHolder() {
        return preferencesHolder;
    }
}
