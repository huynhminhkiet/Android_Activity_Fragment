package com.example.minhkiet.criminalintent.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.minhkiet.criminalintent.R;
import com.example.minhkiet.criminalintent.model.Crime;

import java.util.List;

/**
 * Created by minhkiet on 14/11/2016.
 */

public class CrimeAdapter extends RecyclerView.Adapter<CrimeAdapter.CrimeHolder> {
    private List<Crime> crimes;

    public CrimeAdapter(List<Crime> crimes) {
        this.crimes = crimes;
    }

    @Override
    public CrimeHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_crime_list, parent,
                false);
        CrimeHolder viewHolder = new CrimeHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(CrimeHolder holder, int position) {
        Crime crime = crimes.get(position);
        holder.crimeTitle.setText(crime.getTitle());
    }

    @Override
    public int getItemCount() {
        return crimes.size();
    }

    public static class CrimeHolder extends RecyclerView.ViewHolder {
        public TextView crimeTitle;
        public CrimeHolder(View v)   {
            super(v);
            crimeTitle = (TextView) v.findViewById(R.id.tv_crime_title);

        }
    }
}
