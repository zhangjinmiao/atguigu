package com.atguigu.springboot.repository;

import com.atguigu.springboot.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

// 繼承JpaRepository來完成對數據庫的操作
public interface UserRepository extends JpaRepository<User, Integer> {
}
