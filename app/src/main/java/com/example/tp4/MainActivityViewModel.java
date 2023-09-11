package com.example.tp4;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;

import com.example.tp4.Models.Usuario;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class MainActivityViewModel extends AndroidViewModel {
    private Context context;
    private List<Usuario> usuarios;
    public MainActivityViewModel(@NonNull Application application) {
        super(application);
        context = application.getApplicationContext();
        usuarios = new ArrayList<>();
    }
    public void Login(String mail, String pssw){
        if(Objects.equals(mail, "") || Objects.equals(pssw, "")){
            Toast.makeText(context, "Debes ingresar un mail y una contraseña", Toast.LENGTH_LONG).show();
            return;
        }
        for(int i=0;i<usuarios.size();i++){
            Usuario user = usuarios.get(i);
            if(Objects.equals(user.getMail(), mail) && Objects.equals(user.getPasw(), pssw)){
                Intent intent = new Intent(context, NavegationActivity.class);
                intent.putExtra("Nombre", user.getNombre()+" "+user.getApellido());
                intent.putExtra("Mail",user.getMail());
                intent.addFlags(intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(intent);
                return;
            }
        }
        Toast.makeText(context, "Mail o Contraseña incorrecta", Toast.LENGTH_LONG).show();
    }
    public void cargarLista(){
        usuarios.add(new Usuario("Valentin","Garro","nelsonvgarro@sanluis.edu.ar","12345678"));

        usuarios.add(new Usuario("Nelson","Dadan","example@gmail.com","12345678"));    }
}
