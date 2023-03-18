package com.example.quizappbasic_01.core;

import com.example.quizappbasic_01.R;
import com.example.quizappbasic_01.core.DTO.SubjectDTO;

import java.util.ArrayList;

public class DBConstants {
    public static final ArrayList<SubjectDTO> listSubject = new ArrayList<SubjectDTO>(){{
        add(new SubjectDTO("Hóa Học", R.drawable.chemistry));
        add(new SubjectDTO("Lịch Sử", R.drawable.history_book));
        add(new SubjectDTO("Địa Lý", R.drawable.geography));
        add(new SubjectDTO("Tiếng Anh", R.drawable.ic_example_foreground));
        add(new SubjectDTO("Văn Học", R.drawable.ic_example_foreground));
        add(new SubjectDTO("Vật Lý", R.drawable.physics));
    }};

}
