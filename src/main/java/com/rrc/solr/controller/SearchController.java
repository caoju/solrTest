package com.rrc.solr.controller;

import com.rrc.solr.pojo.SearchResult;
import com.rrc.solr.service.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SearchController {
    @Autowired
    private SearchService searchService;

    @RequestMapping("/search")
    @ResponseBody
    public SearchResult search(){
        SearchResult searchResult = null;
        try {
            searchResult = searchService.search("*", 1, 60);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return searchResult;
    }

    @RequestMapping("/a")
    public String a(){
        return "a";
    }

}
