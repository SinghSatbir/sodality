package com.my.newproject2;

import android.app.Activity;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.util.SparseBooleanArray;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ListView;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.Random;

public class ComplainsActivity extends Activity {
    private WebView webview1;

    class C00111 extends WebViewClient {
        C00111() {
        }

        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            super.onPageStarted(webView, str, bitmap);
        }

        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
        }
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C0083R.layout.complains);
        initialize();
        initializeLogic();
    }

    private void initialize() {
        this.webview1 = (WebView) findViewById(C0083R.id.webview1);
        this.webview1.getSettings().setJavaScriptEnabled(true);
        this.webview1.getSettings().setSupportZoom(true);
        this.webview1.setWebViewClient(new C00111());
    }

    private void initializeLogic() {
        this.webview1.loadUrl("https://docs.google.com/forms/d/1qEZ-XtEqQiDmg7xku-PX1wjshLp_Iv70V0pYCwQFqi0/edit");
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
