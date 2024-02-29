package com.api.crud.repositories;


import com.api.crud.models.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepository extends JpaRepository<UserModel, Long> {
    /*Long sirve para identificar el tipo de dato del ID de nuestra entidad*/

}
