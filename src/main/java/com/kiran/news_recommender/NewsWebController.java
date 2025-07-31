package com.kiran.news_recommender;

import com.kiran.news_recommender.NewsApiResponse;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

@Controller
public class NewsWebController {

    @GetMapping("/news")  // When user visits http://localhost:8080/news
    public String showNewsPage(Model model) {
        String apiKey = "ff2f8201108d444f97bad0b323b4a5c0";
        String url = "https://newsapi.org/v2/top-headlines?language=en&apiKey=" + apiKey;

        RestTemplate restTemplate = new RestTemplate();
        // Fetch news data from the API and convert into Java object
        NewsApiResponse response = restTemplate.getForObject(url, NewsApiResponse.class);

        // Add the list of news articles to the model with the name "articles"
        model.addAttribute("articles", response.getArticles());

        // Return the name of the Thymeleaf template (news.html) to render the page
        return "news";
    }
}
