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

public class DadcActivity extends Activity {
    private Intent calldadc = new Intent();
    private ImageView imageview1;
    private ImageView imageview2;
    private LinearLayout linear1;
    private LinearLayout linear6;
    private LinearLayout linear7;
    private LinearLayout linear8;
    private TextView textview1;
    private TextView textview4;
    private TextView textview5;
    private TextView textview6;

    class C00161 implements OnClickListener {
        C00161() {
        }

        public void onClick(View view) {
        }
    }

    class C00172 implements OnClickListener {
        C00172() {
        }

        public void onClick(View view) {
            DadcActivity.this.calldadc.setAction("android.intent.action.CALL");
            DadcActivity.this.calldadc.setData(Uri.parse("tel:9537791815"));
            DadcActivity.this.startActivity(DadcActivity.this.calldadc);
        }
    }

    class C00183 implements OnClickListener {
        C00183() {
        }

        public void onClick(View view) {
            DadcActivity.this.calldadc.setAction("android.intent.action.CALL");
            DadcActivity.this.calldadc.setData(Uri.parse("tel:9909659174"));
            DadcActivity.this.startActivity(DadcActivity.this.calldadc);
        }
    }

    class C00194 implements OnClickListener {
        C00194() {
        }

        public void onClick(View view) {
        }
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C0083R.layout.dadc);
        initialize();
        initializeLogic();
    }

    private void initialize() {
        this.linear1 = (LinearLayout) findViewById(C0083R.id.linear1);
        this.textview1 = (TextView) findViewById(C0083R.id.textview1);
        this.imageview1 = (ImageView) findViewById(C0083R.id.imageview1);
        this.imageview2 = (ImageView) findViewById(C0083R.id.imageview2);
        this.linear6 = (LinearLayout) findViewById(C0083R.id.linear6);
        this.linear7 = (LinearLayout) findViewById(C0083R.id.linear7);
        this.linear8 = (LinearLayout) findViewById(C0083R.id.linear8);
        this.textview4 = (TextView) findViewById(C0083R.id.textview4);
        this.textview5 = (TextView) findViewById(C0083R.id.textview5);
        this.textview6 = (TextView) findViewById(C0083R.id.textview6);
        this.imageview1.setOnClickListener(new C00161());
        this.textview5.setOnClickListener(new C00172());
        this.textview6.setOnClickListener(new C00183());
        this.imageview2.setOnClickListener(new C00194());
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
