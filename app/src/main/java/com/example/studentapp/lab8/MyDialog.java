package com.example.studentapp.lab8;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.studentapp.R;

public class MyDialog extends AppCompatActivity {
Button sd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_dialog);
        sd=findViewById(R.id.shoeDialog);

        sd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder=new AlertDialog.Builder(MyDialog.this);
                showDialog(MyDialog.this,"This is Me","This is it");
//                CustomDialog myDialog=new CustomDialog();
//                myDialog.showDialog(MyDialog.this,"This is me","this is sub me");

//                builder.setMessage("this is me").setTitle("Hello");
//                builder.setPositiveButton(R.string.ok, new DialogInterface.OnClickListener() {
//                    @Override
//                    public void onClick(DialogInterface dialog, int which) {
//                        Toast.makeText(MyDialog.this, "I am ok", Toast.LENGTH_SHORT).show();
//                    }
//                });
//                builder.setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() {
//                    @Override
//                    public void onClick(DialogInterface dialog, int which) {
//                        Toast.makeText(MyDialog.this, "I am cancel", Toast.LENGTH_SHORT).show();
//                    }
//                });
//               AlertDialog dialog=builder.create();
//               dialog.show();
            }
        });
    }
    public void showDialog(Activity activity, String msg, String submessage){
        final Dialog dialog = new Dialog(activity);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);  //don't show dialog default title
        dialog.setCancelable(false); //don't dismiss the dialog if other area is selected
        dialog.setContentView(R.layout.dialoglayout);

        TextView text = (TextView) dialog.findViewById(R.id.name);
        TextView stext = (TextView) dialog.findViewById(R.id.sname);

        text.setText(msg);
        stext.setText(submessage);

        Button dialogButton = (Button) dialog.findViewById(R.id.clickme);
        dialogButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });
        dialog.show();

    }
}