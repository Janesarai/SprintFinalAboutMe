package com.example.sprintfinalaboutme;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.sprintfinalaboutme.databinding.ActivitySecondBinding;

public class SecondActivity extends AppCompatActivity {
    private ActivitySecondBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= ActivitySecondBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}