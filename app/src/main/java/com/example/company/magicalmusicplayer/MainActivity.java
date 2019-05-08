package com.example.company.magicalmusicplayer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_library);
    }

    public void showMenu(View view)
    {
        Toast.makeText(this, "Menu pressed", Toast.LENGTH_SHORT).show();
    }

    public void openSearch(View view)
    {
        Toast.makeText(this, "Search pressed", Toast.LENGTH_SHORT).show();
    }
}
