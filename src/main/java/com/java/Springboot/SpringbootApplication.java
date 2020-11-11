package com.java.Springboot;

import com.java.Springboot.domain.Meilenstein;
import com.java.Springboot.domain.Projektaufgabe;
import com.java.Springboot.repository.Meilensteinrepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class SpringbootApplication {

	public static void main(String[] args) {
		//SpringApplication.run(SpringbootApplication.class, args);
		ConfigurableApplicationContext configurableApplicationContext = SpringApplication.run(SpringbootApplication.class, args);
		Meilensteinrepository meilensteinrepository = configurableApplicationContext.getBean(Meilensteinrepository.class);

		Meilenstein meilenstein = new Meilenstein("Projektantrag abgeschlossen");
		Meilenstein meilenstein1 = new Meilenstein("Prototyp fertig");
		Projektaufgabe aufgabe = new Projektaufgabe("IntermetRadio", meilenstein);
		Projektaufgabe aufgabe1 = new Projektaufgabe("Learnviz", meilenstein);
		Projektaufgabe aufgabe2 = new Projektaufgabe("Projekt", meilenstein);
		List<Projektaufgabe> projektaufgaben = Arrays.asList(aufgabe, aufgabe1, aufgabe2);
		meilenstein.setProjektaufgaben(projektaufgaben);
		meilensteinrepository.save(meilenstein);
		meilensteinrepository.save(meilenstein1);


	}

}
