package com.jwn.petbio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private ImageView catView;
    private ImageView dogView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        catView = (ImageView) findViewById(R.id.catID);
        dogView = (ImageView) findViewById(R.id.dogID);

        catView.setOnClickListener(this);// on click, this catView is now registered to OnClickListener
        dogView.setOnClickListener(this);

    }
    //ImageView is a type of View & inherits the properties. View is a tappable screen
    //Buttons are a type of View & inherits the properties.
    //Therefore, event listeners can be added to any type of view.
    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.catID:
                //go to second activity
                //Toast.makeText(MainActivity.this, "Cat", Toast.LENGTH_LONG).show();
                Intent catIntent = new Intent(MainActivity.this, BioActivity.class);
                catIntent.putExtra("name", "Scuttlebutt");
                catIntent.putExtra("bio", "Great cat. Loves mice.");
                startActivity(catIntent);
                break;
            case R.id.dogID:
                //go to second Activity
                //Toast.makeText(MainActivity.this, "Dog", Toast.LENGTH_LONG).show();
                Intent dogIntent = new Intent(MainActivity.this, BioActivity.class);
                dogIntent.putExtra("name", "Molly");
                dogIntent.putExtra("bio", "Great dog. Loves people.");
                startActivity(dogIntent);
                break;
        }
    }
}
