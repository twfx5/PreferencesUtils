package com.wzh.pfutils.utils;

public interface IPreferencesHolder {

    String serialize(String key, Object src);    //反序列化
    <T> T deserialize(String key, Class<T> classOfT);    //移除指定对象
    void remove(String key);
}
