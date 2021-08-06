package com.zebra.scannercontrol.app.fragments;

import android.os.Bundle;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.core.content.ContextCompat;
import androidx.appcompat.widget.SwitchCompat;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.TableRow;
import android.widget.TextView;

import com.zebra.scannercontrol.app.R;
import com.zebra.scannercontrol.app.activities.ActiveScannerActivity;

import java.util.Objects;


public class SettingsFragment extends Fragment {

    private View settingsFragmentView;
    public static SettingsFragment newInstance() {
        return new SettingsFragment();
    }

    public SettingsFragment() {
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        settingsFragmentView  = inflater.inflate(R.layout.fragment_settings, container, false);
        SwitchCompat picklistMode = (SwitchCompat)settingsFragmentView.findViewById(R.id.switch_picklist_mode);
        final TextView txtPicklistMode = (TextView)settingsFragmentView.findViewById(R.id.txt_picklist_mode);
        if(picklistMode!=null) {
            int picklistInt = ((ActiveScannerActivity) Objects.requireNonNull(getActivity())).getPickListMode();
            boolean picklistBool = false;
            if (picklistInt == 2) {
                picklistBool = true;
            }
            Log.i("PickListMode", "Setting "+picklistBool +" int value = "+picklistInt);
            picklistMode.setChecked(picklistBool);
            if(picklistBool){
                txtPicklistMode.setTextColor(ContextCompat.getColor(((ActiveScannerActivity) getActivity()), R.color.font_color));
            }else{
                txtPicklistMode.setTextColor(ContextCompat.getColor(((ActiveScannerActivity) getActivity()), R.color.inactive_text));
            }
            picklistMode.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    int picklistInt = 0;
                    if(isChecked){
                        txtPicklistMode.setTextColor(ContextCompat.getColor(((ActiveScannerActivity) getActivity()), R.color.font_color));
                        picklistInt = 2;
                    }else{
                        txtPicklistMode.setTextColor(ContextCompat.getColor(((ActiveScannerActivity) getActivity()), R.color.inactive_text));
                    }
                    ((ActiveScannerActivity) getActivity()).setPickListMode(picklistInt);
                }
            });
        }

        return settingsFragmentView;
    }

    @Override
    public void onResume (){
        super.onResume();
    }

}
