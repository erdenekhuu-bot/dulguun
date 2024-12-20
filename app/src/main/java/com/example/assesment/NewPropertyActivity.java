package com.example.assesment;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class NewPropertyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.new_property);

        TextView addressTextView = findViewById(R.id.address);
        EditText editAddress = findViewById(R.id.edit_address);
        TextView suburbTextView = findViewById(R.id.suburb);
        EditText editSuburb = findViewById(R.id.edit_suburb);
        TextView stateTextView = findViewById(R.id.state);
        EditText editState = findViewById(R.id.edit_state);
        TextView postcodeTextView = findViewById(R.id.postcode);
        EditText editPostcode = findViewById(R.id.edit_postcode);
        TextView priceTextView = findViewById(R.id.price);
        EditText editPrice = findViewById(R.id.edit_price);

        String address = getIntent().getStringExtra("address");
        String suburb = getIntent().getStringExtra("suburb");
        String state = getIntent().getStringExtra("state");
        String postcode = getIntent().getStringExtra("postcode");
        String price = getIntent().getStringExtra("price");

        addressTextView.setText(address);
        editAddress.setText(address);
        suburbTextView.setText(suburb);
        editSuburb.setText(suburb);
        stateTextView.setText(state);
        editState.setText(state);
        postcodeTextView.setText(postcode);
        editPostcode.setText(postcode);
        priceTextView.setText(price);
        editPrice.setText(price);
    }
}