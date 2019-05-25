package br.com.digitalhouse.comunicaoentrefragments.Model;

import android.os.Parcel;
import android.os.Parcelable;

public class Pessoa implements Parcelable {
    private String Nome;
    private String Profissão;
    private int Idade;


    public Pessoa() {
    }

    public Pessoa(String Nome,String Profissão, int Idade){
        this.Nome = Nome;
        this.Profissão = Profissão;
        this.Idade = Idade;
    }

    protected Pessoa(Parcel in) {
        Nome = in.readString();
        Profissão = in.readString();
        Idade = in.readInt();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(Nome);
        dest.writeString(Profissão);
        dest.writeInt(Idade);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<Pessoa> CREATOR = new Creator<Pessoa>() {
        @Override
        public Pessoa createFromParcel(Parcel in) {
            return new Pessoa(in);
        }

        @Override
        public Pessoa[] newArray(int size) {
            return new Pessoa[size];
        }
    };

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getProfissão() {
        return Profissão;
    }

    public void setProfissão(String profissão) {
        Profissão = profissão;
    }

    public int getIdade() {
        return Idade;
    }

    public void setIdade(int idade) {
        Idade = idade;
    }
}
