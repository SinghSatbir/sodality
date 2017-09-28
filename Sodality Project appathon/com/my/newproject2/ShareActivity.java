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

public class ShareActivity extends Activity {
    private Intent f21a = new Intent();
    private Intent f22b = new Intent();
    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private LinearLayout linear1;
    private LinearLayout linear2;

    class C00901 implements OnClickListener {
        C00901() {
        }

        public void onClick(View view) {
            ShareActivity.this.f21a.setClass(ShareActivity.this.getApplicationContext(), FblActivity.class);
            ShareActivity.this.startActivity(ShareActivity.this.f21a);
        }
    }

    class C00912 implements OnClickListener {
        C00912() {
        }

        public void onClick(View view) {
        }
    }

    class C00923 implements OnClickListener {
        C00923() {
        }

        public void onClick(View view) {
        }
    }

    class C00934 implements OnClickListener {
        C00934() {
        }

        public void onClick(View view) {
            ShareActivity.this.f22b.setClass(ShareActivity.this.getApplicationContext(), InstlActivity.class);
            ShareActivity.this.startActivity(ShareActivity.this.f22b);
        }
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C0083R.layout.share);
        initialize();
        initializeLogic();
    }

    private void initialize() {
        this.linear1 = (LinearLayout) findViewById(C0083R.id.linear1);
        this.linear2 = (LinearLayout) findViewById(C0083R.id.linear2);
        this.button1 = (Button) findViewById(C0083R.id.button1);
        this.button2 = (Button) findViewById(C0083R.id.button2);
        this.button3 = (Button) findViewById(C0083R.id.button3);
        this.button4 = (Button) findViewById(C0083R.id.button4);
        this.button1.setOnClickListener(new C00901());
        this.button2.setOnClickListener(new C00912());
        this.button3.setOnClickListener(new C00923());
        this.button4.setOnClickListener(new C00934());
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
