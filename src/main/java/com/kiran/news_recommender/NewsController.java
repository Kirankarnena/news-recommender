package com.kiran.news_recommender;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class NewsController {

    @GetMapping("/api/news/all")
    public NewsApiResponse getRealNews() {
        String apiKey = "ff2f8201108d444f97bad0b323b4a5c0";
        String url = "https://newsapi.org/v2/top-headlines?language=en&apiKey=" + apiKey;

        RestTemplate restTemplate = new RestTemplate();

        // Deserialize JSON directly into NewsApiResponse object
        NewsApiResponse newsResponse = restTemplate.getForObject(url, NewsApiResponse.class);
        return newsResponse;
    }
}
