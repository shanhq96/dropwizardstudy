package cn.rknight.db.dao;


import cn.rknight.db.mapper.StudentMapper;
import cn.rknight.db.model.Student;
import org.skife.jdbi.v2.sqlobject.BindBean;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.SqlUpdate;
import org.skife.jdbi.v2.sqlobject.customizers.Mapper;

import java.util.List;
import java.util.Optional;

public interface StudentDAO {
    @SqlQuery("select * from student")
    @Mapper(StudentMapper.class)
    List<Student> findAll();

    @SqlUpdate("insert into student(name,age,gender,create_time) values (:s.name,:s.age,:s.gender,now())")
    Integer insertStudent(@BindBean("s") Student student);
}
