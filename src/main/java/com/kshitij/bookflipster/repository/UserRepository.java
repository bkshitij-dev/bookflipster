package com.kshitij.bookflipster.repository;

import com.kshitij.bookflipster.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/*
 * @author Kshitij
 * @created 12-Jun-2025
 */

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
