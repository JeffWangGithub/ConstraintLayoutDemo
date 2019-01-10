package com.example.gl.cl;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

/**
 * @title:
 * @description:
 * @company: Netease
 * @author: GlanWang
 * @version: Created on 2019/1/8.
 */
public class SingleFragmentHelper {

    public static final String FRAGMENT_TAG = "fragment_tag";
    public static final String FRAGMENT_NAME = "fragment_name";
    public static final String FRAGMENT_ARGU = "fragment_argu";


    public static void gotoPage(Context context, String fragmentName, String fragmentTag,
                                Bundle fragmentArgu){
        if (context == null) {
            return;
        }
        Intent intent = getStartIntent(context, fragmentName, fragmentTag, fragmentArgu, SingleFragmentActivity.class);

        if (intent != null) {
            context.startActivity(intent);
        }
    }

    public static Intent getStartIntent(Context context, String fragmentName, String fragmentTag,
                                        Bundle fragmentArgu, Class clazz) {
        Intent intent = new Intent(context, clazz);
        putSingleBundle(intent, fragmentName, fragmentTag, fragmentArgu);
        return intent;
    }

    public static void putSingleBundle(Intent intent, String fragmentName, String fragmentTag,
                                       Bundle fragmentArgu) {
        if (intent == null) {
            return;
        }
        intent.putExtra(FRAGMENT_NAME, fragmentName);
        intent.putExtra(FRAGMENT_TAG, fragmentTag);
        intent.putExtra(FRAGMENT_ARGU, fragmentArgu);
    }


    public static Fragment addFragmentByTag(Context context, @NonNull FragmentManager fm, int container, String clazz, String tag, Bundle argument) {
        Fragment f = fm.findFragmentByTag(tag);
        if (f == null) {
            FragmentTransaction ft = fm.beginTransaction();
            f = Fragment.instantiate(context, clazz, argument);
            ft.add(container, f, tag);
            ft.commit();
        } else if (f.isDetached()) {
            FragmentTransaction ft = fm.beginTransaction();
            ft.attach(f);
            ft.commit();
        }
        return f;
    }
}
