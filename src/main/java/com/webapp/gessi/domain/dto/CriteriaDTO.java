package com.webapp.gessi.domain.dto;


public class CriteriaDTO {

    private int id;
    private String name;
    private String text;
    private String type;

    public CriteriaDTO(int id, String name, String text, String type) {
        this.id = id;
        this.name = name;
        this.text = text;
        this.type = type;
    }

    public CriteriaDTO() {}

    public int getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getName() { return name; }

    public void setName(String name) {
        this.name = name;
    }
}
