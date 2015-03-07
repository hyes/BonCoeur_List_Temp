package com.example.hyes.mylistforbc;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class Login extends ActionBarActivity {

    EditText email, password, register_email1, register_email2, register_pwd1, register_pwd2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        Button button1 = (Button) findViewById(R.id.button);
        Button button2 = (Button) findViewById(R.id.register_button);

        email = (EditText)findViewById(R.id.email);
        password = (EditText)findViewById(R.id.password);

        register_email1 = (EditText) findViewById(R.id.register_email1);
        register_email2 = (EditText)findViewById(R.id.register_email2);

        register_pwd1 = (EditText)findViewById(R.id.register_pwd1);
        register_pwd2 = (EditText)findViewById(R.id.register_pwd2);

        button1.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {

                   Intent intent = new Intent(getApplicationContext(), List.class);
                   startActivity(intent);
                   Toast.makeText(getApplicationContext(), "등록된 회원이 맞는지 확인 후 진행~", Toast.LENGTH_SHORT).show();

               }
           }
        );

        button2.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {

                   String email1 = register_email1.getText().toString();
                   String email2 = register_email2.getText().toString();

                   String pwd1 = register_pwd1.getText().toString();
                   String pwd2 = register_pwd2.getText().toString();


                   if(email1.equals(email2)){

                       if(pwd1.equals(pwd2)){

                           Toast.makeText(getApplicationContext(), "회원가입처리 후~", Toast.LENGTH_SHORT).show();
                           Intent intent = new Intent(getApplicationContext(), List.class);
                           startActivity(intent);

                       } else {
                           Toast.makeText(getApplicationContext(), "please check password", Toast.LENGTH_SHORT).show();
                       }
                   } else {
                       Toast.makeText(getApplicationContext(), "please check email address", Toast.LENGTH_SHORT).show();
                   }

               }
           }
        );


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
