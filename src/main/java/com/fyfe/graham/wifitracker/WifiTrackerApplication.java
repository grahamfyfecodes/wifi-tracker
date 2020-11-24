package com.fyfe.graham.wifitracker;

import com.fyfe.graham.wifitracker.repository.model.WifiConnection;
import com.fyfe.graham.wifitracker.repository.WifiConnectionRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WifiTrackerApplication implements CommandLineRunner {

	private static final Logger LOGGER = LoggerFactory.getLogger(WifiTrackerApplication.class);

	@Autowired
	private WifiConnectionRepository wifiConRepo;

	public static void main(String[] args) {
		SpringApplication.run(WifiTrackerApplication.class, args);
	}

	@Override
	public void run(String... args) {
		LOGGER.info("Application started...");

		WifiConnection testConnectionA = new WifiConnection("wah");
		WifiConnection testConnectionB = new WifiConnection("cah");
		wifiConRepo.save(testConnectionA);
		wifiConRepo.save(testConnectionB);

		wifiConRepo.findAll().forEach(con -> LOGGER.info(con.toString()));
	}
}
