package cn.rknight;


import cn.rknight.db.dao.StudentDAO;
import cn.rknight.health.HelloWorldHealthCheck;
import cn.rknight.resources.HelloWorldResource;
import cn.rknight.resources.StudentResource;
import io.dropwizard.Application;
import io.dropwizard.jdbi.DBIFactory;
import io.dropwizard.setup.Environment;
import org.skife.jdbi.v2.DBI;

public class DropWizardStudyApplication extends Application<DropWizardStudyConfiguration> {
    public static void main(String[] args) throws Exception {
        new DropWizardStudyApplication().run(args);
    }

    @Override
    public void run(DropWizardStudyConfiguration config, Environment environment) throws Exception {
        final DBIFactory factory = new DBIFactory();
        final DBI jdbi = factory.build(environment, config.getDataSourceFactory(), "mysql");
        final StudentDAO studentDAO = jdbi.onDemand(StudentDAO.class);
        environment.healthChecks().register("hello-world", new HelloWorldHealthCheck());
        environment.jersey().register(new HelloWorldResource());
        environment.jersey().register(new StudentResource(studentDAO));

    }
}
