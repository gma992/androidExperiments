package com.stocksncode.stockfacts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class StockFactsActivity extends AppCompatActivity {

    // if we rename the class it wll do it automatically too like this in the TAG
    public static final String TAG = StockFactsActivity.class.getSimpleName();

    private FactBook mFactBook = new FactBook();
    private ColorWheel mColorWheel = new ColorWheel();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        /* DEBUGGING 3: DDMS provides line by line debugging to check current state */
        /* toggle breakpoint*/
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stock_facts);
        
        final TextView factLabel = (TextView) findViewById(R.id.factTextView);
        Button showFactButton = (Button) findViewById(R.id.showFactButton);
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.relativeLayout);


        View.OnClickListener listener = new OnClickListener(){

            @Override
            public void OnClick(View view){
                
                String fact = mFactBook.getFact(); //takes from other class
                factLabel.setText(fact);

                int color = mColorWheel.getColor();
                relativeLayout.setBackgroundColor(color);

                showFactButton.setTextColor(color);

            }
        };
        showFactButton.setOnClickListener(listener);

        /* DEBUGGING 1: TOASTS */
        /*
        String message = "Yay! our activity was created";
        Toast welcomeToast = Toast.makeText(this, message, Toast.LENGTH_LONG);
        welcomeToast.show();
        */
        //one-liner way:
        Toast welcomeToast = Toast.makeText(this, "Yay! our activity was created", Toast.LENGTH_LONG).show());

        /* DEBUGGING 2: WRITE TO THE LOG */
        Log.d(TAG, "We're logging from the onCreate() method!");



    }
    //delete functions we dont use
    // each time we click will create new object, so we have to fix it as is inneficient


}
