package com.example.assesment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class PropertyAdapter extends RecyclerView.Adapter<PropertyAdapter.PropertyViewHolder> {

    private final List<JsonList> propertyList;

    public PropertyAdapter(MainActivity mainActivity, List<JsonList> propertyList) {
        this.propertyList = propertyList;
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
