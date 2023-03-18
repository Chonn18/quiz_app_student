package com.example.quizappbasic_01.monhoc;

import android.app.Activity;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import com.example.quizappbasic_01.R;
import com.example.quizappbasic_01.core.DBConstants;
import com.example.quizappbasic_01.core.DTO.SubjectDTO;


public class SubjectFragment extends Fragment {

    Activity context;
    GridView gvSubject;
    SubjectAdapter subjectAdapter;
    public SubjectFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        context = getActivity();
        View root = inflater.inflate(R.layout.fragment_subject, container, false);
        return root;

    }
    @SuppressWarnings({"ConstantConditions", "deprecation"})
    @Override

    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        initView();
    }

    private void initView() {
        gvSubject = context.findViewById(R.id.gv_subject);

        subjectAdapter = new SubjectAdapter(context, DBConstants.listSubject);
        gvSubject.setAdapter(subjectAdapter);
    }


}