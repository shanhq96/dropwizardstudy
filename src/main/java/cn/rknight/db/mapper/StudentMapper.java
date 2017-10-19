package cn.rknight.db.mapper;

import cn.rknight.db.model.Student;
import org.skife.jdbi.v2.StatementContext;
import org.skife.jdbi.v2.tweak.ResultSetMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.Instant;
import java.time.LocalDateTime;

public class StudentMapper implements ResultSetMapper<Student> {
    @Override
    public Student map(int i, ResultSet resultSet, StatementContext statementContext) throws SQLException {
        return Student.builder()
                .id(resultSet.getInt("id"))
                .name(resultSet.getString("name"))
                .age(resultSet.getInt("age"))
                .gender(resultSet.getInt("gender"))
                .createTime(resultSet.getObject("create_time", LocalDateTime.class))
                .build();
    }
}
