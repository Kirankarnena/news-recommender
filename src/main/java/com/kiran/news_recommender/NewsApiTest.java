package com.kiran.news_recommender;

import org.springframework.web.client.RestTemplate;

public class NewsApiTest {
    public static void main(String[] args) {
        String apiKey = "ff2f8201108d444f97bad0b323b4a5c0";

        // Changed URL to get more results
        String url = "https://newsapi.org/v2/top-headlines?language=en&apiKey=" + apiKey;

        RestTemplate restTemplate = new RestTemplate();
        String response = restTemplate.getForObject(url, String.class);

        System.out.println(response);
    }
}
