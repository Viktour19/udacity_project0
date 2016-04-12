package com.n4labs.project0;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        context = getApplicationContext();
    }

    public void goToProject(View v)
    {
        Button button = (Button)v;
        CharSequence nameOfApp = button.getText();


        Toast.makeText(context, "This button will launch my " + nameOfApp + " app", Toast.LENGTH_SHORT).show();
    }
}
