package com.example.kavya.justjava;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {
    int quantity=2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
       super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_main);
   }

    private String createordersummary(String name,int price,boolean addwhippedcream)
    { String priceMessage="Name: "+name;
        priceMessage+="\nAdd Whipped Cream?"+addwhippedcream;
       priceMessage=priceMessage+"\nQuantity:"+quantity;
        priceMessage=priceMessage+"\nTotal: $"+price;
        priceMessage=priceMessage+"\nThank You";
         return priceMessage;}

    /**
     * This method is called when the order button is clicked.
     */
    public void submitOrder(View view) {
       EditText namefield=(EditText)findViewById(R.id.name_field);
        String name=namefield.getText().toString();
        CheckBox whippedcreamcheckbox = (CheckBox) findViewById(R.id.whipped_cream_checkbox);
         boolean haswhippedcream= whippedcreamcheckbox.isChecked();
        CheckBox chocolatecheckbox = (CheckBox) findViewById(R.id.chocolate_checkbox);
        boolean haschocolate= chocolatecheckbox.isChecked();
        Log.v("Main Activity", "Has Whipped Cream" + haswhippedcream);
       int price=calculatePrice();

   //displayPrice(quantity * 5);
     //   Log.v("MainActivity", "The Price is" + price);
  String priceMessage=createordersummary(name,price,haswhippedcream);
   //       priceMessage=priceMessage+"\nThank You";
     //   displayMessage(priceMessage);
        displayMessage(priceMessage);

     //   Intent intent =new Intent(Intent.ACTION_SENDTO);
   //     intent.setdata(Uri.parsel("MAILTO:"));
     //   intent.putExtra(Intent.EXTRA_EMAIL, addresses);
     //   intent.putExtra(Intent.EXTRA_SUBJECT, "just javs order for"+name);
     //   if(intent.resolveActivity(getPackageManager())!=null){
     //       startActivity(intent);
        }


    public void increment(View view) {

        quantity=quantity+1;
        display(quantity);
    }
    public void decrement(View view) {

        quantity=quantity-1;
        display(quantity);
    }
//    public void submitOrder(View view) {
  //      String priceMessage="Free";
  //              displayMessage(priceMessage);
  //  }

    /**
     * This method displays the given quantity value on the screen.
     */


    private int calculatePrice() {
        int price = quantity * 5;
        return price;
    }
    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(
          R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }

    /**
     * This method displays the given price on the screen.
     */
    private void displayPrice(int number) {
        TextView priceTextView = (TextView) findViewById(R.id.order_summary_text_view);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }
    /**
     * This method displays the given text on the screen.
     */
    private void displayMessage(String message) {
       TextView ordersummaryTextView = (TextView) findViewById(R.id.order_summary_text_view);
    ordersummaryTextView.setText(message);
  }
} // package com.example.kavya.justjava;

   // import android.support.v7.app.AppCompatActivity;
   // import android.os.Bundle;
  //  import android.support.v7.app.AppCompatActivity;
   // import android.view.View;
    //import android.widget.TextView;
   //
   // import java.text.NumberFormat;



   // public class MainActivity extends AppCompatActivity {

     //   @Override
      //  protected void onCreate(Bundle savedInstanceState) {
        //    super.onCreate(savedInstanceState);
         //   setContentView(R.layout.activity_main);
        //}



   // public void submitOrder(View view)
   // { display(1);
   // }
   // private void display(int number)
   // {  TextView quantityTextView=(TextView) findViewById(
     //       R.id.quantity_text_view);
    //     quantityTextView.setText("" + number);
  //  }
    //   private void displayPrice(int number)
      // {  TextView priceTextView = (TextView)findViewById(R.id.price_text_view);
      // priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
       //}

//}
