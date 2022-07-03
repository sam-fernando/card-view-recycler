package com.example.recycler2;

public class AminoAcidModel {

    String aminiAcidName;
    String aminoAcidAbreviation;
    String aminiAcidAbreviationSmall;
    int image;

    public AminoAcidModel(String aminiAcidName, String aminoAcidAbreviation,
                          String aminiAcidAbreviationSmall, int image) {
        this.aminiAcidName = aminiAcidName;
        this.aminoAcidAbreviation = aminoAcidAbreviation;
        this.aminiAcidAbreviationSmall = aminiAcidAbreviationSmall;
        this.image = image;
    }




    //getters


    public String getAminiAcidName() {
        return aminiAcidName;
    }

    public String getAminoAcidAbreviation() {
        return aminoAcidAbreviation;
    }

    public String getAminiAcidAbreviationSmall() {
        return aminiAcidAbreviationSmall;
    }

    public int getImage() {
        return image;
    }


}
