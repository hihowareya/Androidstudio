package com.example.dominickwood.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendMessage (View view)
    {
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText editText = (EditText) findViewById(R.id.editText);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }

    public void Beginner (View view)
    {
        Intent intent = new Intent(this, Beginner.class);
        startActivity(intent);
    }

    public void Inter (View view)
    {
        Intent intent = new Intent(this, Inter.class);
        startActivity(intent);
    }

    public void Advanced (View view)
    {
        Intent intent = new Intent(this, Advanced.class);
    }
}
