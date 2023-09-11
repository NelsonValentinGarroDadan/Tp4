package com.example.tp4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.Manifest;

import com.example.tp4.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    private MainActivityViewModel vm;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(Build.VERSION.SDK_INT>= Build.VERSION_CODES.M
                && checkSelfPermission(Manifest.permission.CALL_PHONE)
                != PackageManager.PERMISSION_GRANTED){
            requestPermissions(new String[]{Manifest.permission.CALL_PHONE},1000);
        }
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        vm = ViewModelProvider.AndroidViewModelFactory.getInstance(getApplication()).create(MainActivityViewModel.class);
        vm.cargarLista();
        binding.bEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vm.Login(binding.etMail.getText().toString(),binding.etPassword.getText().toString());
            }
        });
    }
}