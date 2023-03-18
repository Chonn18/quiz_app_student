package com.example.quizappbasic_01.core.DTO;

public class SubjectDTO {
    private String name;
    private int imageResoure;

    public SubjectDTO(String name, int imageResoure) {
        this.name = name;
        this.imageResoure = imageResoure;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImageResoure() {
        return imageResoure;
    }

    public void setImageResoure(int imageResoure) {
        this.imageResoure = imageResoure;
    }


}
