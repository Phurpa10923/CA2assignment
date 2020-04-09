package com.example.cse225assignment;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class frag2 extends Fragment {


    TextView t1,t2,t3;





    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.fragment_frag2,container,false);

        t1=v.findViewById(R.id.frag2n1);
        t2=v.findViewById(R.id.frag2n2);
        t3=v.findViewById(R.id.frag2n3);
        Bundle b2=getArguments();
        if(b2!=null){
            String n1=b2.getString("num1");
            String n2=b2.getString("num2");
            int sum=Integer.parseInt(n1)+Integer.parseInt(n2);
            t1.append(n1);

            t2.append(""+n2);
            t3.append(""+sum);


        }


        return v;
    }




}
