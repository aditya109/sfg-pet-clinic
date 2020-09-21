package io.github.aditya109.sfgpetclinic.services;

import io.github.aditya109.sfgpetclinic.model.Vet;

import java.util.Set;

public interface VetService {
    Vet findById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();
}
