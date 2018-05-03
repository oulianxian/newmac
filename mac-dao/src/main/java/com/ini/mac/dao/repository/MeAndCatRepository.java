package com.ini.mac.dao.repository;

import com.ini.mac.dao.entity.MeAndCat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by ou on 2018/4/14/014.
 */
@Repository
public interface MeAndCatRepository extends JpaRepository<MeAndCat,Long> {
    /**
     * 根据我的态度指数获取猫的行为
     * @param attitude
     * @return
     */
    List<MeAndCat> findByAttitude(int attitude);
}
