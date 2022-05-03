package com.lazycompany.conferencedemo.repositories;

import com.lazycompany.conferencedemo.models.Session;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionRepository extends JpaRepository<Session, Long> {

}
