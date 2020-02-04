package com.ifmojava.dplmprjct;

import com.ifmojava.dplmprjct.CMCClient.CMCListingLatest;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
import java.net.URISyntaxException;

@SpringBootApplication
public class SpringWebApplication {

	public static void main(String[] args) throws IOException, URISyntaxException {

		CMCListingLatest.ReturnBurse();

		SpringApplication.run(SpringWebApplication.class, args);

	}

}
