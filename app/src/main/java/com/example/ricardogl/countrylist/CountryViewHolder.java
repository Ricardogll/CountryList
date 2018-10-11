package com.example.ricardogl.countrylist;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

public class CountryViewHolder extends RecyclerView.ViewHolder{

    private TextView country_view;

    public CountryViewHolder(View itemView, final CountryListAdapter.OnClickListener listener) {
        super(itemView);
        country_view = itemView.findViewById(R.id.country_view);
        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int position = getAdapterPosition();
                if (listener!=null && RecyclerView.NO_POSITION != position) {
                    listener.onClick(position);
                }
            }
        });
    }

    public void bind (String country){
        country_view.setText(country);
    }
}
