package com.example.studentapp.lab10;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.studentapp.R;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class APIActivity extends AppCompatActivity {

    Button api;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apiactivity);

        api= findViewById(R.id.apiButton);
        textView= findViewById(R.id.textView);
        api.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getAllUser();
            }
        });

    }
    private void getAllUser(){
        RetrofitClient retrofitClient= new RetrofitClient();
        Call<Users> userDetail= retrofitClient.getUserService().getUserDetail(1);
        Call<List<Users>> userCall= retrofitClient.getUserService().getAllUsers();
        userCall.enqueue(new Callback<List<Users>>() {
            @Override
            public void onResponse(Call<List<Users>> call, Response<List<Users>> response) {
                if(response!=null){
                    List<Users> dataList= response.body();
                    if(dataList != null && dataList.size()>0){
                        String name= dataList.get(3).getName();
                        textView.setText(name);
                    }
                }
            }
            @Override
            public void onFailure(Call<List<Users>> call, Throwable t) {

            }
        });
    }

}