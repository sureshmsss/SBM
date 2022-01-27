package ss.it.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
@ConfigurationProperties(prefix="emp")
public class Employee {
	@Value("${emp.name}")
	private String name;
	private String city;
	private int pin;
	private int a;
}
