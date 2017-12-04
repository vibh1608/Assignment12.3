package com.example.user.assignment123;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    //creating object of edittext
    EditText mText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //setting reference to object of edittext with UI edittext
        mText = findViewById(R.id.text);
    }


    //implementing onclick method on delete button
    @Override
    public void onClick(View view) {
        int id;
        id=view.getId();
        if(id==R.id.deleting)
        {
            //creating dialog alert object
            AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);

            //setting icon to alert dialog box
            builder.setIcon(R.drawable.image);

            //setting title to alert dialog box
            builder.setTitle("Confirm Delete...");

            //setting message to show in dialog box
            builder.setMessage("Are you sure you want delete this ?");

            //setting positive response to the dialog box
            builder.setPositiveButton("YES", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    mText.setText("");
                    dialogInterface.dismiss();
                }
            });

            //setting negative response to dialog box
            builder.setNegativeButton("NO", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    dialogInterface.dismiss();
                }
            });
            builder.show();
        }
    }
}
