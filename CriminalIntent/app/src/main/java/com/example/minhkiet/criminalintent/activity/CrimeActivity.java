package com.example.minhkiet.criminalintent.activity;

import android.support.v4.app.Fragment;
import com.example.minhkiet.criminalintent.fragment.CrimeFragment;

public class CrimeActivity extends SingleFragmentActivity  {

    @Override
    protected Fragment createFragment() {
        return new CrimeFragment();
    }
}
