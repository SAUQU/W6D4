package com.example.segundoauqui.w6d4;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Interactive Pie Chart");

        CustomPieGraph pie = (CustomPieGraph) findViewById(R.id.pie_chart);
        float[] data = {450, 630, 300, 200, 400};
        pie.setData(data);

    }
}
