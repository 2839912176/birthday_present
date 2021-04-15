package com.zzcj_zcj.birthdaypresent;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.Manifest;
import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener {
    private RadioGroup radioGroup;
    private RadioButton radioButton1;
    private RadioButton radioButton2;
    private RadioButton radioButton3;
    private RadioButton radioButton4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        radioGroup = (RadioGroup) findViewById(R.id.radio);
        radioButton1 = (RadioButton) findViewById(R.id.radio_one);
        radioButton2 = (RadioButton) findViewById(R.id.radio_two);
        radioButton3 = (RadioButton) findViewById(R.id.radio_three);
        radioButton4 = (RadioButton) findViewById(R.id.radio_Four);
        radioGroup.setOnCheckedChangeListener(this);


    }


    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        switch (checkedId) {
            case R.id.radio_two:
                Main3Activity at = new Main3Activity(Main2Activity.this);
                at.show();
                break;
            case R.id.radio_one:
                new AlertDialog.Builder(Main2Activity.this).setIcon(R.mipmap.dangao)
                        .setTitle("李亚萍祝你生日快乐!!!")
                        .setMessage("天天开心,天天快乐")
                        .setCancelable(false)
                        .setNegativeButton("取消", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(getApplicationContext(), "哼,不可爱啦!!!", Toast.LENGTH_SHORT).show();
                                finish();
                            }
                        })
                        .setPositiveButton("确定", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(getApplicationContext(), "喜欢就多看会,哈哈!!", Toast.LENGTH_SHORT).show();
                            }
                        })
                        .show();
                break;
            case R.id.radio_three:
                Intent intent = new Intent(this,call.class);
                startActivity(intent);
                break;
            case  R.id.radio_Four:
             Intent intent1=new Intent();
            intent1.setAction("android.intent.action.VIEW");
            intent1.setData(Uri.parse("http://www.kuwo.cn/play_detail/51386723"));
            startActivity(intent1);
                break;

                default:
                    break;
        }
    }
    }

