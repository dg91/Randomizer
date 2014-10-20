package com.cookie.Randomizer.MusicPlayer;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.cookie.Randomizer.MainActivity;
import com.cookie.Randomizer.R;

/**
 * Created by Dragos on 20.10.2014.
 */
public class MusicPlayerActivity extends Activity {

    final private Context context = this;
    final private Activity activity = this;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.music_player);


        Button stopButton = (Button)this.findViewById(R.id.stopButton);
        Button pauseButton = (Button)this.findViewById(R.id.pauseButton);

        // Create close button and specific event.
        // By pressing "Close", the current activity is finished and the user is redirected to the main screen.
        Button closeButton = (Button)this.findViewById(R.id.closeButton);
        closeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, MainActivity.class);
                startActivity(intent);
                activity.finish();
            }
        });

    }
}