package bg.tu.varna.demoapp;

import androidx.appcompat.app.AppCompatActivity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;;

public class MainActivity extends AppCompatActivity {

    private TextView txtMessage;
    private Button btnMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtMessage = findViewById(R.id.textMessage);
        btnMessage = findViewById(R.id.showButton);

        txtMessage.setText(R.string.some_demo);
        txtMessage.setTextColor(Color.argb(80, 4, 56, 11));
        txtMessage.setTextSize(33.5f);

        txtMessage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnMessage.setBackgroundResource(R.drawable.ic_launcher_background);
            }
        });

        btnMessage.setText(R.string.show_button);
        btnMessage.setBackgroundColor(Color.BLACK);

        btnMessage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int s1 = 12, s2 = 6;
                txtMessage.setText(String.valueOf(s1 + s2));
            }
        });

        btnMessage.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                txtMessage.setBackgroundColor(Color.CYAN);
                return true;
            }
        });
    }

}