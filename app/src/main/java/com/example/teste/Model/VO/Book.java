package com.example.teste.Model.VO;

public class Book {

    private String name;
    private String descricao;
    private String autor;
    private String url;
    private String url1;
    private String url2;
    private String url3;
    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUrl1() { return url1;}

    public void setUrl1(String url1) { this.url1 = url1;}

    public String getUrl2() { return url2;}

    public void setUrl2(String url2) { this.url2 = url2;}

    public String getUrl3() { return url3;}

    public void setUrl3(String url3) { this.url3 = url3;}
}
