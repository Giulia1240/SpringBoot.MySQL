package com.workshopspringbootmysql.springbootmysql.repository;

import com.workshopspringbootmysql.springbootmysql.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
