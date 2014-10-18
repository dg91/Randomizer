package com.cookie.Randomizer;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

    private final Context context = this;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        Button randomButton = (Button)this.findViewById(R.id.random);
        randomButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new CloseApp(context);
            }
        });
    }
}
