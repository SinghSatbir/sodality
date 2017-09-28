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

public class AcadactActivity extends Activity {
    private Intent download = new Intent();
    private ImageView imageview1;
    private ImageView imageview2;
    private ImageView imageview3;
    private Intent last = new Intent();
    private LinearLayout linear1;
    private LinearLayout linear2;
    private LinearLayout linear3;
    private LinearLayout linear4;
    private Intent weplace = new Intent();

    class C00001 implements OnClickListener {
        C00001() {
        }

        public void onClick(View view) {
            AcadactActivity.this.weplace.setClass(AcadactActivity.this.getApplicationContext(), WeplaceActivity.class);
            AcadactActivity.this.startActivity(AcadactActivity.this.weplace);
        }
    }

    class C00012 implements OnClickListener {
        C00012() {
        }

        public void onClick(View view) {
            AcadactActivity.this.download.setClass(AcadactActivity.this.getApplicationContext(), NptelActivity.class);
            AcadactActivity.this.startActivity(AcadactActivity.this.download);
        }
    }

    class C00023 implements OnClickListener {
        C00023() {
        }

        public void onClick(View view) {
            AcadactActivity.this.download.setClass(AcadactActivity.this.getApplicationContext(), YoutubeActivity.class);
            AcadactActivity.this.startActivity(AcadactActivity.this.download);
        }
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C0083R.layout.acadact);
        initialize();
        initializeLogic();
    }

    private void initialize() {
        this.linear1 = (LinearLayout) findViewById(C0083R.id.linear1);
        this.linear2 = (LinearLayout) findViewById(C0083R.id.linear2);
        this.linear3 = (LinearLayout) findViewById(C0083R.id.linear3);
        this.linear4 = (LinearLayout) findViewById(C0083R.id.linear4);
        this.imageview2 = (ImageView) findViewById(C0083R.id.imageview2);
        this.imageview3 = (ImageView) findViewById(C0083R.id.imageview3);
        this.imageview1 = (ImageView) findViewById(C0083R.id.imageview1);
        this.imageview1.setOnClickListener(new C00001());
        this.imageview2.setOnClickListener(new C00012());
        this.imageview3.setOnClickListener(new C00023());
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
