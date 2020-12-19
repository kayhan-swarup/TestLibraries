/*
 * Copyright (c) 2020.
 * Author: Kayhan Swarup
 * Project: TestLibraries
 */

package com.kayhan.pages.models.realtimes;

import androidx.lifecycle.MutableLiveData;

import static com.kayhan.pages.models.realtimes.Types.NUMBER;

public class RealTimeData {
    MutableLiveData liveData;
    Types types;

    public RealTimeData(Types types) {
        this.types = types;
        switch (types){
            case NUMBER:
                liveData = new MutableLiveData<Integer>();
                break;
        }
    }
}
