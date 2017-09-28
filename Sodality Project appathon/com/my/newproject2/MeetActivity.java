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
import android.widget.ScrollView;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.Random;

public class MeetActivity extends Activity {
    private Intent f15d = new Intent();
    private Intent dcei = new Intent();
    private ImageView imageview1;
    private ImageView imageview2;
    private ImageView imageview3;
    private ImageView imageview4;
    private LinearLayout linear2;
    private LinearLayout linear3;
    private LinearLayout linear4;
    private LinearLayout linear5;
    private Intent research = new Intent();
    private ScrollView vscroll1;
    private Intent wie = new Intent();

    class C00651 implements OnClickListener {
        C00651() {
        }

        public void onClick(View view) {
            MeetActivity.this.wie.setClass(MeetActivity.this.getApplicationContext(), WieActivity.class);
            MeetActivity.this.startActivity(MeetActivity.this.wie);
        }
    }

    class C00662 implements OnClickListener {
        C00662() {
        }

        public void onClick(View view) {
            MeetActivity.this.dcei.setClass(MeetActivity.this.getApplicationContext(), DceiActivity.class);
            MeetActivity.this.startActivity(MeetActivity.this.dcei);
        }
    }

    class C00673 implements OnClickListener {
        C00673() {
        }

        public void onClick(View view) {
            MeetActivity.this.research.setClass(MeetActivity.this.getApplicationContext(), ResearchActivity.class);
            MeetActivity.this.startActivity(MeetActivity.this.research);
        }
    }

    class C00684 implements OnClickListener {
        C00684() {
        }

        public void onClick(View view) {
            MeetActivity.this.f15d.setClass(MeetActivity.this.getApplicationContext(), LectActivity.class);
            MeetActivity.this.startActivity(MeetActivity.this.f15d);
        }
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C0083R.layout.meet);
        initialize();
        initializeLogic();
    }

    private void initialize() {
        this.vscroll1 = (ScrollView) findViewById(C0083R.id.vscroll1);
        this.linear2 = (LinearLayout) findViewById(C0083R.id.linear2);
        this.linear3 = (LinearLayout) findViewById(C0083R.id.linear3);
        this.linear4 = (LinearLayout) findViewById(C0083R.id.linear4);
        this.linear5 = (LinearLayout) findViewById(C0083R.id.linear5);
        this.imageview1 = (ImageView) findViewById(C0083R.id.imageview1);
        this.imageview3 = (ImageView) findViewById(C0083R.id.imageview3);
        this.imageview4 = (ImageView) findViewById(C0083R.id.imageview4);
        this.imageview2 = (ImageView) findViewById(C0083R.id.imageview2);
        this.imageview1.setOnClickListener(new C00651());
        this.imageview2.setOnClickListener(new C00662());
        this.imageview3.setOnClickListener(new C00673());
        this.imageview4.setOnClickListener(new C00684());
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
