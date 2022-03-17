package com.example.the_word_guessing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    private String word = wordList();
    private  String wordDashed= "";
    private  int imgCode=0;
    TextView txt_word;
    ImageView img_view;

    public String wordList(){
        String[] words= {
                "Hello Word",
                "Flutter",
                "Dart",
                "Java",
                "Kotlin",
                "Asp",
                "Just Flutter",
                "Document",
                "FreeLancer",
                "Programing",
                "Ui Ux",
        };
        int indexWord=(int) (Math.random() * words.length);
        return words[indexWord];
    }
    public void  wordText(){
        for(int i=0; i<word.length(); i++){
            if(word.charAt(i) == ' '){
                wordDashed += " ";
            }else {
                wordDashed += "-";
            }
        }
        txt_word.setText(wordDashed);
    }

    public int imageCod(int image,int id){
        switch (image){
            case 1:id = R.drawable.face_2; break;
            case 2:id = R.drawable.face_3; break;
            case 4:id = R.drawable.face_5; break;
            case 5:id = R.drawable.face_6; break;
            case 6:id = R.drawable.face_7; break;
            case 7:id = R.drawable.face_8; break;
            case 8:id = R.drawable.face_9; break;
        }
        return id;
    }

    public void checkRoute(String text){
        if(text.contains("-")){
            return;
        }else {
            Intent intent= new Intent(MainActivity.this, MainActivity2.class);
            intent.putExtra("Test","1");
            MainActivity.this.startActivity(intent);
            finish();
        }
    }

    public void checkWord(String letter){
        char letterChar= letter.charAt(0);
        String wordToLowerCase= word.toLowerCase();
        if(wordToLowerCase.contains(letter)) {
            for (int i = 0; i < wordToLowerCase.length(); i++) {
                if (wordToLowerCase.charAt(i) == letterChar) {
                    char[] wordDashList= wordDashed.toCharArray();
                    wordDashList[i] = word.charAt(i);
                    wordDashed = new String(wordDashList);
                    txt_word.setText(wordDashed);
                    checkRoute(wordDashed);
                }
            }
        }else {
            imgCode++;
            if(imgCode >= 8){
                Intent intent= new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("Test","0");
                MainActivity.this.startActivity(intent);
                finish();
            }
            int imageId=R.drawable.face_1;
            img_view.setImageResource(imageCod(imgCode,imageId));
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt_word= (TextView) findViewById(R.id.txt_word);
        img_view = (ImageView) findViewById(R.id.img_view);
        TextView txt_a= (TextView) findViewById(R.id.txt_a);
        TextView txt_b= (TextView) findViewById(R.id.txt_b);
        TextView txt_c= (TextView) findViewById(R.id.txt_c);
        TextView txt_d= (TextView) findViewById(R.id.txt_d);
        TextView txt_e= (TextView) findViewById(R.id.txt_e);
        TextView txt_f= (TextView) findViewById(R.id.txt_f);
        TextView txt_g= (TextView) findViewById(R.id.txt_g);
        TextView txt_h= (TextView) findViewById(R.id.txt_h);
        TextView txt_i= (TextView) findViewById(R.id.txt_i);
        TextView txt_j= (TextView) findViewById(R.id.txt_j);
        TextView txt_k= (TextView) findViewById(R.id.txt_k);
        TextView txt_l= (TextView) findViewById(R.id.txt_l);
        TextView txt_m= (TextView) findViewById(R.id.txt_m);
        TextView txt_n= (TextView) findViewById(R.id.txt_n);
        TextView txt_o= (TextView) findViewById(R.id.txt_o);
        TextView txt_p= (TextView) findViewById(R.id.txt_p);
        TextView txt_q= (TextView) findViewById(R.id.txt_q);
        TextView txt_r= (TextView) findViewById(R.id.txt_r);
        TextView txt_s= (TextView) findViewById(R.id.txt_s);
        TextView txt_t= (TextView) findViewById(R.id.txt_t);
        TextView txt_u= (TextView) findViewById(R.id.txt_u);
        TextView txt_v= (TextView) findViewById(R.id.txt_v);
        TextView txt_w= (TextView) findViewById(R.id.txt_w);
        TextView txt_x= (TextView) findViewById(R.id.txt_x);
        TextView txt_y= (TextView) findViewById(R.id.txt_y);
        TextView txt_z= (TextView) findViewById(R.id.txt_z);

        View.OnClickListener listener= view -> {
            TextView textView = (TextView) view;
            String id= view.getResources().getResourceEntryName(textView.getId());
            String letter= id.replace("txt_", "");
            checkWord(letter);
            textView.setVisibility(view.INVISIBLE);
            Log.i("Test", letter);
        };

        wordText();
        txt_a.setOnClickListener(listener);
        txt_b.setOnClickListener(listener);
        txt_c.setOnClickListener(listener);
        txt_d.setOnClickListener(listener);
        txt_e.setOnClickListener(listener);
        txt_f.setOnClickListener(listener);
        txt_g.setOnClickListener(listener);
        txt_h.setOnClickListener(listener);
        txt_i.setOnClickListener(listener);
        txt_j.setOnClickListener(listener);
        txt_k.setOnClickListener(listener);
        txt_l.setOnClickListener(listener);
        txt_m.setOnClickListener(listener);
        txt_n.setOnClickListener(listener);
        txt_o.setOnClickListener(listener);
        txt_p.setOnClickListener(listener);
        txt_q.setOnClickListener(listener);
        txt_r.setOnClickListener(listener);
        txt_s.setOnClickListener(listener);
        txt_t.setOnClickListener(listener);
        txt_u.setOnClickListener(listener);
        txt_v.setOnClickListener(listener);
        txt_w.setOnClickListener(listener);
        txt_x.setOnClickListener(listener);
        txt_y.setOnClickListener(listener);
        txt_z.setOnClickListener(listener);
    }
}