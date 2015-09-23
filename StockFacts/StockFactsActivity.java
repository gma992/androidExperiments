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

                public String[] facts = {
                    "It is the definition  of the time period for the investment return and the predictability of the returns that often distinguish an investment from a speculation. ",
                    "Just to stay even, you investments have to produce a rate of return equal to inflation. ",
                    "There is no reason, only mass psychology. ",
                    "The most dangerous words in the investment business are 'This time it's different'.",
                    "The market eventually corrects any irrationality, in its own slow, inexorable fashion.",
                    "Anomalies are able to crop up, and often they attract unwary investors, but eventually true value is recognized by the market, and this is the main lesson investors must heed.",
                    "Dividend growth does not go on forever. Corporations and industries have life cycles similar to most living things.",
                    "A rational investor should be willing to pay a higher price for a share the longer the growth rate is expected to last.",
                    "There is always a risk",
                    "A rational investor should be willing to pay a higher price for a share the lower are interest rates.",
                    "There is always some combination of growth rate and growth period that will produce any specific price. Is intrinsically impossible to calculate the value of a share.",
                    "The mathematical precision of the firm-foundation value formulas is based on treacherous ground: forecasting the future.",
                    "Depending on what guesses you make, you can convice yourself to pay any price you want for a stock.",
                    "Stock prices are in a sense anchored to certain fundamentals, but the anchor is heavily influenced by mass psychology.",
                    "Stocks are bought and sold on expectations, not on facts.",
                    "No price is too high for a bull or too low for a bear.",
                    "Prices move in trends, and trends tend to continue until something happens to change the supply-demand balance.",
                    "Prices may adjust so quickly to new information as to make the whole process of technical analysis a futile exercise.",
                    "The stock market has no memory. The central propositions of charting accomplish nothing but increasing substantially the brokerage charges they pay",
                    "There are two times in a man's life when he should not speculate: when he can't and when he can.",
                    "It is simple common sense to say that a 34yo and a 64yo saving for retirement may prudently use different financial instruments to accomplish their goals.",
                    "Over long periods of time, common stocks have, on average, provided relatively generous total rates of return and exceeded by a substantial margin long-term corporate bonds.",
                    "Beating the market is not an exercise of superior clairvoyance. Risk has its reward and risk alone determines de degree to which returns will be above or below average.",
                    "Even a dart-throwing chimpanzee can select a portfolio that performs as well as one carefully selected by the experts.",
                    "We should not take for granted the reliability and accuracy of any judge, no matter how expert.",
                    "Technical strategies often make profits. The point is rather that a simple 'Buy and Hold' strategy typically makes as much or more money.",
                    "It's far better to buy a wonderful company at a fair price than a fair company at a wonderful price.",
                    "You don't need to be a rocket scientist. Investing is not a game where the guy with the 160 IQ beats the guy with 130 IQ.",
                    "When a great company gets into temporary trouble, buy them when they're on the operating table.",
                    "In the 20th century, EEUU endured two world wars and other expensive military conflicts, the Depression, a dozen of recessions, financial panics, oil shocks, a flu epidemic and the resignation of a president. Yet the Dow rose from 66 to 11,497.",
                    "If you aren't willing to own a stock for ten years, don't even think about owning it for ten minutes. ",
                    "Forever is a good holding period.",
                    "Try to buy stock in businesses that are so wonderful that an idiot can run them. Because sooner or later, one will.",
                    "For investors as a whole, returns decrease as motion increases. The more you trade, the more you underperform.",
                    "Price is what you pay, value is what you get. Whether we’re talking about socks or stocks, buy quality merchandise when it is marked down.",
                    "Time is the friend of the wonderful business, the enemy of the mediocre."
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
