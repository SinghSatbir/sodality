package com.my.newproject2;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.SparseBooleanArray;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends Activity {
    private ArrayList<String> About = new ArrayList();
    private Timer _timer = new Timer();
    private TimerTask f14a;
    private Intent acadact = new Intent();
    private Intent activity1 = new Intent();
    private Intent activity2 = new Intent();
    private Intent cafe = new Intent();
    private Calendar cal = Calendar.getInstance();
    private SharedPreferences databsae;
    private Intent dotactivity = new Intent();
    private Intent help = new Intent();
    private ImageView imageview1;
    private ImageView imageview2;
    private ImageView imageview3;
    private ImageView imageview4;
    private ImageView imageview6;
    private ImageView imageview7;
    private ImageView imageview8;
    private ImageView imageview9;
    private LinearLayout linear1;
    private LinearLayout linear2;
    private LinearLayout linear3;
    private LinearLayout linear4;
    private LinearLayout linear5;
    private LinearLayout linear6;
    private LinearLayout linear7;
    private LinearLayout linear8;
    private Intent meet = new Intent();
    private MediaPlayer so;
    private Intent spinn = new Intent();
    private Intent splash = new Intent();
    private ArrayList<String> str = new ArrayList();
    private String strj = "";
    private TextView textview1;
    private TextView textview2;
    private TimerTask timer1;

    class C00581 implements OnClickListener {
        C00581() {
        }

        public void onClick(View view) {
            MainActivity.this.showMessage("RESOURCE CENTRE ");
            MainActivity.this.activity1.setClass(MainActivity.this.getApplicationContext(), RcactActivity.class);
            MainActivity.this.startActivity(MainActivity.this.activity1);
            MainActivity.this.so = MediaPlayer.create(MainActivity.this.getApplicationContext(), C0083R.raw.tick);
            MainActivity.this.so.start();
        }
    }

    class C00592 implements OnClickListener {
        C00592() {
        }

        public void onClick(View view) {
            MainActivity.this.showMessage("CLUBS N COMMITEES");
            MainActivity.this.activity2.setClass(MainActivity.this.getApplicationContext(), New1Activity.class);
            MainActivity.this.startActivity(MainActivity.this.activity2);
            MainActivity.this.so = MediaPlayer.create(MainActivity.this.getApplicationContext(), C0083R.raw.tick);
            MainActivity.this.so.start();
        }
    }

    class C00603 implements OnClickListener {
        C00603() {
        }

        public void onClick(View view) {
            MainActivity.this.acadact.setClass(MainActivity.this.getApplicationContext(), AcadactActivity.class);
            MainActivity.this.startActivity(MainActivity.this.acadact);
            MainActivity.this.showMessage("ACADEMICS");
            MainActivity.this.so = MediaPlayer.create(MainActivity.this.getApplicationContext(), C0083R.raw.tick);
            MainActivity.this.so.start();
        }
    }

    class C00614 implements OnClickListener {
        C00614() {
        }

        public void onClick(View view) {
            MainActivity.this.cafe.setClass(MainActivity.this.getApplicationContext(), CaffeteriaActivity.class);
            MainActivity.this.startActivity(MainActivity.this.cafe);
            MainActivity.this.showMessage("CAFETERIA");
            MainActivity.this.so = MediaPlayer.create(MainActivity.this.getApplicationContext(), C0083R.raw.tick);
            MainActivity.this.so.start();
        }
    }

    class C00625 implements OnClickListener {
        C00625() {
        }

        public void onClick(View view) {
            MainActivity.this.help.setClass(MainActivity.this.getApplicationContext(), HelpdeskActivity.class);
            MainActivity.this.startActivity(MainActivity.this.help);
            MainActivity.this.showMessage("HELPDESK");
            MainActivity.this.so = MediaPlayer.create(MainActivity.this.getApplicationContext(), C0083R.raw.tick);
            MainActivity.this.so.start();
        }
    }

    class C00636 implements OnClickListener {
        C00636() {
        }

        public void onClick(View view) {
            MainActivity.this.meet.setClass(MainActivity.this.getApplicationContext(), MeetActivity.class);
            MainActivity.this.startActivity(MainActivity.this.meet);
            MainActivity.this.showMessage("ESSENTIALS");
            MainActivity.this.so = MediaPlayer.create(MainActivity.this.getApplicationContext(), C0083R.raw.tick);
            MainActivity.this.so.start();
        }
    }

    class C00647 implements OnClickListener {
        C00647() {
        }

        public void onClick(View view) {
            MainActivity.this.spinn.setClass(MainActivity.this.getApplicationContext(), DotsActivity.class);
            MainActivity.this.startActivity(MainActivity.this.spinn);
        }
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C0083R.layout.main);
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
        this.linear8 = (LinearLayout) findViewById(C0083R.id.linear8);
        this.imageview1 = (ImageView) findViewById(C0083R.id.imageview1);
        this.textview2 = (TextView) findViewById(C0083R.id.textview2);
        this.imageview9 = (ImageView) findViewById(C0083R.id.imageview9);
        this.imageview4 = (ImageView) findViewById(C0083R.id.imageview4);
        this.imageview3 = (ImageView) findViewById(C0083R.id.imageview3);
        this.textview1 = (TextView) findViewById(C0083R.id.textview1);
        this.imageview2 = (ImageView) findViewById(C0083R.id.imageview2);
        this.imageview8 = (ImageView) findViewById(C0083R.id.imageview8);
        this.imageview6 = (ImageView) findViewById(C0083R.id.imageview6);
        this.imageview7 = (ImageView) findViewById(C0083R.id.imageview7);
        this.databsae = getSharedPreferences("database ", 0);
        this.imageview2.setOnClickListener(new C00581());
        this.imageview3.setOnClickListener(new C00592());
        this.imageview4.setOnClickListener(new C00603());
        this.imageview6.setOnClickListener(new C00614());
        this.imageview7.setOnClickListener(new C00625());
        this.imageview8.setOnClickListener(new C00636());
        this.imageview9.setOnClickListener(new C00647());
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
