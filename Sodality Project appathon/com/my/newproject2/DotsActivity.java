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

public class DotsActivity extends Activity {
    private Intent f4a = new Intent();
    private Intent f5b = new Intent();
    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;
    private Button button6;
    private Intent f6c = new Intent();
    private Intent f7d = new Intent();
    private Intent f8e = new Intent();
    private Intent f9f = new Intent();
    private LinearLayout linear1;
    private LinearLayout linear2;
    private LinearLayout linear3;
    private LinearLayout linear4;
    private LinearLayout linear5;
    private LinearLayout linear6;
    private LinearLayout linear7;

    class C00231 implements OnClickListener {
        C00231() {
        }

        public void onClick(View view) {
            DotsActivity.this.finish();
        }
    }

    class C00242 implements OnClickListener {
        C00242() {
        }

        public void onClick(View view) {
            DotsActivity.this.f5b.setClass(DotsActivity.this.getApplicationContext(), ProjectsActivity.class);
            DotsActivity.this.startActivity(DotsActivity.this.f5b);
        }
    }

    class C00253 implements OnClickListener {
        C00253() {
        }

        public void onClick(View view) {
            DotsActivity.this.f6c.setClass(DotsActivity.this.getApplicationContext(), ShareActivity.class);
            DotsActivity.this.startActivity(DotsActivity.this.f6c);
        }
    }

    class C00264 implements OnClickListener {
        C00264() {
        }

        public void onClick(View view) {
            DotsActivity.this.f7d.setClass(DotsActivity.this.getApplicationContext(), UsaboutActivity.class);
            DotsActivity.this.startActivity(DotsActivity.this.f7d);
        }
    }

    class C00275 implements OnClickListener {
        C00275() {
        }

        public void onClick(View view) {
            DotsActivity.this.showMessage("Press Back once again to exit");
            DotsActivity.this.finish();
        }
    }

    class C00286 implements OnClickListener {
        C00286() {
        }

        public void onClick(View view) {
            DotsActivity.this.f9f.setClass(DotsActivity.this.getApplicationContext(), ExitActivity.class);
            DotsActivity.this.startActivity(DotsActivity.this.f9f);
        }
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C0083R.layout.dots);
        initialize();
        initializeLogic();
    }

    private void initialize() {
        this.linear1 = (LinearLayout) findViewById(C0083R.id.linear1);
        this.linear2 = (LinearLayout) findViewById(C0083R.id.linear2);
        this.linear3 = (LinearLayout) findViewById(C0083R.id.linear3);
        this.linear4 = (LinearLayout) findViewById(C0083R.id.linear4);
        this.linear5 = (LinearLayout) findViewById(C0083R.id.linear5);
        this.linear6 = (LinearLayout) findViewById(C0083R.id.linear6);
        this.linear7 = (LinearLayout) findViewById(C0083R.id.linear7);
        this.button1 = (Button) findViewById(C0083R.id.button1);
        this.button2 = (Button) findViewById(C0083R.id.button2);
        this.button3 = (Button) findViewById(C0083R.id.button3);
        this.button4 = (Button) findViewById(C0083R.id.button4);
        this.button6 = (Button) findViewById(C0083R.id.button6);
        this.button5 = (Button) findViewById(C0083R.id.button5);
        this.button1.setOnClickListener(new C00231());
        this.button2.setOnClickListener(new C00242());
        this.button3.setOnClickListener(new C00253());
        this.button4.setOnClickListener(new C00264());
        this.button5.setOnClickListener(new C00275());
        this.button6.setOnClickListener(new C00286());
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
