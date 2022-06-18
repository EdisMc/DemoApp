package bg.tu.varna.demoapp;

import androidx.appcompat.app.AppCompatActivity;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView txtMessage;
    private Button btnMessage;
    private EditText editMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtMessage = findViewById(R.id.textMessage);
        btnMessage = findViewById(R.id.showButton);
        editMessage = findViewById(R.id.editMessage);

        //txtMessage.setText(R.string.some_demo);
        txtMessage.setTextColor(Color.argb(80, 4, 56, 11));
        txtMessage.setTextSize(33.5f);

        /*txtMessage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnMessage.setBackgroundResource(R.drawable.ic_launcher_background);
            }
        });*/

        btnMessage.setText(R.string.show_button);
        btnMessage.setBackgroundColor(Color.BLACK);

        btnMessage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String message = editMessage.getText().toString();
                if (!TextUtils.isEmpty(message)) {
                    txtMessage.setText(message);
                } else {
                    txtMessage.setText(R.string.not_empty);
                }
            }
        });

        btnMessage.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                txtMessage.setBackgroundColor(Color.CYAN);
                return true;
            }
        });

        //editMessage.setText(R.string.put_message);
        //getText
        //txtMessage.setText(editMessage.getText().toString());
        //editMessage.setHint(R.string.hint_message);
        //editMessage.setHintTextColor(Color.MAGENTA);
    }

}