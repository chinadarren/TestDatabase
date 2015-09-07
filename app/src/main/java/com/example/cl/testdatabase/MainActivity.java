package com.example.cl.testdatabase;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends Activity {
    private MyDatabaseHelper dbHepler;
    Button button ;

    private ArrayAdapter<String> adapter;
    private TextView titleText;
    private ListView listView;
    private String[] mListSring  = {"姓名：王奎丰","性别：男","年龄：23","居住地：上海普陀区"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dbHepler = new MyDatabaseHelper(this,"TestDatabase4.db",null,5);
        button = (Button) findViewById(R.id.button_test);

        listView = (ListView) findViewById(R.id.list_view);
        titleText = (TextView) findViewById(R.id.title_text);

        adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,mListSring);
        listView.setAdapter(adapter);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dbHepler.getWritableDatabase();
            }
        });




    }
}