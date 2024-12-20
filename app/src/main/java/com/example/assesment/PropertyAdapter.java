package com.example.assesment;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class PropertyAdapter extends RecyclerView.Adapter<PropertyAdapter.PropertyViewHolder> {

    private final List<JsonList> propertyList;
    private final Context context;
    private final FragmentManager fragmentManager;

    public PropertyAdapter(Context context, List<JsonList> propertyList, FragmentManager fragmentManager) {
        this.context = context;
        this.propertyList = propertyList;
        this.fragmentManager = fragmentManager;
    }

    @NonNull
    @Override
    public PropertyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_property, parent, false);
        return new PropertyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PropertyViewHolder holder, int position) {
        JsonList property = propertyList.get(position);
        holder.addressTextView.setText(property.getAddress());
        holder.suburbTextView.setText(property.getSuburb());
        holder.stateTextView.setText(property.getState());
        holder.postcodeTextView.setText(property.getPostcode());
        holder.priceTextView.setText(property.getPrice());

        holder.itemView.setOnClickListener(v -> {
            View fragmentContainer = ((MainActivity) context).findViewById(R.id.new_property_page);
            View recyclerView = ((MainActivity) context).findViewById(R.id.recyclerView);
            fragmentContainer.setVisibility(View.VISIBLE);
            recyclerView.setVisibility(View.GONE);
            New_Property_Page fragment = New_Property_Page.newInstance(property.getAddress(), property.getSuburb());
            FragmentTransaction transaction = fragmentManager.beginTransaction();
            transaction.replace(R.id.new_property_page, fragment); // Use the custom container ID
            transaction.addToBackStack(null);
            transaction.commit();
        });
    }

    @Override
    public int getItemCount() {
        return propertyList.size();
    }

    static class PropertyViewHolder extends RecyclerView.ViewHolder {
        TextView addressTextView;
        TextView suburbTextView;
        TextView stateTextView;
        TextView postcodeTextView;
        TextView priceTextView;

        PropertyViewHolder(View itemView) {
            super(itemView);
            addressTextView = itemView.findViewById(R.id.addressTextView);
            suburbTextView = itemView.findViewById(R.id.suburbTextView);
            stateTextView = itemView.findViewById(R.id.stateTextView);
            postcodeTextView = itemView.findViewById(R.id.postcodeTextView);
            priceTextView = itemView.findViewById(R.id.priceTextView);
        }
    }
}