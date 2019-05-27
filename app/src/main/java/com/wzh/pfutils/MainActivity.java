package com.wzh.pfutils;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.wzh.pfutils.model.User;

public class MainActivity extends AppCompatActivity {

    private EditText ed_name, ed_age;
    private TextView tv_user;
    private Button btn_save;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        ed_name = findViewById(R.id.ed_name);
        ed_age = findViewById(R.id.ed_age);
        tv_user = findViewById(R.id.tv_user);
        btn_save = findViewById(R.id.btn_save);
        btn_save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = ed_name.getText().toString().trim();
                int age = Integer.parseInt(ed_age.getText().toString().trim());
                User user = new User();
                user.setName(name);
                user.setAge(age);
//                UserPreferences.get().setUser(user);
            }
        });
    }
}
