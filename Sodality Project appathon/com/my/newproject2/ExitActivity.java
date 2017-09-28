package com.my.newproject2;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.SparseBooleanArray;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.Random;

public class ExitActivity extends Activity {
    private Button button1;
    private EditText edittext1;
    private EditText edittext2;
    private Intent f10i = new Intent();
    private LinearLayout linear1;
    private LinearLayout linear2;
    private LinearLayout linear3;
    private LinearLayout linear4;

    class C00391 implements OnClickListener {
        C00391() {
        }

        public void onClick(View view) {
            ExitActivity.this.f10i.setAction("android.intent.action.VIEW");
            ExitActivity.this.f10i.setData(Uri.parse("sms:".concat(ExitActivity.this.edittext1.getText().toString())));
            ExitActivity.this.f10i.putExtra("sms_body", ExitActivity.this.edittext2.getText().toString());
            ExitActivity.this.startActivity(ExitActivity.this.f10i);
        }
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C0083R.layout.exit);
        initialize();
        initializeLogic();
    }

    private void initialize() {
        this.linear1 = (LinearLayout) findViewById(C0083R.id.linear1);
        this.linear2 = (LinearLayout) findViewById(C0083R.id.linear2);
        this.linear3 = (LinearLayout) findViewById(C0083R.id.linear3);
        this.linear4 = (LinearLayout) findViewById(C0083R.id.linear4);
        this.edittext1 = (EditText) findViewById(C0083R.id.edittext1);
        this.edittext2 = (EditText) findViewById(C0083R.id.edittext2);
        this.button1 = (Button) findViewById(C0083R.id.button1);
        this.button1.setOnClickListener(new C00391());
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
