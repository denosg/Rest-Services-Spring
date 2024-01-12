package com.costelas.restservices;

import com.costelas.restservices.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

interface UserRepository extends JpaRepository<User, Long> {

}
