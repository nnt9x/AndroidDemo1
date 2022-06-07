package com.bkacad.nnt;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class ListActivityBasic extends AppCompatActivity {

    private ListView lvMonth;
    private ArrayAdapter<String> arrayAdapter;

    private void initView() {
        lvMonth = findViewById(R.id.lvMonth);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_basic);
        initView();

        // Dữ liệu
        List<String> listDataMonth = new ArrayList<>();
        listDataMonth.add("Tháng 1");
        listDataMonth.add("Tháng 2");
        listDataMonth.add("Tháng 3");
        listDataMonth.add("Tháng 4");
        listDataMonth.add("Tháng 5");
        listDataMonth.add("Tháng 6");
        listDataMonth.add("Tháng 7");
        listDataMonth.add("Tháng 8");
        listDataMonth.add("Tháng 9");
        listDataMonth.add("Tháng 10");
        listDataMonth.add("Tháng 11");
        listDataMonth.add("Tháng 12");

        // Adapter
        arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,
                listDataMonth);
        // Set adapter cho listview
        lvMonth.setAdapter(arrayAdapter);

        // Các sự kiện khi click vào listview
        lvMonth.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(ListActivityBasic.this, "index: " + i, Toast.LENGTH_SHORT).show();
            }
        });
    }
}