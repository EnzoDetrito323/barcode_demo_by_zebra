package com.zebra.scannercontrol.app.fragments;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TableRow;
import android.widget.TextView;


import com.zebra.scannercontrol.app.R;
import com.zebra.scannercontrol.app.activities.ActiveScannerActivity;

import java.util.Objects;


public class AdvancedFragment extends Fragment {
    private View advancedFragmentView;
    boolean virtualTetherSupport;
    public static AdvancedFragment newInstance() {
        return new AdvancedFragment();
    }
    public AdvancedFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        advancedFragmentView  = inflater.inflate(R.layout.fragment_advanced, container, false);
        
  

        return advancedFragmentView;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }

    @Override
    public void onResume (){
        super.onResume();
    }

    @Override
    public void onDestroyView () {
        super.onDestroyView();
        super.onResume();
    }



}
