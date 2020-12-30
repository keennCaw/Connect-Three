package com.keennhoward.connectthree;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    boolean colorCheck = true;
    String red = "";
    String yellow = "";
    ImageView imageView1;
    ImageView imageView2;
    ImageView imageView3;
    ImageView imageView4;
    ImageView imageView5;
    ImageView imageView6;
    ImageView imageView7;
    ImageView imageView8;
    ImageView imageView9;
    TextView textView;


    public void stop() {
        for (int i = 1; i <= 9; i++) {
            String idN = "button" + i;
            int id = getResources().getIdentifier(idN, "id", getPackageName());
            Button button = findViewById(id);
            button.setEnabled(false);
        }
    }
    public void click(View view){
        animate(view.getTag().toString());
        view.setEnabled(false);
        if(colorCheck){
            red = red + view.getTag().toString();
            colorCheck = false;
        }else{
            yellow = yellow + view.getTag().toString();
            colorCheck = true;
        }
        if(winCheck(red)){
            Log.i("check","Red Wins");
            textView.setText("Red Wins");
            stop();
        }else if(winCheck(yellow)){
            Log.i("check","Yellow Wins");
            textView.setText("Yellow Wins");
            stop();
        }
        else {
            Log.i("check", "clciked: " + view.getTag().toString() + " Red " + red + view);
        }
    }
    public void animate(String Tag){
        switch (Tag){
            case "0":
                if(colorCheck) {
                    imageView1.setImageResource(R.drawable.red);
                }else {
                    imageView1.setImageResource(R.drawable.yellow);
                }
                imageView1.animate().translationYBy(1500).setDuration(400);
                break;
            case "1":
                if(colorCheck) {
                    imageView2.setImageResource(R.drawable.red);
                }else {
                    imageView2.setImageResource(R.drawable.yellow);
                }
                imageView2.animate().translationYBy(1500).setDuration(400);
                break;
            case "2":
                if(colorCheck) {
                    imageView3.setImageResource(R.drawable.red);
                }else {
                    imageView3.setImageResource(R.drawable.yellow);
                }
                imageView3.animate().translationYBy(1500).setDuration(400);
                break;
            case "3":
                if(colorCheck) {
                    imageView4.setImageResource(R.drawable.red);
                }else {
                    imageView4.setImageResource(R.drawable.yellow);
                }
                imageView4.animate().translationYBy(1500).setDuration(400);
                break;
            case "4":
                if(colorCheck) {
                    imageView5.setImageResource(R.drawable.red);
                }else {
                    imageView5.setImageResource(R.drawable.yellow);
                }
                imageView5.animate().translationYBy(1500).setDuration(400);
                break;
            case "5":
                if(colorCheck) {
                    imageView6.setImageResource(R.drawable.red);
                }else {
                    imageView6.setImageResource(R.drawable.yellow);
                }
                imageView6.animate().translationYBy(1500).setDuration(400);
                break;
            case "6":
                if(colorCheck) {
                    imageView7.setImageResource(R.drawable.red);
                }else {
                    imageView7.setImageResource(R.drawable.yellow);
                }
                imageView7.animate().translationYBy(1500).setDuration(400);
                break;
            case "7":
                if(colorCheck) {
                    imageView8.setImageResource(R.drawable.red);
                }else {
                    imageView8.setImageResource(R.drawable.yellow);
                }
                imageView8.animate().translationYBy(1500).setDuration(400);
                break;
            case "8":
                if(colorCheck) {
                    imageView9.setImageResource(R.drawable.red);
                }else {
                    imageView9.setImageResource(R.drawable.yellow);
                }
                imageView9.animate().translationYBy(1500).setDuration(400);
                break;
            default:
                break;
        }
    }
    public void resetGame(View view){
          /*  imageView1.setY(-1500);
            imageView2.animate().translationYBy(-1500);
            imageView3.animate().translationYBy(-1500);
            imageView4.animate().translationYBy(-1500);
            imageView5.animate().translationYBy(-1500);
            imageView6.animate().translationYBy(-1500);
            imageView7.animate().translationYBy(-1500);
            imageView8.animate().translationYBy(-1500);
            imageView9.animate().translationYBy(-1500); */
          textView.setText("");
            red = "";
            yellow = "";
            for(int i=1;i<=9;i++) {
                String idN = "button"+i;
                String idI = "imageView"+i;
                //Log.i("name",idN);
                int id2 = getResources().getIdentifier(idI, "id", getPackageName());
                int id = getResources().getIdentifier(idN, "id", getPackageName());
                Button button = findViewById(id);
                button.setEnabled(true);
                ImageView imageView = findViewById(id2);
                if(imageView.getY()<0){

                }else{
                    Log.i("name",Float.toString(imageView.getY()));
                    imageView.animate().translationYBy(-1500);
                }
            }

    }
    public boolean winCheck(String check){
        if(check.contains("0")&&check.contains("1")&&check.contains("2")){
            return true;
        }else if (check.contains("3")&&check.contains("4")&&check.contains("5")){
            return true;
        }else if (check.contains("6")&&check.contains("7")&&check.contains("8")){
            return true;
        }else if (check.contains("0")&&check.contains("3")&&check.contains("6")){
            return true;
        }else if (check.contains("1")&&check.contains("4")&&check.contains("7")){
            return true;
        }else if (check.contains("2")&&check.contains("5")&&check.contains("8")){
            return true;
        }else if (check.contains("0")&&check.contains("4")&&check.contains("8")){
            return true;
        }else if (check.contains("2")&&check.contains("4")&&check.contains("6")){
            return true;
        }else {
            return false;
        }
    }

           // [ 0, 1, 2 ]
           // [ 3, 4, 5 ]
           // [ 6, 7, 8 ]
           // [ 0, 3, 6 ]
            //[ 1, 4, 7 ]
           // [ 2, 5, 8 ]
            //[ 0, 4, 8 ]
            //[ 2, 4, 6 ]
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView1 = findViewById(R.id.imageView1);
        imageView2 = findViewById(R.id.imageView2);
        imageView3 = findViewById(R.id.imageView3);
        imageView4 = findViewById(R.id.imageView4);
        imageView5 = findViewById(R.id.imageView5);
        imageView6 = findViewById(R.id.imageView6);
        imageView7 = findViewById(R.id.imageView7);
        imageView8 = findViewById(R.id.imageView8);
        imageView9 = findViewById(R.id.imageView9);
        textView = (TextView) findViewById(R.id.textView);

    }
}
