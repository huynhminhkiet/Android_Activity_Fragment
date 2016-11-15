package com.example.minhkiet.criminalintent.fragment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.minhkiet.criminalintent.R;
import com.example.minhkiet.criminalintent.adapter.CrimeAdapter;
import com.example.minhkiet.criminalintent.model.Crime;
import com.example.minhkiet.criminalintent.model.CrimeLab;

import java.util.List;

public class CrimeListFragment extends Fragment {
    private RecyclerView rvCrimeList;
    private CrimeAdapter crimeAdapter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_crime_list, container, false);

        rvCrimeList = (RecyclerView) v.findViewById(R.id.rv_crime_list);
        rvCrimeList.setLayoutManager(new LinearLayoutManager(getActivity()));

        updateUI();

        return v;
    }

    private void updateUI() {
        CrimeLab  crimeLab = CrimeLab.get(getActivity());
        List<Crime> crimes = crimeLab.getCrimes();

        crimeAdapter = new CrimeAdapter(crimes);
        rvCrimeList.setAdapter(crimeAdapter);
    }

}
