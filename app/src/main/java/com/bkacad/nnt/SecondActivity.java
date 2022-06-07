package com.bkacad.nnt;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.squareup.picasso.Picasso;

public class SecondActivity extends AppCompatActivity {

    private Button btnLoad;
    private ImageView imgLoad;

    private void initView() {
        btnLoad = findViewById(R.id.btnLoad);
        imgLoad = findViewById(R.id.imgLoad);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        initView();
        btnLoad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Picasso.get().load("https://i.kym-cdn.com/photos/images/original/002/328/756/335.jpg")
                        .into(imgLoad);
            }
        });
    }
}