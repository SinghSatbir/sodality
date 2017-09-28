package com.my.newproject2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.SparseBooleanArray;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.Random;

public class CaffeteriaActivity extends Activity {
    private Intent f0a = new Intent();
    private Intent f1b = new Intent();
    private Button button1;
    private Button button2;
    private Button button3;
    private LinearLayout linear1;

    class C00061 implements OnClickListener {
        C00061() {
        }

        public void onClick(View view) {
            CaffeteriaActivity.this.f0a.setClass(CaffeteriaActivity.this.getApplicationContext(), BalanActivity.class);
            CaffeteriaActivity.this.startActivity(CaffeteriaActivity.this.f0a);
        }
    }

    class C00072 implements OnClickListener {
        C00072() {
        }

        public void onClick(View view) {
            CaffeteriaActivity.this.f1b.setClass(CaffeteriaActivity.this.getApplicationContext(), ComplainsActivity.class);
            CaffeteriaActivity.this.startActivity(CaffeteriaActivity.this.f1b);
        }
    }

    class C00083 implements OnClickListener {
        C00083() {
        }

        public void onClick(View view) {
            CaffeteriaActivity.this.f1b.setClass(CaffeteriaActivity.this.getApplicationContext(), SploActivity.class);
            CaffeteriaActivity.this.startActivity(CaffeteriaActivity.this.f1b);
        }
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C0083R.layout.caffeteria);
        initialize();
        initializeLogic();
    }

    private void initialize() {
        this.linear1 = (LinearLayout) findViewById(C0083R.id.linear1);
        this.button1 = (Button) findViewById(C0083R.id.button1);
        this.button2 = (Button) findViewById(C0083R.id.button2);
        this.button3 = (Button) findViewById(C0083R.id.button3);
        this.button1.setOnClickListener(new C00061());
        this.button2.setOnClickListener(new C00072());
        this.button3.setOnClickListener(new C00083());
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
