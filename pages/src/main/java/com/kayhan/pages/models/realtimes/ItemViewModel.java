/*
 * Copyright (c) 2020.
 * Author: Kayhan Swarup
 * Project: TestLibraries
 */

package com.kayhan.pages.models.realtimes;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.ArrayList;
import java.util.List;

public class ItemViewModel  <T> extends ViewModel{
    T model;
    NodeK nodeK;
    List<MutableLiveData> mutableLiveData = new ArrayList<>();
    public ItemViewModel() {
    }

    public ItemViewModel(NodeK nodeK) {
        this.nodeK = nodeK;

    }
    public void initLiveData(NodeK nodeK){

    }
}
