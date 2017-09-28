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

public class ProjectsActivity extends Activity {
    private Intent f17a = new Intent();
    private Intent f18b = new Intent();
    private Button button1;
    private Button button2;
    private Button button3;
    private Intent f19c = new Intent();
    private LinearLayout linear1;
    private LinearLayout linear2;
    private LinearLayout linear3;
    private LinearLayout linear4;

    class C00801 implements OnClickListener {
        C00801() {
        }

        public void onClick(View view) {
            ProjectsActivity.this.f17a.setClass(ProjectsActivity.this.getApplicationContext(), SodalityActivity.class);
            ProjectsActivity.this.startActivity(ProjectsActivity.this.f17a);
        }
    }

    class C00812 implements OnClickListener {
        C00812() {
        }

        public void onClick(View view) {
            ProjectsActivity.this.f18b.setClass(ProjectsActivity.this.getApplicationContext(), HostelActivity.class);
            ProjectsActivity.this.startActivity(ProjectsActivity.this.f18b);
        }
    }

    class C00823 implements OnClickListener {
        C00823() {
        }

        public void onClick(View view) {
            ProjectsActivity.this.f19c.setClass(ProjectsActivity.this.getApplicationContext(), AttendActivity.class);
            ProjectsActivity.this.startActivity(ProjectsActivity.this.f19c);
        }
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C0083R.layout.projects);
        initialize();
        initializeLogic();
    }

    private void initialize() {
        this.linear1 = (LinearLayout) findViewById(C0083R.id.linear1);
        this.linear2 = (LinearLayout) findViewById(C0083R.id.linear2);
        this.linear3 = (LinearLayout) findViewById(C0083R.id.linear3);
        this.linear4 = (LinearLayout) findViewById(C0083R.id.linear4);
        this.button3 = (Button) findViewById(C0083R.id.button3);
        this.button2 = (Button) findViewById(C0083R.id.button2);
        this.button1 = (Button) findViewById(C0083R.id.button1);
        this.button1.setOnClickListener(new C00801());
        this.button2.setOnClickListener(new C00812());
        this.button3.setOnClickListener(new C00823());
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
