package com.example.tiktaktoe;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import java.lang.Thread;

import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9;
    TextView tv2;
    String s1,s2,s3,s4,s5,s6,s7,s8,s9;
    int ctr=0;
    int flag=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initialize();

    }
    private void initialize() {
        b1 = findViewById(R.id.b1);
        b2 = findViewById(R.id.b2);
        b3 = findViewById(R.id.b3);
        b4 = findViewById(R.id.b4);
        b5 = findViewById(R.id.b5);
        b6 = findViewById(R.id.b6);
        b7 = findViewById(R.id.b7);
        b8 = findViewById(R.id.b8);
        b9 = findViewById(R.id.b9);
        tv2=findViewById(R.id.tv2);
    }
    public void clickMethod(View view){
        Button currentB = (Button)view;

//        String s = currentB.getText().toString();
        if(currentB.getText().toString().equals("")) {
                ctr++;

            if (flag == 0) {
                currentB.setText("X");
                flag = 1;
                tv2.setText("Term : Player 'O'");
            } else {
                currentB.setText("O");
                flag = 0;
                tv2.setText("Term : Player 'X'");
            }

            if (ctr > 4 ) {
                s1 = b1.getText().toString();
                s2 = b2.getText().toString();
                s3 = b3.getText().toString();
                s4 = b4.getText().toString();
                s5 = b5.getText().toString();
                s6 = b6.getText().toString();
                s7 = b7.getText().toString();
                s8 = b8.getText().toString();
                s9 = b9.getText().toString();

                if (s1.equals(s2) && s2.equals(s3) && s3.equals(s1) && !s1.equals("")) {
                    Toast.makeText(this, "The winner is "+s1, Toast.LENGTH_SHORT).show();
                    restart();
                } else if (s4.equals(s5) && s5.equals(s6) && s6.equals(s4) && !s4.equals("")) {
                    Toast.makeText(this, "The winner is "+s4, Toast.LENGTH_SHORT).show();
                    restart();
                } else if (s7.equals(s8) && s8.equals(s9) && s9.equals(s7) && !s7.equals("")) {
                    Toast.makeText(this, "The winner is "+s7, Toast.LENGTH_SHORT).show();
                    restart();
                } else if (s1.equals(s4) && s4.equals(s7) && s7.equals(s1) && !s1.equals("")) {
                    Toast.makeText(this, "The winner is "+s1, Toast.LENGTH_SHORT).show();
                    restart();
                } else if (s2.equals(s5) && s5.equals(s8) && s8.equals(s2) && !s2.equals("")) {
                    Toast.makeText(this, "The winner is "+s2, Toast.LENGTH_SHORT).show();
                    restart();
                } else if (s3.equals(s6) && s6.equals(s9) && s9.equals(s3) && !s3.equals("")) {
                    Toast.makeText(this, "The winner is "+s3, Toast.LENGTH_SHORT).show();
                    restart();
                } else if (s1.equals(s5) && s5.equals(s9) && s9.equals(s1) && !s1.equals("")) {
                    Toast.makeText(this, "The winner is "+s1, Toast.LENGTH_SHORT).show();
                    restart();
                } else if (s3.equals(s5) && s5.equals(s7) && s7.equals(s3) && !s3.equals("")) {
                    Toast.makeText(this, "The winner is "+s3, Toast.LENGTH_SHORT).show();
                    restart();
                }else if(!s1.equals("") && !s2.equals("") && !s3.equals("") && !s4.equals("") &&
                        !s5.equals("") && !s6.equals("") && !s7.equals("") && !s8.equals("") &&
                        !s9.equals("")){
                    Toast.makeText(this, "The Game is Draw", Toast.LENGTH_SHORT).show();
                    restart();
                }
            }
        }
    }
    public void restart(){
        b1.setText("");
        b2.setText("");
        b3.setText("");
        b4.setText("");
        b5.setText("");
        b6.setText("");
        b7.setText("");
        b8.setText("");
        b9.setText("");
        ctr=0;
        flag=0;
        tv2.setText("Term : Player 'X'");
    }

}