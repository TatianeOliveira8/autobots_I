package com.autobots.automanager.modelo;

import java.util.List;

import org.springframework.stereotype.Component;

import com.autobots.automanager.entidades.Telefone;

@Component
public class TelefoneSelecionador {
    public Telefone selecionar(List<Telefone> Telefones, long id) {
        Telefone selecionado = null;
        for (Telefone Telefone: Telefones) {
            if (Telefone.getId() == id) {
                selecionado = Telefone;
            }
        }
        return  selecionado;
    }
}