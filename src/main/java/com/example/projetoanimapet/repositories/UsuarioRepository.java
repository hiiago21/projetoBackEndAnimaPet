package com.example.projetoanimapet.repositories;


import com.example.projetoanimapet.entities.usuario.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<User, Long> {

}
