package com.company;

public class Pack {
    private int nuberOfPack;
    private String addres;
    private Status status;
    private String namePack;

    public Pack(String addres, String namePack ) {
        this.addres = addres;
        this.status = Status.Register;
        this.namePack = namePack;
    }

    public void setNuberOfPack(int nuberOfPack) {
        this.nuberOfPack = nuberOfPack;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public int getNuberOfPack() {
        return nuberOfPack;
    }

    public Status getStatus() {
        return status;
    }

    public String getAddres() {
        return addres;
    }

    public String getNamePack() {
        return namePack;
    }
}
