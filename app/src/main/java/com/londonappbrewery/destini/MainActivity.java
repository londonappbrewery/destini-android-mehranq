package com.londonappbrewery.destini;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    TextView storyTextView;
    Button answerButtonTop;
    Button answerButtonBottom;
    int mStoryIndex = 1;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        storyTextView = (TextView) findViewById(R.id.storyTextView);
        answerButtonTop = (Button) findViewById(R.id.buttonTop);
        answerButtonBottom = (Button) findViewById(R.id.buttonBottom);


        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        answerButtonTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(answerButtonTop.getText()==getString(R.string.T1_Ans1)){
                    storyTextView.setText(R.string.T3_Story);
                    answerButtonTop.setText(R.string.T3_Ans1);
                    answerButtonBottom.setText(R.string.T3_Ans2);
                }
                else if (answerButtonTop.getText()==getString(R.string.T3_Ans1)){
                    storyTextView.setText(R.string.T6_End);
                    answerButtonTop.setVisibility(View.GONE);
                    answerButtonBottom.setVisibility(View.GONE);

                }
                else if (answerButtonTop.getText()==getString(R.string.T2_Ans1)){
                    storyTextView.setText(R.string.T3_Story);
                    answerButtonTop.setText(R.string.T3_Ans1);
                    answerButtonBottom.setText(R.string.T3_Ans2);

                }

            }
        });




        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        answerButtonBottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(answerButtonBottom.getText()==getString(R.string.T1_Ans2)){
                    storyTextView.setText(R.string.T2_Story);
                    answerButtonTop.setText(R.string.T2_Ans1);
                    answerButtonBottom.setText(R.string.T2_Ans2);
                }
                else if (answerButtonBottom.getText()==getString(R.string.T2_Ans2)){
                    storyTextView.setText(R.string.T4_End);
                    answerButtonTop.setVisibility(View.GONE);
                    answerButtonBottom.setVisibility(View.GONE);


                }
                else if (answerButtonBottom.getText()==getString(R.string.T3_Ans2)){
                    storyTextView.setText(R.string.T5_End);
                    answerButtonTop.setVisibility(View.GONE);
                    answerButtonBottom.setVisibility(View.GONE);


                }
            }
        });

    }
}
