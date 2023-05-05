package com.example.imdad;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;

public class MainActivity extends AppCompatActivity {
    ConstraintLayout background;
    TextView txt1,txt2;
    ImageView img,img2,img3;
    float x1,x2,y1,y2;
    int n=1;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        img=findViewById(R.id.imageView);
        img2=findViewById(R.id.imageView2);
        img3=findViewById(R.id.imageView3);
        txt1=findViewById(R.id.textView);
        txt2=findViewById(R.id.textView2);
        background=findViewById(R.id.background);
        button=findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,Login_page.class);
                startActivity(intent);
            }
        });
    }
    public void Next(View view)
    {
        switch (n) {
            case 1: {
                background.setBackground(ContextCompat.getDrawable(this, R.drawable.call));
                txt1.setText("Chat with NGO's");
                txt2.setText("Book an appointment with NGO's.Chat with NGO's\n\t\t\t\t to take away food from your doorstep");
                img.setImageResource(R.drawable.ic_grey_circle);
                img2.setImageResource(R.drawable.ic_blue_circle);
            }
            break;
            case 2: {
                background.setBackground(ContextCompat.getDrawable(this, R.drawable.poor_person));
                txt1.setText("Live Talk with NGO's");
                txt2.setText("Start voice and video call for better communication \n\t\t\t\tof exact size and amount of food rations");
                img2.setImageResource(R.drawable.ic_grey_circle);
                img3.setImageResource(R.drawable.ic_blue_circle);
            }
            break;
            case 3: {
                Intent intent=new Intent(this,Login_page.class);
                startActivity(intent);
            }
            break;
            default:
            { Intent intent=new Intent(this,Login_page.class);
                startActivity(intent);}
                break;
        }
        n++;
    }
    public boolean onTouchEvent(MotionEvent touchevent)
    {
        switch (touchevent.getAction())
        {
            case MotionEvent.ACTION_DOWN:
                x1=touchevent.getX();
                y1=touchevent.getY();
                break;
            case MotionEvent.ACTION_UP: {
                x2 = touchevent.getX();
                y2 = touchevent.getY();


                if (x1 > x2) {
                    switch (n) {
                        case 1: {
                            background.setBackground(ContextCompat.getDrawable(this, R.drawable.call));
                            txt1.setText("Chat with NGO's");
                            txt2.setText("Book an appointment with NGO's.Chat with NGO's \n\t\t\t\tto take away food from your doorstep");
                            img.setImageResource(R.drawable.ic_grey_circle);
                            img2.setImageResource(R.drawable.ic_blue_circle);
                        }
                        break;
                        case 2: {
                            background.setBackground(ContextCompat.getDrawable(this, R.drawable.poor_person));
                            txt1.setText("Live Talk with NGO's");
                            txt2.setText("Start voice and video call for better communication \n\t\t\t\tof exact size and amount of food rations");
                            img2.setImageResource(R.drawable.ic_grey_circle);
                            img3.setImageResource(R.drawable.ic_blue_circle);
                        }
                        break;
                        case 3: {
                            Intent intent=new Intent(this,Login_page.class);
                            startActivity(intent);
                        }
                        break;
                        default:
                        {
                            Intent intent=new Intent(this,Login_page.class);
                            startActivity(intent);
                        }
                            break;
                    }
                    n++;
                }
                if (x1 < x2) {
                    switch (n) {
                        case 1: {
                            Toast.makeText(this, "Activity not defined right now", Toast.LENGTH_SHORT).show();
                        }
                        break;
                        case 2: {
                            background.setBackground(ContextCompat.getDrawable(this, R.drawable.poor_kid));
                            txt1.setText("Thousands of NGO's");
                            txt2.setText("You can easily contact thousand of NGO's and\n \t\t\t\t\t\t\t\tcontact for your needs");
                            img2.setImageResource(R.drawable.ic_grey_circle);
                            img.setImageResource(R.drawable.ic_blue_circle);
                        }
                        break;
                        case 3: {
                            background.setBackground(ContextCompat.getDrawable(this, R.drawable.call));
                            txt1.setText("Chat with NGO's");
                            txt2.setText("Book an appointment with NGO's.\nChat with NGO's to take away food from your doorstep");
                            img3.setImageResource(R.drawable.ic_grey_circle);
                            img2.setImageResource(R.drawable.ic_blue_circle);

                        }
                        break;
                        default:
                            break;
                    }
                    n--;


                }
                break;
            }
    }
        return false;}
}