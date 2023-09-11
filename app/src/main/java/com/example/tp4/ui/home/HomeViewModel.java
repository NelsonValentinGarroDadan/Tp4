package com.example.tp4.ui.home;

import static androidx.core.content.ContextCompat.startActivity;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.widget.Toast;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.Objects;

public class HomeViewModel extends ViewModel {
    //private Context context;
    private final MutableLiveData<String> mText;
    //private MutableLiveData<String> mTelefono;
    public HomeViewModel(Application application) {
        //context = application.getApplicationContext();
        mText = new MutableLiveData<>();
        mText.setValue("This is llamar fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
    /*
    public LiveData<String> getMutabe(){
        if(mTelefono == null){
            mTelefono = new MutableLiveData<>();
        }
        return mTelefono;
    }
    public void EnviarTel(String tel){
        if(Objects.equals(tel, "")){
            Toast.makeText(context, "Debe ingresar un numero de telefono para hacer la llamada", Toast.LENGTH_LONG).show();
        }else {
            mTelefono.setValue(tel);
        }
    }
    public void Llamar(String num){
        Uri number = Uri.parse("tel:" + num);
        Intent dial = new Intent(Intent.ACTION_DIAL, number);
        context.startActivity(dial);
    }
    */

}