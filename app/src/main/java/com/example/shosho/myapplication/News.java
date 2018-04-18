package com.example.shosho.myapplication;

/**
 * Created by shosho on 2/9/2018.
 */

public class News {
    private String my_Title;
    private String my_Type;
    private String my_Date;
    private String my_Section;
    private String my_Url;
    private String[] firstname;

    public News(String title, String type, String date, String section, String url, String[] author) {
        this.my_Title = title;
        this.my_Type = type;
        this.my_Date = date;
        this.my_Section = section;
        this.my_Url = url;
        this.firstname = author;

    }

    public String getMy_Title() {
        return my_Title;
    }

    public String getMy_Type() {
        return my_Type;
    }

    public String getMy_Date() {
        return my_Date;
    }

    public String getMy_Section() {
        return my_Section;
    }

    public String getMy_Url() {
        return my_Url;
    }

    public String getFirstname() {
        String s = "";
        for (int i = 0; i < firstname.length; i++) {
            if (i == firstname.length - 1)
                s += firstname[i];
            else
                s += firstname[i] + ", ";
        }
        return s;
    }
}
