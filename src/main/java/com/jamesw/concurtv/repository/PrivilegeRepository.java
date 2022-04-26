package com.jamesw.concurtv.repository;

import com.jamesw.concurtv.model.Privilege;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PrivilegeRepository extends JpaRepository<Privilege, Long> {
}
