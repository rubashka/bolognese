package com.example.bolognese.repository;

import com.example.bolognese.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
    // 기본 CRUD 메서드를 JpaRepository가 제공합니다.
    // 추가 쿼리가 필요하다면 메서드를 정의할 수 있습니다.
}
