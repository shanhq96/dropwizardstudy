package cn.rknight.requests.student;

import cn.rknight.core.PageRequest;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@ToString
@EqualsAndHashCode(callSuper = false)
public class StudentGetRep extends PageRequest {
    StudentFilters filters;
}
