package com.my.newproject2;

import android.app.AlarmManager;
import android.app.Application;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Process;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.Thread.UncaughtExceptionHandler;

public class SketchApplication extends Application {
    private UncaughtExceptionHandler uncaughtExceptionHandler;

    class C00941 implements UncaughtExceptionHandler {
        C00941() {
        }

        public void uncaughtException(Thread thread, Throwable th) {
            Intent intent = new Intent(SketchApplication.this.getApplicationContext(), DebugActivity.class);
            intent.setFlags(32768);
            intent.putExtra("error", SketchApplication.this.getStackTrace(th));
            ((AlarmManager) SketchApplication.this.getSystemService("alarm")).set(2, 1000, PendingIntent.getActivity(SketchApplication.this.getApplicationContext(), 11111, intent, 1073741824));
            Process.killProcess(Process.myPid());
            System.exit(2);
            SketchApplication.this.uncaughtExceptionHandler.uncaughtException(thread, th);
        }
    }

    public void onCreate() {
        this.uncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
        Thread.setDefaultUncaughtExceptionHandler(new C00941());
        super.onCreate();
    }

    private String getStackTrace(Throwable th) {
        Writer stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        while (th != null) {
            th.printStackTrace(printWriter);
            th = th.getCause();
        }
        String obj = stringWriter.toString();
        printWriter.close();
        return obj;
    }
}
