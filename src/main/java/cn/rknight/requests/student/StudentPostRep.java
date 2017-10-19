package cn.rknight.requests.student;

import cn.rknight.db.model.Student;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentPostRep {
    Student student;
}
