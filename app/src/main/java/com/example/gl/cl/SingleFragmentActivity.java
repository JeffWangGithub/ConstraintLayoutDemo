package com.example.gl.cl;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;

/**
 * @title:
 * @description:
 * @company: Netease
 * @author: GlanWang
 * @version: Created on 2019/1/8.
 */
public class SingleFragmentActivity extends AppCompatActivity {

    private Fragment mFragment;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ensureFragment();
    }

    /**
     * 初始化fragment
     */
    private void ensureFragment() {
        if (getIntent() == null) {
            return;
        }
        String fragmentTag = getIntent().getStringExtra(SingleFragmentHelper.FRAGMENT_TAG);
        mFragment = getSupportFragmentManager().findFragmentByTag(fragmentTag);
        if (mFragment == null) {
            // 初始化fragment
            String fragmentName = getIntent().getStringExtra(SingleFragmentHelper.FRAGMENT_NAME);
            if (!TextUtils.isEmpty(fragmentName)) {
                Bundle argu = getIntent().getBundleExtra(SingleFragmentHelper.FRAGMENT_ARGU);
                mFragment = SingleFragmentHelper.addFragmentByTag(this, getSupportFragmentManager(), android.R.id.content, fragmentName, fragmentTag, argu);
            }
        }
    }
}

