package com.example.quana.practicalmidtermassessment;

import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new MyTask().execute(0);


    }

    private class MyTask extends AsyncTask<Integer, Integer, Integer> {

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
        }

        @Override
        protected void onPostExecute(Integer integer) {
            super.onPostExecute(integer);
            final TextView text1 = (TextView) findViewById(R.id.text1);
            text1.setText("Loops Completed" + "doInBackground() ");
            Intent intent = new Intent(this, LoginActivity.class);
            EditText editText = (EditText) findViewById(R.id.editText);
        }

        @Override
        protected void onProgressUpdate(Integer... values) {
            super.onProgressUpdate(values);
            final TextView text1 = (TextView) findViewById(R.id.text1);
            text1.setText("Loops Completed" + "doInBackground() ");
        }

        @Override
        protected Integer doInBackground(Integer... integers) {
            int i;
            for (i = 0; i <= 100000; i++) ; {

                publishProgress(i);

                return null;
            }

        }
    }

}

