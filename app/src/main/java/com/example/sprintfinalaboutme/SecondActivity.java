package com.example.sprintfinalaboutme;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.example.sprintfinalaboutme.databinding.ActivitySecondBinding;

public class SecondActivity extends AppCompatActivity {
    private ActivitySecondBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= ActivitySecondBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.linkedin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent alinkedin = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.linkedin.com/in/gencina2/"));
                startActivity(alinkedin);
            }
        });

        binding.wasap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent aWasap = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.whatsapp.com/?lang=es"));
                startActivity(aWasap);
            }
        });

        binding.correo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent aCorreo = new Intent(Intent.ACTION_VIEW, Uri.parse("https://accounts.google.com/AccountChooser/signinchooser?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&flowName=GlifWebSignIn&flowEntry=AccountChooser"));
                startActivity(aCorreo);
            }
        });
    }
}