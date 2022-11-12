package com.example.studentapp.lab3;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.studentapp.R;


public class StudentFragment extends android.app.Fragment {
    TextView tv;
    Button click;
    public StudentFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_student, container, false);
        tv=view.findViewById(R.id.myfragment);
        click=view.findViewById(R.id.clickMe);

        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(), "PLease Enter Name ", Toast.LENGTH_SHORT).show();//can also use getActivity
            }
        });
        return view;
    }
}