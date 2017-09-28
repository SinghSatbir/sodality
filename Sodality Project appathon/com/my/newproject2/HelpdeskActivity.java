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

public class HelpdeskActivity extends Activity {
    private Intent abc = new Intent();
    private Intent found = new Intent();
    private Intent internetw = new Intent();
    private LinearLayout linear1;
    private LinearLayout linear3;
    private LinearLayout linear4;
    private LinearLayout linear5;
    private TextView textview1;
    private TextView textview2;
    private TextView textview3;
    private TextView textview4;

    class C00411 implements OnClickListener {
        C00411() {
        }

        public void onClick(View view) {
            HelpdeskActivity.this.internetw.setClass(HelpdeskActivity.this.getApplicationContext(), Internet1Activity.class);
            HelpdeskActivity.this.startActivity(HelpdeskActivity.this.internetw);
        }
    }

    class C00422 implements OnClickListener {
        C00422() {
        }

        public void onClick(View view) {
            HelpdeskActivity.this.abc.setAction("android.intent.action.DIAL");
            HelpdeskActivity.this.abc.setData(Uri.parse("tel:7930510566"));
            HelpdeskActivity.this.startActivity(HelpdeskActivity.this.abc);
        }
    }

    class C00433 implements OnClickListener {
        C00433() {
        }

        public void onClick(View view) {
            HelpdeskActivity.this.abc.setClass(HelpdeskActivity.this.getApplicationContext(), CounsellorActivity.class);
            HelpdeskActivity.this.startActivity(HelpdeskActivity.this.abc);
        }
    }

    class C00444 implements OnClickListener {
        C00444() {
        }

        public void onClick(View view) {
            HelpdeskActivity.this.found.setClass(HelpdeskActivity.this.getApplicationContext(), SplashActivity.class);
            HelpdeskActivity.this.startActivity(HelpdeskActivity.this.found);
        }
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C0083R.layout.helpdesk);
        initialize();
        initializeLogic();
    }

    private void initialize() {
        this.linear1 = (LinearLayout) findViewById(C0083R.id.linear1);
        this.linear3 = (LinearLayout) findViewById(C0083R.id.linear3);
        this.linear4 = (LinearLayout) findViewById(C0083R.id.linear4);
        this.linear5 = (LinearLayout) findViewById(C0083R.id.linear5);
        this.textview1 = (TextView) findViewById(C0083R.id.textview1);
        this.textview4 = (TextView) findViewById(C0083R.id.textview4);
        this.textview2 = (TextView) findViewById(C0083R.id.textview2);
        this.textview3 = (TextView) findViewById(C0083R.id.textview3);
        this.textview1.setOnClickListener(new C00411());
        this.textview2.setOnClickListener(new C00422());
        this.textview3.setOnClickListener(new C00433());
        this.textview4.setOnClickListener(new C00444());
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
