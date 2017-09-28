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
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.Random;

public class New1Activity extends Activity {
    private Intent Ieee = new Intent();
    private Intent dadc = new Intent();
    private Intent dtg = new Intent();
    private ImageView imageview2;
    private ImageView imageview3;
    private ImageView imageview4;
    private ImageView imageview5;
    private ImageView imageview6;
    private Intent internet = new Intent();
    private LinearLayout linear12;
    private LinearLayout linear13;
    private LinearLayout linear15;
    private LinearLayout linear16;
    private LinearLayout linear17;
    private LinearLayout linear18;
    private LinearLayout linear19;
    private LinearLayout linear20;
    private Intent press = new Intent();
    private TextView textview1;

    class C00711 implements OnClickListener {
        C00711() {
        }

        public void onClick(View view) {
            New1Activity.this.Ieee.setClass(New1Activity.this.getApplicationContext(), IeeeActivity.class);
            New1Activity.this.startActivity(New1Activity.this.Ieee);
        }
    }

    class C00722 implements OnClickListener {
        C00722() {
        }

        public void onClick(View view) {
            New1Activity.this.dadc.setClass(New1Activity.this.getApplicationContext(), DadcActivity.class);
            New1Activity.this.startActivity(New1Activity.this.dadc);
        }
    }

    class C00733 implements OnClickListener {
        C00733() {
        }

        public void onClick(View view) {
            New1Activity.this.dtg.setClass(New1Activity.this.getApplicationContext(), DtgActivity.class);
            New1Activity.this.startActivity(New1Activity.this.dtg);
        }
    }

    class C00744 implements OnClickListener {
        C00744() {
        }

        public void onClick(View view) {
            New1Activity.this.press.setClass(New1Activity.this.getApplicationContext(), PressActivity.class);
            New1Activity.this.startActivity(New1Activity.this.press);
        }
    }

    class C00755 implements OnClickListener {
        C00755() {
        }

        public void onClick(View view) {
            New1Activity.this.internet.setClass(New1Activity.this.getApplicationContext(), InternetActivity.class);
            New1Activity.this.startActivity(New1Activity.this.internet);
        }
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C0083R.layout.new1);
        initialize();
        initializeLogic();
    }

    private void initialize() {
        this.linear12 = (LinearLayout) findViewById(C0083R.id.linear12);
        this.linear15 = (LinearLayout) findViewById(C0083R.id.linear15);
        this.linear13 = (LinearLayout) findViewById(C0083R.id.linear13);
        this.linear20 = (LinearLayout) findViewById(C0083R.id.linear20);
        this.linear16 = (LinearLayout) findViewById(C0083R.id.linear16);
        this.linear17 = (LinearLayout) findViewById(C0083R.id.linear17);
        this.linear18 = (LinearLayout) findViewById(C0083R.id.linear18);
        this.linear19 = (LinearLayout) findViewById(C0083R.id.linear19);
        this.textview1 = (TextView) findViewById(C0083R.id.textview1);
        this.imageview6 = (ImageView) findViewById(C0083R.id.imageview6);
        this.imageview2 = (ImageView) findViewById(C0083R.id.imageview2);
        this.imageview3 = (ImageView) findViewById(C0083R.id.imageview3);
        this.imageview4 = (ImageView) findViewById(C0083R.id.imageview4);
        this.imageview5 = (ImageView) findViewById(C0083R.id.imageview5);
        this.imageview2.setOnClickListener(new C00711());
        this.imageview3.setOnClickListener(new C00722());
        this.imageview4.setOnClickListener(new C00733());
        this.imageview5.setOnClickListener(new C00744());
        this.imageview6.setOnClickListener(new C00755());
    }

    private void initializeLogic() {
    }

    private void _assign(String str) {
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
