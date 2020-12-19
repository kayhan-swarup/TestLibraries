/*
 * Copyright (c) 2020.
 * Author: Kayhan Swarup
 * Project: TestLibraries
 */

package com.kayhan.pages.models.realtimes;

public class Attr<T> {
    private String key;
    private T val;

    public Attr() {
    }

    public Attr(String key, T val) {
        this.key = key;
        this.val = val;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public T getVal() {
        return val;
    }

    public void setVal(T val) {
        this.val = val;
    }
}
