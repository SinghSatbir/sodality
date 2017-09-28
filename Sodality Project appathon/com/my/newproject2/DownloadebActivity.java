package com.my.newproject2;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.util.SparseBooleanArray;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.Random;

public class DownloadebActivity extends Activity {
    private Button button1;
    private Button button2;
    private Button button3;
    private Intent downloadeb = new Intent();
    private LinearLayout linear1;
    private Intent mtech = new Intent();
    private WebView webview1;

    class C00291 extends WebViewClient {
        C00291() {
        }

        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            super.onPageStarted(webView, str, bitmap);
        }

        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
        }
    }

    class C00302 implements OnClickListener {
        C00302() {
        }

        public void onClick(View view) {
            DownloadebActivity.this.downloadeb.setClass(DownloadebActivity.this.getApplicationContext(), CalculusActivity.class);
            DownloadebActivity.this.startActivity(DownloadebActivity.this.downloadeb);
        }
    }

    class C00313 implements OnClickListener {
        C00313() {
        }

        public void onClick(View view) {
            DownloadebActivity.this.downloadeb.setClass(DownloadebActivity.this.getApplicationContext(), ElecebookActivity.class);
            DownloadebActivity.this.startActivity(DownloadebActivity.this.downloadeb);
        }
    }

    class C00324 implements OnClickListener {
        C00324() {
        }

        public void onClick(View view) {
            DownloadebActivity.this.mtech.setClass(DownloadebActivity.this.getApplicationContext(), MtechActivity.class);
            DownloadebActivity.this.startActivity(DownloadebActivity.this.mtech);
        }
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C0083R.layout.downloadeb);
        initialize();
        initializeLogic();
    }

    private void initialize() {
        this.linear1 = (LinearLayout) findViewById(C0083R.id.linear1);
        this.button1 = (Button) findViewById(C0083R.id.button1);
        this.button2 = (Button) findViewById(C0083R.id.button2);
        this.webview1 = (WebView) findViewById(C0083R.id.webview1);
        this.webview1.getSettings().setJavaScriptEnabled(true);
        this.webview1.getSettings().setSupportZoom(true);
        this.webview1.setWebViewClient(new C00291());
        this.button3 = (Button) findViewById(C0083R.id.button3);
        this.button1.setOnClickListener(new C00302());
        this.button2.setOnClickListener(new C00313());
        this.button3.setOnClickListener(new C00324());
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
