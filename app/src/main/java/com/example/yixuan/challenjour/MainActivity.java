package com.example.yixuan.challenjour;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    //list of string fileNames for each individual graphic
    ArrayList<String> bodyGraphics, financeGraphics;


    //example code for button
    int index = 0;
    public void onButtonClick(View v){
        index++;
        index = index%2;
        Button button1 = (Button)v;
        System.out.println("nutz");
        if(index == 1)
            ((Button)v).setText("You too thanks");
        else
            ((Button)v).setText("Mac Trucks");

    }

    public void highLightGraphic(View v){
        //switch out graphic with one in an arraylist of graphics with highlighted body parts
        System.out.print("Not Implemented");
    }

    public void graphicOnClick(View v){
        //
        textButtonOnClick(v);
    }
    public void textButtonOnClick(View v){
        //implement expanding the info for the text clicked on and highlighting the

        //switch to graphic
        highLightGraphic(v);
        //show general data

    }
    public void alertsOnClick(View v){
        //what happens when user clicks on alerts button--> take to alert/quest/tip pages
        takeToPage(alert);
    }

    public void showMoreOnClick(View v){
        //what the show more info carrot will do when slid upward
        showMoreInformation(v);
    }
    public void showReleventData(View v){
        //given the graphic and the specific part of your finances and or fitness, display the relavent data
        System.out.print("Not Implemented");
    }

    public void takeToPage(View v){
        //Take user to different page
        //deallocate previous page memory??
        //create all information/displays and create the page, then show it
        System.out.print("Not Implemented");
    }

    public void showMoreInformation(View v){
        //Slide the additional information onto the screen
        System.out.print("Not Implemented");
    }

    public void generateAnalytics(){
        //Generate Analytics for all elements
        //Both basic and additional information
        //Have fun with this one Chase thanks *thumbs up*
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
