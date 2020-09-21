package io.github.aditya109.sfgpetclinic.services;

import io.github.aditya109.sfgpetclinic.model.Pet;

import java.util.Set;

public interface PetService {
    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
