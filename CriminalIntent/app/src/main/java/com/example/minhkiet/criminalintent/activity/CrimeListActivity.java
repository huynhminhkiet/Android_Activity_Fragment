package com.example.minhkiet.criminalintent.activity;

import android.support.v4.app.Fragment;

import com.example.minhkiet.criminalintent.fragment.CrimeListFragment;

public class CrimeListActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
