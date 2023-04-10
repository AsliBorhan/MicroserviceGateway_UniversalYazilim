package com.universal_yazilim.bid.ysm.gateway_app.model.repository;

import com.universal_yazilim.bid.ysm.gateway_app.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer>
{
    //select * from users where username = ?;
    Optional<User> findByUserName(String userName);

}

