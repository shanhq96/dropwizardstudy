package cn.rknight.db.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;
import java.time.Instant;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Student {
    @NotNull
    private Integer id;
    @NotNull
    private String name;
    @NotNull
    private Integer age;
    @NotNull
    private Integer gender;
    @NotNull
    private LocalDateTime createTime;
}
