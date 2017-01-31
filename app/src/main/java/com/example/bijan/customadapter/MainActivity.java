package com.example.bijan.customadapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    EditText et1,et2,et3;
    Button b;
    ListView l;
    ArrayList <Employee> al;
    MyAdapter m;

    public class MyAdapter extends BaseAdapter{

        @Override
        public int getCount() {
            return al.size();
        }

        @Override
        public Object getItem(int i) {
            return al.get(i);
        }

        @Override
        public long getItemId(int i) {
            return i;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            Employee e = al.get(i);
            Log.d("Employee", "Position"+i);
            View v = getLayoutInflater().inflate(R.layout.row, null);
            TextView tv1 = (TextView) v.findViewById(R.id.text1);
            TextView tv2 = (TextView) v.findViewById(R.id.text2);
            TextView tv3 = (TextView) v.findViewById(R.id.text3);

            tv1.setText(e.getEno());
            tv2.setText(e.getEname());
            tv3.setText(e.getEsal());

            return  v;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText) findViewById(R.id.edittext1);
        et2 = (EditText) findViewById(R.id.edittext2);
        et3 = (EditText) findViewById(R.id.edittext3);
        b = (Button) findViewById(R.id.button);
        l = (ListView) findViewById(R.id.listview);

        al = new ArrayList<Employee>();

        m = new MyAdapter();

        l.setAdapter(m);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String eno = et1.getText().toString();
                String ename = et2.getText().toString();
                String esal = et3.getText().toString();

                Employee e = new Employee(eno,ename,esal);

                al.add(e);

                m.notifyDataSetChanged();

                et1.setText("");
                et2.setText("");
                et3.setText("");

                et1.requestFocus();
            }
        });
    }
}
