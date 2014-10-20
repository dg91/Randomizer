package com.cookie.Randomizer;

import android.app.Dialog;
import android.content.Context;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Close the application within 3 seconds or less.
 */
public class CloseApp {

    private final TextView popUpText;
    private final String messageBegin = " The application will close in ";
    private String messageEnd;

    public CloseApp(Context context) {

        // Create dialog content
        Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.popup_onebutton);
        dialog.setTitle("Application will close!");
        dialog.show();

        // Create text to the PopUp Window content
        popUpText = (TextView) dialog.findViewById(R.id.popUpText);

        // Crate Count Down Timer and set PopUp Window text accordingly.
        new CountDownTimer(4000, 1000) {
            @Override
            public void onTick(long remainingSeconds) {
                if (remainingSeconds / 1000 == 1) {
                    messageEnd = " second!\n Press OK to stop it!";
                } else {
                    messageEnd = " seconds!\n Press OK to stop it!";
                }
                popUpText.setText(messageBegin + remainingSeconds / 1000 + messageEnd);
            }

            @Override
            public void onFinish() {
                System.exit(0);
            }
        }.start();

        // Create button content
        Button okButton = (Button) dialog.findViewById(R.id.popUpOK);
        okButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.exit(0);
            }
        });
    }
}
