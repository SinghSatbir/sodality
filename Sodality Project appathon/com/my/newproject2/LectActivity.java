package com.my.newproject2;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
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

public class LectActivity extends Activity {
    private Intent f12a = new Intent();
    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private Intent f13i = new Intent();
    private LinearLayout linear1;
    private LinearLayout linear2;
    private LinearLayout linear3;
    private LinearLayout linear4;
    private LinearLayout linear5;

    class C00541 implements OnClickListener {
        C00541() {
        }

        public void onClick(View view) {
            LectActivity.this.f13i.setData(Uri.parse("http://intranet.daiict.ac.in"));
            LectActivity.this.startActivity(LectActivity.this.f13i);
        }
    }

    class C00552 implements OnClickListener {
        C00552() {
        }

        public void onClick(View view) {
            LectActivity.this.f12a.setClass(LectActivity.this.getApplicationContext(), CoursesActivity.class);
            LectActivity.this.startActivity(LectActivity.this.f12a);
        }
    }

    class C00563 implements OnClickListener {
        C00563() {
        }

        public void onClick(View view) {
            LectActivity.this.f12a.setClass(LectActivity.this.getApplicationContext(), WebmailActivity.class);
            LectActivity.this.startActivity(LectActivity.this.f12a);
        }
    }

    class C00574 implements OnClickListener {
        C00574() {
        }

        public void onClick(View view) {
            LectActivity.this.f12a.setClass(LectActivity.this.getApplicationContext(), EcampusActivity.class);
            LectActivity.this.startActivity(LectActivity.this.f12a);
        }
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C0083R.layout.lect);
        initialize();
        initializeLogic();
    }

    private void initialize() {
        this.linear1 = (LinearLayout) findViewById(C0083R.id.linear1);
        this.linear2 = (LinearLayout) findViewById(C0083R.id.linear2);
        this.linear3 = (LinearLayout) findViewById(C0083R.id.linear3);
        this.linear4 = (LinearLayout) findViewById(C0083R.id.linear4);
        this.linear5 = (LinearLayout) findViewById(C0083R.id.linear5);
        this.button1 = (Button) findViewById(C0083R.id.button1);
        this.button2 = (Button) findViewById(C0083R.id.button2);
        this.button3 = (Button) findViewById(C0083R.id.button3);
        this.button4 = (Button) findViewById(C0083R.id.button4);
        this.button1.setOnClickListener(new C00541());
        this.button2.setOnClickListener(new C00552());
        this.button3.setOnClickListener(new C00563());
        this.button4.setOnClickListener(new C00574());
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
