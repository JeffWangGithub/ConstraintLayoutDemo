package com.example.gl.cl;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view) {
        int category = 0;
        switch (view.getId()) {
            case R.id.btn1:
                category = ConstraintFragment.CONSTRAINT_TEST1;
                break;
            case R.id.btn2:
                category = ConstraintFragment.CONSTRAINT_TEST2;
                break;
            case R.id.btn3:
                category = ConstraintFragment.CONSTRAINT_TEST3;
                break;
            case R.id.btn4:
                category = ConstraintFragment.CONSTRAINT_TEST4;
                break;
            case R.id.btn5:
                category = ConstraintFragment.CONSTRAINT_TEST5;
                break;
            case R.id.btn6:
                category = ConstraintFragment.CONSTRAINT_TEST6;
                break;
            case R.id.btn7:
                category = ConstraintFragment.CONSTRAINT_TEST7;
                break;

        }
        Bundle args = new Bundle();
        args.putInt(ConstraintFragment.CONSTRAINT_CATEGORY, category);
        SingleFragmentHelper.gotoPage(this, ConstraintFragment.class.getName(),
                ConstraintFragment.class.getName(), args);
    }
}
