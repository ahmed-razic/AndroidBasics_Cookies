package com.example.android.cookies;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Called when the cookie should be eaten.
     */
    public void eatCookie(View view) {
        ImageView myImage = findViewById(R.id.android_cookie_image_view);
        myImage.setImageResource(R.drawable.after_cookie);

        TextView myTextView = findViewById(R.id.status_text_view);
        myTextView.setText("I'm so full");
    }
}