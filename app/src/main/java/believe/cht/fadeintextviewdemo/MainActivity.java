package believe.cht.fadeintextviewdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import believe.cht.fadeintextview.TextViewListener;

public class MainActivity extends AppCompatActivity {

    believe.cht.fadeintextview.TextView textView;
    EditText editText;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);
        editText = findViewById(R.id.editText);
        button = findViewById(R.id.button);

        textView = findViewById(R.id.textView);
        textView.setListener(new TextViewListener() {
            @Override
            public void onTextStart() {
                Toast.makeText(getBaseContext(), "onTextStart() fired!", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onTextFinish() {
                Toast.makeText(getBaseContext(), "onTextFinish() fired!", Toast.LENGTH_SHORT).show();
            }
        });

        editText = findViewById(R.id.editText);
        button = findViewById(R.id.button);

        editText.setText(getResources().getString(R.string.welcome_message));

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(editText.getText().toString());
            }
        });

    }
}
