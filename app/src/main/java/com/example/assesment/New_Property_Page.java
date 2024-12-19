package com.example.assesment;

import android.os.Bundle;
import com.example.assesment.JsonList;
import androidx.fragment.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.Button;

import java.util.Arrays;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link New_Property_Page#newInstance} factory method to
 * create an instance of this fragment.
 */
public class New_Property_Page extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public New_Property_Page() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment New_Property_Page.
     */
    // TODO: Rename and change types and number of parameters
    public static New_Property_Page newInstance(String param1, String param2) {
        New_Property_Page fragment = new New_Property_Page();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_new__property__page, container, false);

        EditText edit_address = view.findViewById(R.id.edit_address);
        EditText edit_suburb = view.findViewById(R.id.edit_suburb);
        EditText edit_state = view.findViewById(R.id.edit_state);
        EditText edit_postcode = view.findViewById(R.id.edit_postcode);
        EditText edit_price = view.findViewById(R.id.edit_price);
        Button new_property = view.findViewById(R.id.new_property);


        new_property.setOnClickListener(v->{
            String address = edit_address.getText().toString();
            String suburb = edit_suburb.getText().toString();
            String state = edit_state.getText().toString();
            String postcode = edit_postcode.getText().toString();
            String price = edit_price.getText().toString();

            JsonList.addProperty(address, suburb, state, postcode, price);

            for (JsonList item : JsonList.getPropertyList()) {
                Log.d("NewProperty", "Address: " + item.getAddress());
                Log.d("NewProperty", "Suburb: " + item.getSuburb());
                Log.d("NewProperty", "State: " + item.getState());
                Log.d("NewProperty", "Postcode: " + item.getPostcode());
                Log.d("NewProperty", "Price: " + item.getPrice());
                Log.d("NewProperty", "-------------------");
            }
        });


        return view;
    }
}