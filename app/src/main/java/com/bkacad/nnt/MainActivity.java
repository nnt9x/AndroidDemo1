package com.bkacad.nnt;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    // Khai báo view
    private Button btnMain, btn2Main;
    private TextView tvMain;
    private ImageView imgMain;

    // init UI
    private void initView() {
        btnMain = findViewById(R.id.btnMain);
        btn2Main = findViewById(R.id.btn2Main);
        tvMain = findViewById(R.id.tvMain);
        imgMain = findViewById(R.id.img);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        // Lắng nghe sự kiện onClick button
        btnMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvMain.setText("clicked");
            }
        });
        // Sự kiện long click
        btnMain.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                Toast.makeText(MainActivity.this, "Nhấn giữ", Toast.LENGTH_SHORT).show();
                return false;
            }
        });

        imgMain.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                Toast.makeText(MainActivity.this, "Nhấn giữ vào hình ảnh", Toast.LENGTH_SHORT).show();
                return false;
            }
        });

        // Chuyển sang Activity số 2
        btn2Main.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(intent);
            }
        });
    }
}