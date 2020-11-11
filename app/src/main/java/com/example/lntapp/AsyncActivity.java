package com.example.lntapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ProgressBar;

public class AsyncActivity extends AppCompatActivity {
    ProgressBar progressBar;
    private static final String Tag=AsyncActivity.class.getSimpleName();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_async);
        progressBar=findViewById(R.id.progressBar);
    }

    public void handleClick(View view) {
        Log.i(Tag,"handleClick");
        //download something from internet and
        DownloadTask downloadTask=new DownloadTask(progressBar);
        downloadTask.execute("https://urlforimagetobedownloaded");
        //show the download progress on the progress bar
    }
}