package com.example.jjinetec.softgym;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.LineGraphSeries;

public class GraphicsReports extends AppCompatActivity {

    LineGraphSeries<DataPoint> series;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_graphics_reports);

        double x=-0.5,y;

        GraphView graph=(GraphView) findViewById(R.id.graph);
        series= new LineGraphSeries<DataPoint>();
        for(int i=0; i<500; i++){

            x=x+0.1;
            y=Math.pow(x,3);
            series.appendData(new DataPoint(x,y),true,500);

        }
        graph.addSeries(series);
    }
}
