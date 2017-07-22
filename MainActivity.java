package com.example.deepa.customlistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.deepa.customlistview.adapters.StudentAdapter;
import com.example.deepa.customlistview.model.Student;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lv;
    String name1,name2,name3,name4,name5,name6,name7,
            phone1,phone2,phone3,phone4,phone5,phone6,phone7;

    ArrayList<Student> mArrayList;
    StudentAdapter mStudentAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv= (ListView) findViewById(R.id.listview);

        mArrayList=new ArrayList<>();

        mArrayList.add(new Student("anu",123456789));
        mArrayList.add(new Student("banu",987654321));
        mArrayList.add(new Student("clary",876787923));
        mArrayList.add(new Student("dhaniya",956571298));
        mArrayList.add(new Student("ega",823765432));
        mArrayList.add(new Student("fana",976727288));
        mArrayList.add(new Student("gana",891234569));

       //mStudentAdapter = new StudentAdapter(this,mArrayList);
        mStudentAdapter=new StudentAdapter(getApplicationContext(),mArrayList);
        lv.setAdapter(mStudentAdapter);


    }
}
