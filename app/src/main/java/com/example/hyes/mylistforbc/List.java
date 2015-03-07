package com.example.hyes.mylistforbc;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;


public class List extends ActionBarActivity {

    private ArrayList<Item> temp = new ArrayList<Item>();
    ListView view;

    String[] check_nums = {"1", "0", "1", "0", "0"};
    String[] titles = {"20150307", "20150301", "20150218", "라라라", "마마마"};
    String[] contents ={"abc@google.com", "def@google.com", "ghi@nanan.com", "라내용내용", "마내용내용"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        view = (ListView)findViewById(R.id.listView);
        ItemAdapter adapter = new ItemAdapter();

        adapter.add(new Item(check_nums[0], titles[0], contents[0]));
        adapter.add(new Item(check_nums[1], titles[1], contents[1]));
        adapter.add(new Item(check_nums[2], titles[2], contents[2]));
        adapter.add(new Item(check_nums[3], titles[3], contents[3]));
        adapter.add(new Item(check_nums[4], titles[4], contents[4]));

        view.setAdapter(adapter);

        view.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intent = new Intent(getApplicationContext(), EachView.class);
                startActivity(intent);

                Toast.makeText(getApplicationContext(), "클릭 위치는: " + position, Toast.LENGTH_SHORT).show();
                Log.i("TEST", temp.get(position).getTitle()+", " +temp.get(position).getContent());
            }
        });

    }





    class ItemAdapter extends BaseAdapter {
//        ArrayList<Item> temp = new ArrayList<Item>();

        @Override
        public int getCount() {
            return temp.size();
        }

        @Override
        public Object getItem(int position) {
            return temp.get(position);
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        public void add(Item item){
            temp.add(item);
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            ItemView view = null;
            if(convertView == null){
                view = new ItemView(getApplicationContext());
            }else{
                view = (ItemView)convertView;
            }

            Item current = (Item) temp.get(position);

            view.setCount(current.getCount());
            view.setTitle(current.getTitle());
            view.setContent(current.getContent());

            return view;
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
