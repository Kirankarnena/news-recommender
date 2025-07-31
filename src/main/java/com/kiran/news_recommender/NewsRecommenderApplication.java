//package com.kiran.news_recommender;
//
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//
//@SpringBootApplication
//public class NewsRecommenderApplication {
//
//	public static void main(String[] args) {
//		SpringApplication.run(NewsRecommenderApplication.class, args);
//	}
//
//}

package com.kiran.news_recommender;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class NewsRecommenderApplication {

	public static void main(String[] args) {
		SpringApplication.run(NewsRecommenderApplication.class, args);
	}

	@Bean
	public CommandLineRunner loadData(NewsRepository newsRepository) {
		return args -> {
			newsRepository.saveAll(List.of(
					new News(null, "Java 21 Released", "Java 21 brings new features...", "tech"),
					new News(null, "Sports Finals 2025", "The finals are coming soon...", "sports"),
					new News(null, "Stock Market Update", "Markets fluctuate due to...", "business")
			));
		};
	}
}
