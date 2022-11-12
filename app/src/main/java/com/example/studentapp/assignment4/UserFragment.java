package com.example.studentapp.assignment4;

import android.app.Fragment;
import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.studentapp.R;

import java.util.ArrayList;

public class UserFragment extends Fragment {
    RecyclerView recycleView;
    ArrayList<portal> studentNameCourseArrayList;
    TextView test;
    public UserFragment() {
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
        View view= inflater.inflate(R.layout.fragment_teacher, container, false);
        recycleView=view.findViewById(R.id.studentNameCourse);
        String Email=getArguments().getString("Emai");
//        test=view.findViewById(R.id.test);
//        test.setText(Email);
        if(Email.equals(Constants.secondTeacherEmail)){
            studentNameCourseArrayList= initStudentPrameterListShakar();
        }
        else if(Email.equals(Constants.firstTeacherEmail)){
            studentNameCourseArrayList= initStudentPrameterListKashif();
        }
        else{
            studentNameCourseArrayList= initStudentPrameterListStudent();
        }
        InitRecycleView();
        return view;
    }

    private ArrayList<portal> initStudentPrameterListStudent() {
        ArrayList<portal> studentArrayList2=new ArrayList<>();
        portal s1=new portal(R.drawable.ic_subject,"Android","Computer Science");
        portal s2=new portal(R.drawable.ic_subject,"Web","Computer Science");
        portal s3=new portal(R.drawable.ic_subject,"Os","Computer Science");
        portal s4=new portal(R.drawable.ic_subject,"COAL","Computer Science");
        portal s5=new portal(R.drawable.ic_subject,"DLD","Computer Science");
        portal s6=new portal(R.drawable.ic_subject,"Vectorizing","Graphics");
        portal s7=new portal(R.drawable.ic_subject,"Painting","Graphics");
        portal s8=new portal(R.drawable.ic_subject,"Sketching","Graphics");
        portal s9=new portal(R.drawable.ic_subject,"infographing","Graphics");
        portal s10=new portal(R.drawable.ic_subject,"Crafting","Graphics");
        portal s11=new portal(R.drawable.ic_subject,"Cellology","Medical");
        portal s12=new portal(R.drawable.ic_subject,"Chemistry","Medical");
        portal s13=new portal(R.drawable.ic_subject,"Psychology","Medical");
        portal s14=new portal(R.drawable.ic_subject,"Anatomy","Medical");
        portal s15=new portal(R.drawable.ic_subject,"Biology","Medical");
        portal s16=new portal(R.drawable.ic_subject,"Cal","Math");
        portal s17=new portal(R.drawable.ic_subject,"Cal2","Math");
        portal s18=new portal(R.drawable.ic_subject,"Trignomoetry","Math");
        portal s19=new portal(R.drawable.ic_subject,"Algebra","Math");
        portal s20=new portal(R.drawable.ic_subject,"Analysis","Math");

        studentArrayList2.add(s1);
        studentArrayList2.add(s2);
        studentArrayList2.add(s3);
        studentArrayList2.add(s4);
        studentArrayList2.add(s5);
        studentArrayList2.add(s6);
        studentArrayList2.add(s7);
        studentArrayList2.add(s8);
        studentArrayList2.add(s9);
        studentArrayList2.add(s10);
        studentArrayList2.add(s11);
        studentArrayList2.add(s12);
        studentArrayList2.add(s13);
        studentArrayList2.add(s14);
        studentArrayList2.add(s15);
        studentArrayList2.add(s16);
        studentArrayList2.add(s17);
        studentArrayList2.add(s18);
        studentArrayList2.add(s19);
        studentArrayList2.add(s20);

        return studentArrayList2;
    }

    private ArrayList<portal> initStudentPrameterListKashif() {
        ArrayList<portal> studentArrayList2=new ArrayList<>();
        portal s1=new portal(R.drawable.ic_student,"Azka","Android");
        portal s2=new portal(R.drawable.ic_student,"Samra","EAD");
        portal s3=new portal(R.drawable.ic_student,"Tayyaba","SE");
        portal s4=new portal(R.drawable.ic_student,"Shakila","LA");
        portal s5=new portal(R.drawable.ic_student,"Noor","PS");
        portal s6=new portal(R.drawable.ic_student,"Ali","Web");
        portal s7=new portal(R.drawable.ic_student,"Akif","OS");
        portal s8=new portal(R.drawable.ic_student,"Arijit","LA");
        portal s9=new portal(R.drawable.ic_student,"Veer","BE");
        portal s10=new portal(R.drawable.ic_student,"Lee Min Hoo","DSA");
        portal s11=new portal(R.drawable.ic_student,"Sapna Pabhi","OOP");
        portal s12=new portal(R.drawable.ic_student,"Komal","PF");
        portal s13=new portal(R.drawable.ic_student,"Saleha","BW");
        portal s14=new portal(R.drawable.ic_student,"Farhan","TW");
        portal s15=new portal(R.drawable.ic_student,"Zain","Math");
        portal s16=new portal(R.drawable.ic_student,"Shakeel","Cal");
        portal s17=new portal(R.drawable.ic_student,"Atif","Cal2");
        portal s18=new portal(R.drawable.ic_student,"Asifa","Drawing");
        portal s19=new portal(R.drawable.ic_student,"Agha","Sketching");
        portal s20=new portal(R.drawable.ic_student,"Nawab","SE");

        studentArrayList2.add(s1);
        studentArrayList2.add(s2);
        studentArrayList2.add(s3);
        studentArrayList2.add(s4);
        studentArrayList2.add(s5);
        studentArrayList2.add(s6);
        studentArrayList2.add(s7);
        studentArrayList2.add(s8);
        studentArrayList2.add(s9);
        studentArrayList2.add(s10);
        studentArrayList2.add(s11);
        studentArrayList2.add(s12);
        studentArrayList2.add(s13);
        studentArrayList2.add(s14);
        studentArrayList2.add(s15);
        studentArrayList2.add(s16);
        studentArrayList2.add(s17);
        studentArrayList2.add(s18);
        studentArrayList2.add(s19);
        studentArrayList2.add(s20);

        return studentArrayList2;
    }

    private ArrayList<portal> initStudentPrameterListShakar() {
        ArrayList<portal> studentArrayList2=new ArrayList<>();
        portal s1=new portal(R.drawable.ic_student,"Farhan","OS");
        portal s2=new portal(R.drawable.ic_student,"Ali","MC");
        portal s3=new portal(R.drawable.ic_student,"Kalsoom","CS");
        portal s4=new portal(R.drawable.ic_student,"Aisha","SE");
        portal s5=new portal(R.drawable.ic_student,"Noreen","OOP");
        portal s6=new portal(R.drawable.ic_student,"Bushra","DSA");
        portal s7=new portal(R.drawable.ic_student,"Riffat","OOP");
        portal s8=new portal(R.drawable.ic_student,"Sardar","CAL1");
        portal s9=new portal(R.drawable.ic_student,"Sajjal","Cal2");
        portal s10=new portal(R.drawable.ic_student,"Neha Kakker","Algo");
        portal s11=new portal(R.drawable.ic_student,"Madhuri","DSA");
        portal s12=new portal(R.drawable.ic_student,"Hadiqa","AI");
        portal s13=new portal(R.drawable.ic_student,"Saima","ML");
        portal s14=new portal(R.drawable.ic_student,"Noor","CV");
        portal s15=new portal(R.drawable.ic_student,"Zainab","SE");
        portal s16=new portal(R.drawable.ic_student,"Bia","Painting");
        portal s17=new portal(R.drawable.ic_student,"Zia","Graphics");
        portal s18=new portal(R.drawable.ic_student,"Asif","Layout");
        portal s19=new portal(R.drawable.ic_student,"Asghar","Painting");
        portal s20=new portal(R.drawable.ic_student,"Aisha","SE");

        studentArrayList2.add(s1);
        studentArrayList2.add(s2);
        studentArrayList2.add(s3);
        studentArrayList2.add(s4);
        studentArrayList2.add(s5);
        studentArrayList2.add(s6);
        studentArrayList2.add(s7);
        studentArrayList2.add(s8);
        studentArrayList2.add(s9);
        studentArrayList2.add(s10);
        studentArrayList2.add(s11);
        studentArrayList2.add(s12);
        studentArrayList2.add(s13);
        studentArrayList2.add(s14);
        studentArrayList2.add(s15);
        studentArrayList2.add(s16);
        studentArrayList2.add(s17);
        studentArrayList2.add(s18);
        studentArrayList2.add(s19);
        studentArrayList2.add(s20);

        return studentArrayList2;
    }
    public void InitRecycleView(){
        FragmentRecyclerAdapter fra=new FragmentRecyclerAdapter();
        recycleView.setAdapter(fra);
        recycleView.setLayoutManager(new LinearLayoutManager(getActivity()));

        //recycleView.setLayoutManager(new GridLayoutManager(this,3));

        fra.setData(studentNameCourseArrayList);

    }
}