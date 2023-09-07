package com.example.stuapp;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @Auther MikuCat
 * @Time 2023/7/11
 */
public class TextManager<K,V> {
    private HashMap<K,V> a = new HashMap<K, V>();
    /*private volatile static  TextManager textManager;
    public static TextManager getInstance(){
        if (textManager == null){
            synchronized (TextManager.class){
                textManager = new TextManager();
            }
        }
        return textManager;
    }*/
    private static class InstanceHolder {
        private static final TextManager instance = new TextManager();
    }

    private TextManager() {
    }

    public static final TextManager getInstance() {
        return InstanceHolder.instance;
    }


}
