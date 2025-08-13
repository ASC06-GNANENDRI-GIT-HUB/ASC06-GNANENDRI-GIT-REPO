package com.demo.repository;
import com.demo.entity.LoginEntity

import org.springframework.data.jpa.repository.JpaRepository

interface LoginRepository : JpaRepository<LoginEntity?, String?>
