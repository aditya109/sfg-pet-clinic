package io.github.aditya109.sfgpetclinic.services;

import io.github.aditya109.sfgpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {
    Owner findByLastName(String lastName);

}
