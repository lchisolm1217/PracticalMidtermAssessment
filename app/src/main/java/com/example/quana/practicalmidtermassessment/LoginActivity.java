package com.example.quana.practicalmidtermassessment;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

/**
 * Created by Quana on 1/16/18.
 */

public class LoginActivity {
    EditText editText1 = new EditText();
    EditText editText2 = new EditText();
    CheckBox checkBox = new CheckBox();
    Button button = new Button();

    button.setOnClickListener(new View.OnClickListener) {
        @Override
                public void onClick
      private SharedPreferences app_prefs;
        SharedPreferences pref = getPreferences(Context.MODE_PRIVATE);
        String string = pref.getString("user@aol.com","password123");
    }


    editor.commit();
}