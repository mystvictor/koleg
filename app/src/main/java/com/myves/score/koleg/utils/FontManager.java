package com.myves.score.koleg.utils;

import android.content.Context;
import android.graphics.Typeface;

/**
 * Created by myves.stvictor on 2016-03-22.
 */
public class FontManager {
    public static final String ROOT = "fonts/", EXO_REGULAR = ROOT + "exo_regular.ttf", EXO_BOLD
            = ROOT + "exo_bold.ttf";

    public static Typeface getTypeface(Context context, String font) {
        return Typeface.createFromAsset(context.getAssets(), font);
    }
}
