package com.lifeistech.android.testcount;

import android.content.Intent;
import android.view.View;

/**
 * Created by kamui_000 on 2016/05/15.
 */
public class Count {

    private int count;

    public Count (){
       count = 0;

    }
    public  int inc (){
        count = count+1;
        return count;
    }


}
