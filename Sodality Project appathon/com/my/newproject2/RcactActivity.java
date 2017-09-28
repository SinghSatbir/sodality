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

public class RcactActivity extends Activity {
    private Intent downloadeb = new Intent();
    private ImageView imageview1;
    private ImageView imageview2;
    private ImageView imageview3;
    private LinearLayout linear1;
    private LinearLayout linear3;
    private LinearLayout linear4;
    private LinearLayout linear5;
    private Intent rccat = new Intent();

    class C00841 implements OnClickListener {
        C00841() {
        }

        public void onClick(View view) {
            RcactActivity.this.downloadeb.setClass(RcactActivity.this.getApplicationContext(), SellActivity.class);
            RcactActivity.this.startActivity(RcactActivity.this.downloadeb);
        }
    }

    class C00852 implements OnClickListener {
        C00852() {
        }

        public void onClick(View view) {
            RcactActivity.this.downloadeb.setClass(RcactActivity.this.getApplicationContext(), DownloadebActivity.class);
            RcactActivity.this.startActivity(RcactActivity.this.downloadeb);
        }
    }

    class C00863 implements OnClickListener {
        C00863() {
        }

        public void onClick(View view) {
            RcactActivity.this.rccat.setClass(RcactActivity.this.getApplicationContext(), RccataintActivity.class);
            RcactActivity.this.startActivity(RcactActivity.this.rccat);
        }
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C0083R.layout.rcact);
        initialize();
        initializeLogic();
    }

    private void initialize() {
        this.linear1 = (LinearLayout) findViewById(C0083R.id.linear1);
        this.linear3 = (LinearLayout) findViewById(C0083R.id.linear3);
        this.linear4 = (LinearLayout) findViewById(C0083R.id.linear4);
        this.linear5 = (LinearLayout) findViewById(C0083R.id.linear5);
        this.imageview3 = (ImageView) findViewById(C0083R.id.imageview3);
        this.imageview1 = (ImageView) findViewById(C0083R.id.imageview1);
        this.imageview2 = (ImageView) findViewById(C0083R.id.imageview2);
        this.imageview1.setOnClickListener(new C00841());
        this.imageview2.setOnClickListener(new C00852());
        this.imageview3.setOnClickListener(new C00863());
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
