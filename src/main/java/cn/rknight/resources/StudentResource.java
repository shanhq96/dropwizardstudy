package cn.rknight.resources;

import cn.rknight.db.dao.StudentDAO;
import cn.rknight.db.model.Student;
import cn.rknight.requests.student.StudentGetRep;
import cn.rknight.requests.student.StudentPostRep;
import lombok.extern.slf4j.Slf4j;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;


@Path("/student")
@Slf4j
public class StudentResource {
    private final StudentDAO studentDAO;

    public StudentResource(StudentDAO studentDAO) {
        this.studentDAO = studentDAO;
    }

    @GET
    @Path("/student")
    @Produces(MediaType.APPLICATION_JSON)
    public String findStudent(@BeanParam StudentGetRep studentGetRep) {
        System.out.println(studentGetRep);
        List<Student> studentList = studentDAO.findAll();
        studentList.forEach(System.out::println);
        log.info("findStudent -> size : {}", studentList.size());
        return "success";
    }

    @POST
    @Path("/student")
    @Produces(MediaType.APPLICATION_JSON)
    public String insertStudent(StudentPostRep studentPostRep) {
        System.out.println(studentPostRep);
        return "success";
    }

    @PUT
    @Path("/student")
    @Produces(MediaType.APPLICATION_JSON)
    public String updateStudent() {
        return "success";
    }


    @DELETE
    @Path("/student")
    @Produces(MediaType.TEXT_PLAIN)
    public String deleteStudent() {
        return "success";
    }

}
