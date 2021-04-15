package com.zzcj_zcj.birthdaypresent;

import android.Manifest;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

public class call extends Activity {
    private EditText editText;
    private Button button;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.call);
        button = (Button) findViewById(R.id.button);
        editText = (EditText) findViewById(R.id.edittext);
    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    public void click(View view) {
        String number = editText.getText().toString().trim();
        Intent intent = new Intent(Intent.ACTION_DIAL);
        Uri date = Uri.parse("tel:" + number);
        intent.setData(date);
        startActivity(intent);
    }
}
