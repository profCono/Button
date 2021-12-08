package com.example.provabottone;

import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b1;
        b1=findViewById(R.id.bottone);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast t1=Toast.makeText(getApplicationContext(),"mi hai premuto",Toast.LENGTH_SHORT);
                t1.show();
            }
        });
    }

    @Override
    public void onClick(View v) {
        switch(v.getId())
        {
            case R.id.sciopa:{
                Toast t1=Toast.makeText(getApplicationContext(),"BOOOM!!!!!",Toast.LENGTH_SHORT);
                t1.show();
            }
        }
    }
}