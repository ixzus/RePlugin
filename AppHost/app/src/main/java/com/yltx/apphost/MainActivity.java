package com.yltx.apphost;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.qihoo360.replugin.RePlugin;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        RePlugin.install("plugin1");
        findViewById(R.id.tv_click).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                RePlugin.startActivity(MainActivity.this, RePlugin.createIntent("plugin1",
                        "com.yltx.appplugin.TestActivity"));
            }
        });
    }
}
