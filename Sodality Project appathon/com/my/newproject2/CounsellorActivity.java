package com.my.newproject2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.SparseBooleanArray;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.Random;

public class CounsellorActivity extends Activity {
    private Intent book = new Intent();
    private Button button1;
    private Button button2;
    private ImageView imageview2;
    private LinearLayout linear4;
    private LinearLayout linear5;
    private LinearLayout linear6;
    private LinearLayout linear7;
    private LinearLayout linear8;
    private LinearLayout linear9;
    private TextView textview1;
    private TextView textview2;
    private ScrollView vscroll1;

    class C00121 implements OnClickListener {
        C00121() {
        }

        public void onClick(View view) {
        }
    }

    class C00132 implements OnClickListener {
        C00132() {
        }

        public void onClick(View view) {
            CounsellorActivity.this.book.setClass(CounsellorActivity.this.getApplicationContext(), BookActivity.class);
            CounsellorActivity.this.startActivity(CounsellorActivity.this.book);
        }
    }

    class C00143 implements OnClickListener {
        C00143() {
        }

        public void onClick(View view) {
            CounsellorActivity.this.book.setClass(CounsellorActivity.this.getApplicationContext(), MvidActivity.class);
            CounsellorActivity.this.startActivity(CounsellorActivity.this.book);
        }
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C0083R.layout.counsellor);
        initialize();
        initializeLogic();
    }

    private void initialize() {
        this.vscroll1 = (ScrollView) findViewById(C0083R.id.vscroll1);
        this.linear4 = (LinearLayout) findViewById(C0083R.id.linear4);
        this.linear5 = (LinearLayout) findViewById(C0083R.id.linear5);
        this.linear6 = (LinearLayout) findViewById(C0083R.id.linear6);
        this.linear7 = (LinearLayout) findViewById(C0083R.id.linear7);
        this.linear8 = (LinearLayout) findViewById(C0083R.id.linear8);
        this.linear9 = (LinearLayout) findViewById(C0083R.id.linear9);
        this.imageview2 = (ImageView) findViewById(C0083R.id.imageview2);
        this.textview1 = (TextView) findViewById(C0083R.id.textview1);
        this.button1 = (Button) findViewById(C0083R.id.button1);
        this.button2 = (Button) findViewById(C0083R.id.button2);
        this.textview2 = (TextView) findViewById(C0083R.id.textview2);
        this.imageview2.setOnClickListener(new C00121());
        this.button1.setOnClickListener(new C00132());
        this.button2.setOnClickListener(new C00143());
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
