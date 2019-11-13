package com.alyndroid.architecturepatternstutorialshomework;

import android.app.Application;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProviders;
import com.alyndroid.architecturepatternstutorialshomework.databinding.ActivityMainBinding;
import com.alyndroid.architecturepatternstutorialshomework.ui.ViewModelData;

public class MainActivity extends AppCompatActivity {

    ViewModelData modelData;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this,R.layout.activity_main);

        modelData = ViewModelProviders.of(this).get(ViewModelData.class);

        binding.setViewModel(modelData);
        binding.setLifecycleOwner(this);



    }
}
