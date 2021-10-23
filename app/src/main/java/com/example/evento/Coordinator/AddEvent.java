package com.example.evento.Coordinator;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.evento.R;
import com.google.android.material.textfield.TextInputEditText;

import butterknife.BindView;
import butterknife.ButterKnife;

public class AddEvent extends AppCompatActivity {


    @BindView(R.id.spinner)
    Spinner spinner;
    @BindView(R.id.free)
    Button free;
    @BindView(R.id.paid)
    Button paid;
    @BindView(R.id.login)
    Button login;
    @BindView(R.id.amounttxt)
    TextView amounttxt;
    @BindView(R.id.amountedit)
    TextInputEditText amountedit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_event);
        ButterKnife.bind(this);



        free.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                free.setBackground(getResources().getDrawable(R.drawable.btn_rounded_white,null));
                paid.setBackground(getResources().getDrawable(R.drawable.btn_rounded_gredient,null));
                free.setTextColor(getResources().getColor(R.color.black,null));
                paid.setTextColor(getResources().getColor(R.color.white,null));
                amounttxt.setVisibility(View.GONE);
                amountedit.setVisibility(View.GONE);
            }
        });

        paid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                free.setBackground(getResources().getDrawable(R.drawable.btn_rounded_gredient,null));
                paid.setBackground(getResources().getDrawable(R.drawable.btn_rounded_white,null));
                free.setTextColor(getResources().getColor(R.color.white,null));
                paid.setTextColor(getResources().getColor(R.color.black,null));
                amounttxt.setVisibility(View.VISIBLE);
                amountedit.setVisibility(View.VISIBLE);

            }
        });
    }


}
