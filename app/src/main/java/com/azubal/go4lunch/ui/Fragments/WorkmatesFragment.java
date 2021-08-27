package com.azubal.go4lunch.ui.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toolbar;

import com.azubal.go4lunch.R;
import com.azubal.go4lunch.ui.Activities.MainActivity;

public class WorkmatesFragment extends Fragment {

    MainActivity mainActivity;

    public WorkmatesFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getMainActivity();
        mainActivity.setToolbarTitle(getString(R.string.toolbarTitleFragmentWorkmates));
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_workmates, container, false);

    }

    public void getMainActivity() {
        mainActivity = (MainActivity) getActivity();
    }
}