package com.deepakkaku.surface.Utility;

import android.content.Context;
import android.util.DisplayMetrics;

/**
 * Created by Deepak Kaku on 12-08-2018.
 */

public class Config {
    public static int calculateColumns(Context mContext){
        DisplayMetrics displayMetrics = mContext.getResources().getDisplayMetrics();
        float dpWidth = displayMetrics.widthPixels / displayMetrics.density;
        int noOfColumns = (int) (dpWidth / 180);
        return noOfColumns;
    }
}
