package com.example.jjinetec.softgym;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class DescriptionExercise extends AppCompatActivity {

    VideoView video;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description_exercise);

        video= (VideoView) findViewById(R.id.videoView);
        Uri uri = Uri.parse("rtsp://r6---sn-q4fl6n7d.googlevideo.com/Cj0LENy73wIaNAlHxDTArf9zmBMYDSANFC1OQzJYMOCoAUIASARgoO-177L-r9tXigELcEFHVmxjSTFSSTgM/1FBEFC16446E608E99E675C1433B2FFAB7FB9EAB.D60CA0BC2F070E4A1999DD33CADB341E8975A159/yt6/1/video.3gp");
        video.setMediaController(new MediaController(this));
        video.setVideoURI(uri);
        video.requestFocus();
        video.start();
    }
}
