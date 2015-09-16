package com.stocksncode.stockfacts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class StockFactsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        /* void is the dataType we expect to be returned, in this case no data is expected */
        super.onCreate(savedInstanceState);
        /* parameter passed through setContentView() is the one we have been working on the layout*/
        setContentView(R.layout.activity_stock_facts);

        /* DECLARE OUR VIEW VARIABLES AND ASSIGN VIEWS FROM LAYOUT FILE */
        // as findViewById does not return the same dataType, we must cast it to [TextView] dataType
        final TextView factLabel = (TextView) findViewById(R.id.factTextView);
        Button showFactButton = (Button) findViewById(R.id.showFactButton);

        View.OnClickListener listener = new OnClickListener(){

            @Override
            // trigered when detects a click, block will be executed
            public void OnClick(View view){

                String[] facts = {
                    "test 0 ",
                    "test 1 ",
                    "test 2 "
                };

                // button was clicked, update the fact label with new fact
                //String fact = "Ostriches can run faster than horses.";
                //String fact = ""; //empty string
                //randomly select a fact

                //update label will dynamic fact
                Random randomGenerator = new Random();
                int randomNumber = randomGenerator.nextInt(facts.length);
                //String fact = randomNumber + "";//
                /* CHANGE TO ARRAY DATATYPE
                if (randomNumber == 0) {
                    String fact = "test 0 ";
                } else if (randomNumber == 1) {
                    String fact = "test 1 ";
                } else{
                    String fact = "test 2 ";
                }
                */
                fact = facts[randomNumber];
                factLabel.setText(fact); //will ask TextView to be a final variable
            }
        };
        // listens for the button to be clicked
        showFactButton.setOnClickListener(listener);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        
        getMenuInflater().inflate(R.menu.menu_stock_facts, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
