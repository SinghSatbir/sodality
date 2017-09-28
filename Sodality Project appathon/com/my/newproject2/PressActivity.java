package com.my.newproject2;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.SparseBooleanArray;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.Random;

public class PressActivity extends Activity {
    private Intent f16i = new Intent();
    private LinearLayout linear1;
    private LinearLayout linear10;
    private LinearLayout linear2;
    private LinearLayout linear3;
    private LinearLayout linear4;
    private LinearLayout linear8;
    private LinearLayout linear9;
    private TextView textview1;
    private TextView textview2;
    private TextView textview3;
    private TextView textview4;
    private TextView textview5;

    class C00781 implements OnClickListener {
        C00781() {
        }

        public void onClick(View view) {
            PressActivity.this.f16i.setAction("android.intent.action.CALL");
            PressActivity.this.f16i.setData(Uri.parse("tel:9537791815"));
            PressActivity.this.startActivity(PressActivity.this.f16i);
        }
    }

    class C00792 implements OnClickListener {
        C00792() {
        }

        public void onClick(View view) {
            PressActivity.this.f16i.setAction("android.intent.action.CALL");
            PressActivity.this.f16i.setData(Uri.parse("tel:9909659174"));
            PressActivity.this.startActivity(PressActivity.this.f16i);
        }
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C0083R.layout.press);
        initialize();
        initializeLogic();
    }

    private void initialize() {
        this.linear1 = (LinearLayout) findViewById(C0083R.id.linear1);
        this.linear2 = (LinearLayout) findViewById(C0083R.id.linear2);
        this.linear3 = (LinearLayout) findViewById(C0083R.id.linear3);
        this.linear4 = (LinearLayout) findViewById(C0083R.id.linear4);
        this.linear8 = (LinearLayout) findViewById(C0083R.id.linear8);
        this.textview1 = (TextView) findViewById(C0083R.id.textview1);
        this.textview2 = (TextView) findViewById(C0083R.id.textview2);
        this.linear9 = (LinearLayout) findViewById(C0083R.id.linear9);
        this.linear10 = (LinearLayout) findViewById(C0083R.id.linear10);
        this.textview3 = (TextView) findViewById(C0083R.id.textview3);
        this.textview4 = (TextView) findViewById(C0083R.id.textview4);
        this.textview5 = (TextView) findViewById(C0083R.id.textview5);
        this.textview4.setOnClickListener(new C00781());
        this.textview5.setOnClickListener(new C00792());
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
