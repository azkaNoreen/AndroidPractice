package com.example.studentapp.lab8;

import android.app.Activity;
import android.app.Dialog;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;

import androidx.fragment.app.DialogFragment;

import com.example.studentapp.R;

public class CustomDialog {

    public void showDialog(Activity activity, String msg, String submessage){
        final Dialog dialog = new Dialog(activity);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setCancelable(false);
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
