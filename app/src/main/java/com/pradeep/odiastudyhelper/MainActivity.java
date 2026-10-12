
package com.pradeep.odiastudyhelper;

import android.app.Activity;
import android.os.Bundle;
import android.graphics.Color;
import android.view.Gravity;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.setGravity(Gravity.CENTER);
        layout.setPadding(24, 24, 24, 24);
        layout.setBackgroundColor(Color.rgb(240, 248, 255));

        TextView title = new TextView(this);
        title.setText("Odia Study Helper");
        title.setTextSize(28);
        title.setTextColor(Color.rgb(20, 70, 140));
        title.setGravity(Gravity.CENTER);

        TextView message = new TextView(this);
        message.setText("ନମସ୍କାର! ଆସ, ଆଜି ପାଠ ପଢ଼ିବା।");
        message.setTextSize(20);
        message.setTextColor(Color.BLACK);
        message.setGravity(Gravity.CENTER);
        message.setPadding(0, 32, 0, 0);

        layout.addView(title);
        layout.addView(message);

        setContentView(layout);
    }
}
