package com.example.lab6part2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button BtnPenguin = (Button)findViewById(R.id.BtnPenguin);
        Button BtnRabbit = (Button)findViewById(R.id.BtnRabbit);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment fragment = null;
                if (v == findViewById(R.id.BtnPenguin)){
                    fragment = new FragmentPenguin();
                }else{
                    fragment = new FragmentRabbit();
                }
                FragmentManager manager = getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.FragOutput, fragment);
                transaction.commit();
            }
        };

        BtnPenguin.setOnClickListener(listener);
        BtnRabbit.setOnClickListener(listener);
    }
}