package com.londonappbrewery.destini;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    private TextView mStoryTextView;
    private Button mAnswerButtonTop;
    private Button mAnswerButtonBottom;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        mStoryTextView = (TextView) findViewById(R.id.storyTextView);
        mAnswerButtonTop = (Button) findViewById(R.id.buttonTop);
        mAnswerButtonBottom = (Button) findViewById(R.id.buttonBottom);


        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        mAnswerButtonTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(mAnswerButtonTop.getText()==getString(R.string.T1_Ans1)){
                    mStoryTextView.setText(R.string.T3_Story);
                    mAnswerButtonTop.setText(R.string.T3_Ans1);
                    mAnswerButtonBottom.setText(R.string.T3_Ans2);
                }
                else if (mAnswerButtonTop.getText()==getString(R.string.T3_Ans1)){
                    mStoryTextView.setText(R.string.T6_End);
                    mAnswerButtonTop.setVisibility(View.GONE);
                    mAnswerButtonBottom.setVisibility(View.GONE);

                }
                else if (mAnswerButtonTop.getText()==getString(R.string.T2_Ans1)){
                    mStoryTextView.setText(R.string.T3_Story);
                    mAnswerButtonTop.setText(R.string.T3_Ans1);
                    mAnswerButtonBottom.setText(R.string.T3_Ans2);

                }

            }
        });




        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        mAnswerButtonBottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mAnswerButtonBottom.getText()==getString(R.string.T1_Ans2)){
                    mStoryTextView.setText(R.string.T2_Story);
                    mAnswerButtonTop.setText(R.string.T2_Ans1);
                    mAnswerButtonBottom.setText(R.string.T2_Ans2);
                }
                else if (mAnswerButtonBottom.getText()==getString(R.string.T2_Ans2)){
                    mStoryTextView.setText(R.string.T4_End);
                    mAnswerButtonTop.setVisibility(View.GONE);
                    mAnswerButtonBottom.setVisibility(View.GONE);


                }
                else if (mAnswerButtonBottom.getText()==getString(R.string.T3_Ans2)){
                    mStoryTextView.setText(R.string.T5_End);
                    mAnswerButtonTop.setVisibility(View.GONE);
                    mAnswerButtonBottom.setVisibility(View.GONE);


                }
            }
        });

    }
}
