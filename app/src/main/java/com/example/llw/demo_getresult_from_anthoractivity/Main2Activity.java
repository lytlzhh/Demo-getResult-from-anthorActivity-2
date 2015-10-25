package com.example.llw.demo_getresult_from_anthoractivity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {
    private Button btn_b;

    // final Intent intent = new Intent();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        btn_b = (Button) findViewById(R.id.btn_back);

        btn_b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = getIntent();
                String ss = "hello 你好！发送快递件法规科技东方CJ女款简单女大生即可把";
                intent.putExtra("H", ss);
                setResult(0x777, intent);
                finish();
            }
        });
    }


    @Override
    public void onBackPressed() {
        // super.onBackPressed();//如果调用父类的此方法时为什么不能实现数据返回 因为：此方法是执行系统默认的动作，即：退出当前的activity,这样就不能执行其后面的事物
        Intent intent = getIntent();
        String ss = "hello 你好！发送快递件法规科技东方CJ女款简单女大生即可把 及科学或查看设备出现成本会计说刚才说对方对女方本地化kdhvfdjbvugdvnkn点击可的的";
        intent.putExtra("H", ss);
        setResult(0x777, intent);
        finish();
    }
}
