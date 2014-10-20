package com.cookie.Randomizer.MusicPlayer;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.cookie.Randomizer.R;

/**
 * Created by Dragos on 20.10.2014.
 */
public class MusicPlayerPopUp {

    public MusicPlayerPopUp(final Context context) {

        // Create dialog content
        final Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.popup_onebutton);
        dialog.setTitle("Random Music Player!");
        dialog.show();

        // Create text to the PopUp Window content
        TextView popUpText = (TextView) dialog.findViewById(R.id.popUpText);
        popUpText.setText(" We have found your favorite songs!\n Click OK if you want to listen to it!");

        // Create button content
        Button okButton = (Button) dialog.findViewById(R.id.popUpOK);
        okButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.dismiss();
                Intent intent = new Intent(context, MusicPlayerActivity.class);
                context.startActivity(intent);
            }
        });
    }
}
