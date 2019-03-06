package com.example.usuario.carrosud;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class concesionarioUD extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_concesionario_ud);
        FragmentManager miManejador=getSupportFragmentManager();
        FragmentTransaction mitransacion=miManejador.beginTransaction();
        TIPO mifragmento=new TIPO();
        mitransacion.replace(R.id.contenedorMaster, mifragmento);
        mitransacion.commit();
    }

    public void sedan (View v){
        FragmentManager miManejador=getSupportFragmentManager();
        FragmentTransaction mitransacion=miManejador.beginTransaction();
      fragmentoMaster mifragmento=new fragmentoMaster();
        mitransacion.replace(R.id.contenedorMaster, mifragmento);
        mitransacion.addToBackStack("");
        mitransacion.commit();
    }
    public void picup (View v){
        FragmentManager miManejador=getSupportFragmentManager();
        FragmentTransaction mitransacion=miManejador.beginTransaction();
        fragmentoTipop mifragmento=new fragmentoTipop();
        mitransacion.replace(R.id.contenedorMaster, mifragmento);
        mitransacion.addToBackStack("");
        mitransacion.commit();
    }
    public void americano (View v){
        FragmentManager miManejador=getSupportFragmentManager();
        FragmentTransaction mitransacion=miManejador.beginTransaction();
        fragmentoAmericano mifragmento=new fragmentoAmericano();
        mitransacion.replace(R.id.contenedorMaster, mifragmento);
        mitransacion.addToBackStack("");
        mitransacion.commit();
    }
    public void asiatico (View v){
        FragmentManager miManejador=getSupportFragmentManager();
        FragmentTransaction mitransacion=miManejador.beginTransaction();
        fragmentoAsiatico mifragmento=new  fragmentoAsiatico();
        mitransacion.replace(R.id.contenedorMaster, mifragmento);
        mitransacion.addToBackStack("");
        mitransacion.commit();
    }
    public void europeo (View v){
        FragmentManager miManejador=getSupportFragmentManager();
        FragmentTransaction mitransacion=miManejador.beginTransaction();
        fragmentoEuropeo mifragmento=new fragmentoEuropeo();
        mitransacion.replace(R.id.contenedorMaster, mifragmento);
        mitransacion.addToBackStack("");
        mitransacion.commit();
    }
    public void europeop (View v){
        FragmentManager miManejador=getSupportFragmentManager();
        FragmentTransaction mitransacion=miManejador.beginTransaction();
        fragmentoEuropeop mifragmento=new fragmentoEuropeop();
        mitransacion.replace(R.id.contenedorMaster, mifragmento);
        mitransacion.addToBackStack("");
        mitransacion.commit();
    }
    public void asiaticop (View v){
        FragmentManager miManejador=getSupportFragmentManager();
        FragmentTransaction mitransacion=miManejador.beginTransaction();
        fragmentoAsiaticop mifragmento=new fragmentoAsiaticop();
        mitransacion.replace(R.id.contenedorMaster, mifragmento);
        mitransacion.addToBackStack("");
        mitransacion.commit();
    }
    public void americanop (View v){
        FragmentManager miManejador=getSupportFragmentManager();
        FragmentTransaction mitransacion=miManejador.beginTransaction();
        fragmentoAmericanop mifragmento=new fragmentoAmericanop();
        mitransacion.replace(R.id.contenedorMaster, mifragmento);
        mitransacion.addToBackStack("");
        mitransacion.commit();
    }
    public void forp (View v){
        FragmentManager miManejador=getSupportFragmentManager();
        FragmentTransaction mitransacion=miManejador.beginTransaction();
        fordP mifragmento=new fordP();
        mitransacion.replace(R.id.contenedorMaster, mifragmento);
        mitransacion.addToBackStack("");
        mitransacion.commit();
    }
    public void chevrolep (View v){
        FragmentManager miManejador=getSupportFragmentManager();
        FragmentTransaction mitransacion=miManejador.beginTransaction();
        chevroletp mifragmento=new chevroletp();
        mitransacion.replace(R.id.contenedorMaster, mifragmento);
        mitransacion.addToBackStack("");
        mitransacion.commit();
    }
    public void dodgep (View v){
        FragmentManager miManejador=getSupportFragmentManager();
        FragmentTransaction mitransacion=miManejador.beginTransaction();
        dodge mifragmento=new dodge();
        mitransacion.replace(R.id.contenedorMaster, mifragmento);
        mitransacion.addToBackStack("");
        mitransacion.commit();
    }
    public void toyotap (View v){
        FragmentManager miManejador=getSupportFragmentManager();
        FragmentTransaction mitransacion=miManejador.beginTransaction();
       toyotap mifragmento=new toyotap();
        mitransacion.replace(R.id.contenedorMaster, mifragmento);
        mitransacion.addToBackStack("");
        mitransacion.commit();
    }
    public void nissanp (View v){
        FragmentManager miManejador=getSupportFragmentManager();
        FragmentTransaction mitransacion=miManejador.beginTransaction();
        nissanp mifragmento=new nissanp();
        mitransacion.replace(R.id.contenedorMaster, mifragmento);
        mitransacion.addToBackStack("");
        mitransacion.commit();
    }

    public void suzukyp (View v){
        FragmentManager miManejador=getSupportFragmentManager();
        FragmentTransaction mitransacion=miManejador.beginTransaction();
        Susukyp mifragmento=new Susukyp();
        mitransacion.replace(R.id.contenedorMaster, mifragmento);
        mitransacion.addToBackStack("");
        mitransacion.commit();
    }
    public void mercedezp (View v){
        FragmentManager miManejador=getSupportFragmentManager();
        FragmentTransaction mitransacion=miManejador.beginTransaction();
        mercedezp mifragmento=new mercedezp();
        mitransacion.replace(R.id.contenedorMaster, mifragmento);
        mitransacion.addToBackStack("");
        mitransacion.commit();
    }

    public void volkswagenp (View v){
        FragmentManager miManejador=getSupportFragmentManager();
        FragmentTransaction mitransacion=miManejador.beginTransaction();
        volkswagenp mifragmento=new volkswagenp();
        mitransacion.replace(R.id.contenedorMaster, mifragmento);
        mitransacion.addToBackStack("");
        mitransacion.commit();
    }
    public void fiatp (View v){
        FragmentManager miManejador=getSupportFragmentManager();
        FragmentTransaction mitransacion=miManejador.beginTransaction();
        fiatp mifragmento=new fiatp();
        mitransacion.replace(R.id.contenedorMaster, mifragmento);
        mitransacion.addToBackStack("");
        mitransacion.commit();
    }
    public void chevrolets (View v){
        FragmentManager miManejador=getSupportFragmentManager();
        FragmentTransaction mitransacion=miManejador.beginTransaction();
        chevroletsedan mifragmento=new chevroletsedan();
        mitransacion.replace(R.id.contenedorMaster, mifragmento);
        mitransacion.addToBackStack("");
        mitransacion.commit();
    }
    public void forts (View v){
        FragmentManager miManejador=getSupportFragmentManager();
        FragmentTransaction mitransacion=miManejador.beginTransaction();
       fords mifragmento=new fords();
        mitransacion.replace(R.id.contenedorMaster, mifragmento);
        mitransacion.addToBackStack("");
        mitransacion.commit();
    }

}
