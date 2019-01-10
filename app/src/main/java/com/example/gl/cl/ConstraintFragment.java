package com.example.gl.cl;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * @title:
 * @description:
 * @company: Netease
 * @author: GlanWang
 * @version: Created on 2019/1/8.
 */
public class ConstraintFragment extends Fragment {

    public static final String CONSTRAINT_CATEGORY = "Constraint_Category";

    public static final int CONSTRAINT_TEST1 = 1;
    public static final int CONSTRAINT_TEST2 = 2;
    public static final int CONSTRAINT_TEST3 = 3;
    public static final int CONSTRAINT_TEST4 = 4;
    public static final int CONSTRAINT_TEST5 = 5;
    public static final int CONSTRAINT_TEST6 = 6;
    public static final int CONSTRAINT_TEST7 = 7;
    private int mCategory;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle arguments = getArguments();
        mCategory = arguments.getInt(CONSTRAINT_CATEGORY);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        int layoutId = 0;
        switch (mCategory) {
            case CONSTRAINT_TEST1 :
                layoutId = R.layout.constraint_test1;
                break;
            case CONSTRAINT_TEST2 :
                layoutId = R.layout.constraint_test2;
                break;
            case CONSTRAINT_TEST3 :
                layoutId = R.layout.constraint_test3;
                break;
            case CONSTRAINT_TEST4 :
                layoutId = R.layout.constraint_test4;
                break;
            case CONSTRAINT_TEST5 :
                layoutId = R.layout.constraint_test5;
                break;
            case CONSTRAINT_TEST6 :
                layoutId = R.layout.constraint_test6;
                break;
            case CONSTRAINT_TEST7 :
                layoutId = R.layout.constraint_test7;
                break;
        }
        return inflater.inflate(layoutId, null);
    }
}
