package com.zzcj_zcj.birthdaypresent;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private RelativeLayout jielun;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        jielun=findViewById(R.id.jielun);
        Toast.makeText(this,"你点击一下你爱的杰伦试试!!!",Toast.LENGTH_LONG).show();
    }
    public void click(View view){
        Toast.makeText(this,"你爱的杰伦不见了,哈哈--不过没关系,上面还有四个惊喜哟!!!",Toast.LENGTH_LONG).show();
        final Intent it = new Intent(this, Main2Activity.class);
        Thread thread = new Thread() {
            public void run() {
                try {
                    sleep(1000);
                    startActivity(it);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        thread.start();
    }
}
