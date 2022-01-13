package com.example.colortype;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private AppCompatButton enfjButton, enfpButton, entjButton, entpButton, esfjButton, esfpButton, estjButton, estpButton, infjButton, infpButton, intjButton, intpButton, isfjButton, isfpButton, istjButton, istpButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        enfjButton = findViewById(R.id.enfj_button);
        enfpButton = findViewById(R.id.enfp_button);
        entjButton = findViewById(R.id.entj_button);
        entpButton = findViewById(R.id.entp_button);
        esfjButton = findViewById(R.id.esfj_button);
        esfpButton = findViewById(R.id.esfp_button);
        estjButton = findViewById(R.id.estj_button);
        estpButton = findViewById(R.id.estp_button);
        infjButton = findViewById(R.id.infj_button);
        infpButton = findViewById(R.id.infp_button);
        intjButton = findViewById(R.id.intj_button);
        intpButton = findViewById(R.id.intp_button);
        isfjButton = findViewById(R.id.isfj_button);
        isfpButton = findViewById(R.id.isfp_button);
        istjButton = findViewById(R.id.istj_button);
        istpButton = findViewById(R.id.istp_button);


        enfjButton.setOnClickListener(this);
        enfpButton.setOnClickListener(this);
        entjButton.setOnClickListener(this);
        entpButton.setOnClickListener(this);
        esfjButton.setOnClickListener(this);
        esfpButton.setOnClickListener(this);
        estjButton.setOnClickListener(this);
        estpButton.setOnClickListener(this);
        infjButton.setOnClickListener(this);
        infpButton.setOnClickListener(this);
        intjButton.setOnClickListener(this);
        intpButton.setOnClickListener(this);
        isfjButton.setOnClickListener(this);
        isfpButton.setOnClickListener(this);
        istjButton.setOnClickListener(this);
        istpButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.enfj_button:
                Intent enfjIntent = new Intent(MainActivity.this, EnfjActivity.class);
                startActivity(enfjIntent);
                break;
            case R.id.enfp_button:
                Intent enfpIntent = new Intent(MainActivity.this, EnfpActivity.class);
                startActivity(enfpIntent);
                break;
            case R.id.entj_button:
                Intent entjIntent = new Intent(MainActivity.this, EntjActivity.class);
                startActivity(entjIntent);
                break;
            case R.id.entp_button:
                Intent entpIntent = new Intent(MainActivity.this, EntpActivity.class);
                startActivity(entpIntent);
                break;
            case R.id.esfj_button:
                Intent esfjIntent = new Intent(MainActivity.this, EsfjActivity.class);
                startActivity(esfjIntent);
                break;
            case R.id.esfp_button:
                Intent esfpIntent = new Intent(MainActivity.this, EsfpActivity.class);
                startActivity(esfpIntent);
                break;
            case R.id.estj_button:
                Intent estjIntent = new Intent(MainActivity.this, EstjActivity.class);
                startActivity(estjIntent);
                break;
            case R.id.estp_button:
                Intent estpIntent = new Intent(MainActivity.this, EstpActivity.class);
                startActivity(estpIntent);
                break;
            case R.id.infj_button:
                Intent infjIntent = new Intent(MainActivity.this, InfjActivity.class);
                startActivity(infjIntent);
                break;
            case R.id.infp_button:
                Intent infpIntent = new Intent(MainActivity.this, InfpActivity.class);
                startActivity(infpIntent);
                break;
            case R.id.intj_button:
                Intent intjIntent = new Intent(MainActivity.this, IntjActivity.class);
                startActivity(intjIntent);
                break;
            case R.id.intp_button:
                Intent intpIntent = new Intent(MainActivity.this, IntpActivity.class);
                startActivity(intpIntent);
                break;
            case R.id.isfj_button:
                Intent isfjIntent = new Intent(MainActivity.this, IsfjActivity.class);
                startActivity(isfjIntent);
                break;
            case R.id.isfp_button:
                Intent isfpIntent = new Intent(MainActivity.this, IsfpActivity.class);
                startActivity(isfpIntent);
                break;
            case R.id.istj_button:
                Intent istjIntent = new Intent(MainActivity.this, IstjActivity.class);
                startActivity(istjIntent);
                break;
            case R.id.istp_button:
                Intent istpIntent = new Intent(MainActivity.this, IstpActivity.class);
                startActivity(istpIntent);
                break;
            default:
                Toast.makeText(MainActivity.this, "NO OPTION", Toast.LENGTH_SHORT).show();
        }
        }
    }