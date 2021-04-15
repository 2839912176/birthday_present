package com.zzcj_zcj.birthdaypresent;

import android.app.Application;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.NonNull;

public class Main3Activity extends Dialog {
    public Main3Activity(@NonNull Context context) {
        super(context,R.style.ShowImageDialog);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        setCanceledOnTouchOutside(true); // 设置点击屏幕或物理返回键，dialog是否消失

    }


}
