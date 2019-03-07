package com.example.sschmidmair16woche22;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
     List<Car> cars = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    private List<String> readAssets ()
    {

        List<String> list = new ArrayList<>();
        String line;
        categorys.clear();
        try {

            FileInputStream fis = openFileInput(file.getName());
            BufferedReader in = new BufferedReader(new InputStreamReader(fis));
            while (true)
            {
                line = in.readLine();
                if(line == null) break;
                String[] split = line.split(";");
                for (int i = 0; i <split.length ; i++) {

                    categorys.add(split[i]);
                }
            }
        }
        catch (Exception e)
        {

        }
        return categorys;

    }
}
