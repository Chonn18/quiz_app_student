package com.example.quizappbasic_01.monhoc;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.quizappbasic_01.R;
import com.example.quizappbasic_01.core.DTO.SubjectDTO;

import java.util.ArrayList;

public class SubjectAdapter extends ArrayAdapter<SubjectDTO> {
    public SubjectAdapter(@NonNull Context context, @NonNull ArrayList<SubjectDTO> list) {
        super(context, 0, list);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if (convertView == null) {
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.item_subject, parent, false);
        }
        TextView tvSubject = convertView.findViewById(R.id.tv_subject);
        ImageView imvSubject = convertView.findViewById(R.id.img_subject);

        SubjectDTO item = getItem(position);
        tvSubject.setText(item.getName());
        imvSubject.setImageResource(item.getImageResoure());


        return
                convertView;
    }
}
