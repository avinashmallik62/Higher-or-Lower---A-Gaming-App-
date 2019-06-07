package com.avinash.higherorlower;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int randomNumber;

    public void makeToast(String string){

        Toast.makeText(MainActivity.this, string, Toast.LENGTH_SHORT).show();

    }

    public void guess(View view){

        EditText guessEditText = (EditText)findViewById(R.id.guessEditText);

        int guessInt = Integer.parseInt(guessEditText.getText().toString());

        if(guessInt>randomNumber){

            makeToast("Lower!");

        }
        else if(guessInt<randomNumber){

          makeToast("Higher!");

        }else{

            makeToast("That's right! Try Again.");

            Random random = new Random();

            randomNumber = random.nextInt(20)+1;

        }

    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Random random = new Random();

        randomNumber = random.nextInt(20)+1;
    }
}
