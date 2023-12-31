package com.example.servicoplanodevoo.dominio.entities;

import lombok.AllArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;


@Entity
//@NoArgsConstructor
@AllArgsConstructor
@Table(name = "plano_voo")
public class PlanoDeVoo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int id;

    public float horarioPartida;
    public LocalDate data;
    public float altitude;
    public float velCruzeiro;

    public int id_rota;

    // @ManyToOne
    // @JoinColumn( name = "id_rota")
    // public Rota rota;

    public boolean isCanceled;

    public PlanoDeVoo() {

    }

    public PlanoDeVoo(float horarioPartida, LocalDate data, int altitude, float velCruzeiro, int id_rota) {
        this.horarioPartida = horarioPartida;
        this.data = data;
        this.altitude = altitude;
        this.velCruzeiro = velCruzeiro;
        this.id_rota = id_rota;
        this.isCanceled = false;
    }
}
