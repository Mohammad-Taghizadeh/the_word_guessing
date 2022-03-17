package com.example.the_word_guessing;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    Button btn_exit;
    Button btn_restart;
    TextView txt_view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        btn_exit= (Button) findViewById(R.id.btn_exit);
        btn_restart= (Button) findViewById(R.id.btn_restart);
        txt_view= (TextView) findViewById(R.id.txt_result);


        Intent intent = getIntent();
        String result=intent.getStringExtra("Test");
        Log.i("text", result);
        if(result.equals("1")){
            txt_view.setText("You Won!");
        }else if(result.equals("0")){
            txt_view.setText("Game Over!");
        }

        btn_exit.setOnClickListener(view -> finish());

        btn_restart.setOnClickListener(view -> {
            Intent intent1 = new Intent(MainActivity2.this, MainActivity.class);
            MainActivity2.this.startActivity(intent1);
            finish();
        });
    }
}