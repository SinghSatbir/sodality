package com.my.newproject2;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.SparseBooleanArray;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.Random;

public class DtgActivity extends Activity {
    private Intent calldtg = new Intent();
    private ImageView imageview1;
    private ImageView imageview2;
    private LinearLayout linear1;
    private LinearLayout linear2;
    private LinearLayout linear3;
    private LinearLayout linear4;
    private LinearLayout linear5;
    private LinearLayout linear7;
    private LinearLayout linear8;
    private TextView textview1;
    private TextView textview2;
    private TextView textview4;
    private TextView textview5;

    class C00331 implements OnClickListener {
        C00331() {
        }

        public void onClick(View view) {
        }
    }

    class C00342 implements OnClickListener {
        C00342() {
        }

        public void onClick(View view) {
            DtgActivity.this.calldtg.setAction("android.intent.action.CALL");
            DtgActivity.this.calldtg.setData(Uri.parse("tel:7405272305"));
        }
    }

    class C00353 implements OnClickListener {
        C00353() {
        }

        public void onClick(View view) {
            DtgActivity.this.calldtg.setAction("android.intent.action.CALL");
            DtgActivity.this.calldtg.setData(Uri.parse("tel:9426912731"));
            DtgActivity.this.startActivity(DtgActivity.this.calldtg);
        }
    }

    class C00364 implements OnClickListener {
        C00364() {
        }

        public void onClick(View view) {
        }
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C0083R.layout.dtg);
        initialize();
        initializeLogic();
    }

    private void initialize() {
        this.linear1 = (LinearLayout) findViewById(C0083R.id.linear1);
        this.linear2 = (LinearLayout) findViewById(C0083R.id.linear2);
        this.linear3 = (LinearLayout) findViewById(C0083R.id.linear3);
        this.linear4 = (LinearLayout) findViewById(C0083R.id.linear4);
        this.linear5 = (LinearLayout) findViewById(C0083R.id.linear5);
        this.textview2 = (TextView) findViewById(C0083R.id.textview2);
        this.imageview1 = (ImageView) findViewById(C0083R.id.imageview1);
        this.imageview2 = (ImageView) findViewById(C0083R.id.imageview2);
        this.linear7 = (LinearLayout) findViewById(C0083R.id.linear7);
        this.linear8 = (LinearLayout) findViewById(C0083R.id.linear8);
        this.textview1 = (TextView) findViewById(C0083R.id.textview1);
        this.textview4 = (TextView) findViewById(C0083R.id.textview4);
        this.textview5 = (TextView) findViewById(C0083R.id.textview5);
        this.imageview1.setOnClickListener(new C00331());
        this.textview4.setOnClickListener(new C00342());
        this.textview5.setOnClickListener(new C00353());
        this.imageview2.setOnClickListener(new C00364());
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
