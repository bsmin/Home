package com.example.emma.fish;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView listview = null ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //액션Text
        getSupportActionBar().setTitle("Always Fishing");

        final String[] items = {"로그인", "낚시", "자랑하기", "공지사항", "문의하기"} ;
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, items) ;

       // listview = (ListView) findViewById(R.id.drawer_menulist) ;
        listview.setAdapter(adapter) ;





    }
}
