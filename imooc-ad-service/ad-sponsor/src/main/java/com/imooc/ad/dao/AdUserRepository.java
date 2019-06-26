package com.imooc.ad.dao;

import com.imooc.ad.entity.AdUser;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author zms
 * @data 2019/6/26
 */
public interface AdUserRepository extends JpaRepository<AdUser,Long> {
    AdUser findByUsername(String username);
}
