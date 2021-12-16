package com.simplemakeupapp.simplemakeup;

import com.simplemakeupapp.simplemakeup.entity.Makeup;
import com.simplemakeupapp.simplemakeup.entity.Stores;
import com.simplemakeupapp.simplemakeup.repository.StoresRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class SimpleMakeupApplication implements CommandLineRunner {

	public static void main(String[] args) {

		SpringApplication.run(SimpleMakeupApplication.class, args);
	}

	@Autowired
	private StoresRepo storesRepo;

	@Override
	public void run(String... args) throws Exception {

		Stores stores = new Stores("Target");

		Makeup makeup1 = new Makeup("L'Oreal Paris", "Lash Paradise Mascara Waterproof", "Black", "");
		Makeup makeup2 = new Makeup("Maybelline", "Push Up Falsies Mascara Waterprro", "Black", "");

		stores.getMakeup().add(makeup1);
		stores.getMakeup().add(makeup2);

		this.storesRepo.save(stores);
	}
}
