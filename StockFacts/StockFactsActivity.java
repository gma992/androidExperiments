package com.stocksncode.stockfacts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class StockFactsActivity extends AppCompatActivity {

    private FactBook mFactBook = new FactBook();
    private ColorWheel mColorWheel = new ColorWheel();

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        /* void is the dataType we expect to be returned, in this case no data is expected */
        super.onCreate(savedInstanceState);
        /* parameter passed through setContentView() is the one we have been working on the layout*/
        setContentView(R.layout.activity_stock_facts);

        /* DECLARE OUR VIEW VARIABLES AND ASSIGN VIEWS FROM LAYOUT FILE */
        final TextView factLabel = (TextView) findViewById(R.id.factTextView);
        final Button showFactButton = (Button) findViewById(R.id.showNextButton);
        final Button plusOneButton = (Button) findViewById(R.id.plusOneButton);
        final RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.relativeLayout);

        /* WIP +1 BUTTON */
        View.OnClickListener plusOneListener = new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                System.out.println("+1");
            }
        };
        plusOneButton.setOnClickListener(plusOneListener);

        /* WORKING "SHOW NEXT FACT" BUTTON */
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                /* call to RANDOM FACTS */

                //String fact = mFactBook.getFact();
                //factLabel.setText(fact);

                /* call to ORDERED FACTS */
                String orderedFact = mFactBook.getNewOrderedFact();
                factLabel.setText(orderedFact);

                /* call to COLOR WHEEL */

                int color = mColorWheel.getColor();
                relativeLayout.setBackgroundColor(color);

                showFactButton.setTextColor(color);

                /* PLUSONEBUTTON FUNCTIONALITY */


            }
        };
        showFactButton.setOnClickListener(listener);


        /*
        String message = "Yay! our activity was created";
        Toast welcomeToast = Toast.makeText(this, message, Toast.LENGTH_LONG);
        welcomeToast.show();
        */
    }

    /*
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_stock_facts, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }*/
}
