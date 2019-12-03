package com.example.demo.dao;

import com.example.demo.entity.TblUserInf;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * @author liwenjie
 * @Description:
 * @date: Create in 2019/12/2 16:47
 * @Modified By:
 */
@Repository
public interface UserDao {

    @Select("select * from tbl_user_inf where id=#{id}")
    TblUserInf getById(String id );

}
