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

public class IeeeActivity extends Activity {
    private Intent callingieee = new Intent();
    private ImageView imageview1;
    private ImageView imageview3;
    private ImageView imageview4;
    private LinearLayout linear1;
    private LinearLayout linear2;
    private LinearLayout linear4;
    private LinearLayout linear5;
    private LinearLayout linear6;
    private LinearLayout linear7;
    private TextView textview2;
    private TextView textview5;
    private TextView textview6;
    private TextView textview7;

    class C00461 implements OnClickListener {
        C00461() {
        }

        public void onClick(View view) {
        }
    }

    class C00472 implements OnClickListener {
        C00472() {
        }

        public void onClick(View view) {
        }
    }

    class C00483 implements OnClickListener {
        C00483() {
        }

        public void onClick(View view) {
            IeeeActivity.this.callingieee.setAction("android.intent.action.CALL");
            IeeeActivity.this.callingieee.setData(Uri.parse("tel:8866821682"));
            IeeeActivity.this.startActivity(IeeeActivity.this.callingieee);
        }
    }

    class C00494 implements OnClickListener {
        C00494() {
        }

        public void onClick(View view) {
            IeeeActivity.this.callingieee.setAction("android.intent.action.CALL");
            IeeeActivity.this.callingieee.setData(Uri.parse("tel:9724164467"));
            IeeeActivity.this.startActivity(IeeeActivity.this.callingieee);
        }
    }

    class C00505 implements OnClickListener {
        C00505() {
        }

        public void onClick(View view) {
        }
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C0083R.layout.ieee);
        initialize();
        initializeLogic();
    }

    private void initialize() {
        this.linear1 = (LinearLayout) findViewById(C0083R.id.linear1);
        this.linear2 = (LinearLayout) findViewById(C0083R.id.linear2);
        this.imageview1 = (ImageView) findViewById(C0083R.id.imageview1);
        this.textview7 = (TextView) findViewById(C0083R.id.textview7);
        this.imageview3 = (ImageView) findViewById(C0083R.id.imageview3);
        this.linear4 = (LinearLayout) findViewById(C0083R.id.linear4);
        this.linear7 = (LinearLayout) findViewById(C0083R.id.linear7);
        this.linear5 = (LinearLayout) findViewById(C0083R.id.linear5);
        this.linear6 = (LinearLayout) findViewById(C0083R.id.linear6);
        this.imageview4 = (ImageView) findViewById(C0083R.id.imageview4);
        this.textview2 = (TextView) findViewById(C0083R.id.textview2);
        this.textview5 = (TextView) findViewById(C0083R.id.textview5);
        this.textview6 = (TextView) findViewById(C0083R.id.textview6);
        this.imageview1.setOnClickListener(new C00461());
        this.imageview3.setOnClickListener(new C00472());
        this.textview5.setOnClickListener(new C00483());
        this.textview6.setOnClickListener(new C00494());
        this.imageview4.setOnClickListener(new C00505());
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
