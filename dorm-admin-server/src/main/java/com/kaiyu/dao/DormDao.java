package com.kaiyu.dao;

import com.kaiyu.entity.Dorm;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author 邵桐杰
 * @date 2022/5/13
 */
@Repository
public interface DormDao {

    List<Dorm> getDormAll();

    List<Dorm> getDormByName(String dormName);

    int saveDorm(Dorm dorm);

    int editDorm(Dorm dorm);

    int deleteDorms(@Param("ids") List<Integer> ids);
}
