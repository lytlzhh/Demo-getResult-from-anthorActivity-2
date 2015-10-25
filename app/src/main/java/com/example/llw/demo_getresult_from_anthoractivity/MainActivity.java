package com.example.llw.demo_getresult_from_anthoractivity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button btn_start;
    private TextView textView;
    private int RequalsCode1 = 0x77;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView) findViewById(R.id.text_1);
        btn_start = (Button) findViewById(R.id.button_1);

        btn_start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivityForResult(new Intent(MainActivity.this, Main2Activity.class), RequalsCode1);
            }
        });


    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 0x77) {
            if (resultCode == 0x777) {
                String str = data.getExtras().getString("H");
                textView.setText(" 返回得到的结果是：" + str);
            }
        }

    }
}
