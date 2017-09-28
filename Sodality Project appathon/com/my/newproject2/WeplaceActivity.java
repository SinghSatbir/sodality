package com.my.newproject2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.SparseBooleanArray;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.Random;

public class WeplaceActivity extends Activity {
    private Intent cog = new Intent();
    private ImageView imageview1;
    private ImageView imageview2;
    private LinearLayout linear1;
    private LinearLayout linear2;
    private LinearLayout linear3;
    private Intent pivot = new Intent();

    class C01001 implements OnClickListener {
        C01001() {
        }

        public void onClick(View view) {
            WeplaceActivity.this.cog.setClass(WeplaceActivity.this.getApplicationContext(), CogActivity.class);
            WeplaceActivity.this.startActivity(WeplaceActivity.this.cog);
        }
    }

    class C01012 implements OnClickListener {
        C01012() {
        }

        public void onClick(View view) {
            WeplaceActivity.this.pivot.setClass(WeplaceActivity.this.getApplicationContext(), PivotActivity.class);
            WeplaceActivity.this.startActivity(WeplaceActivity.this.pivot);
        }
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C0083R.layout.weplace);
        initialize();
        initializeLogic();
    }

    private void initialize() {
        this.linear1 = (LinearLayout) findViewById(C0083R.id.linear1);
        this.linear2 = (LinearLayout) findViewById(C0083R.id.linear2);
        this.linear3 = (LinearLayout) findViewById(C0083R.id.linear3);
        this.imageview1 = (ImageView) findViewById(C0083R.id.imageview1);
        this.imageview2 = (ImageView) findViewById(C0083R.id.imageview2);
        this.imageview1.setOnClickListener(new C01001());
        this.imageview2.setOnClickListener(new C01012());
    }

    private void initializeLogic() {
    }

    private void showMessage(String str) {
        Toast.makeText(getApplicationContext(), str, 0).show();
    }

    private int getRandom(int i, int i2) {
        return new Random().nextInt((i2 - i) + 1) + i;
    }

    public ArrayList<Double> getCheckedItemPositionsToArray(ListView listView) {
        ArrayList<Double> arrayList = new ArrayList();
        SparseBooleanArray checkedItemPositions = listView.getCheckedItemPositions();
        for (int i = 0; i < checkedItemPositions.size(); i++) {
            if (checkedItemPositions.valueAt(i)) {
                arrayList.add(Double.valueOf((double) checkedItemPositions.keyAt(i)));
            }
        }
        return arrayList;
    }
}
