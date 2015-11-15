package demo;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;

import demo.model.Team;
import demo.repository.TeamRepository;

@SpringBootApplication
public class MicroservicebootApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(MicroservicebootApplication.class, args);
    }

	@Override
	protected SpringApplicationBuilder configure(
			SpringApplicationBuilder builder) {
			return builder.sources(MicroservicebootApplication.class);
	}
    @Autowired
    TeamRepository t;
    
	@PostConstruct
	public void init(){
		Team team = new Team("T1","L2");
		t.save(team);
	}
    
}

