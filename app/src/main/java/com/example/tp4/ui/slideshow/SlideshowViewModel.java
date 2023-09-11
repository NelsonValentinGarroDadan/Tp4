package com.example.tp4.ui.slideshow;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Application;
import android.app.FragmentManager;
import android.content.Context;
import android.content.DialogInterface;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.tp4.R;
import com.example.tp4.ui.home.HomeFragment;

public class SlideshowViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public SlideshowViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is salir fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
    public void getDialogo(Activity activity) {
        new AlertDialog.Builder(activity)
                .setTitle("Warning")
                .setMessage("¿Estas seguro de salir de la aplicacion?")
                .setPositiveButton("Aceptar", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        activity.finish();
                    }
                })
                .setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                    }
                }).show();
    }
}