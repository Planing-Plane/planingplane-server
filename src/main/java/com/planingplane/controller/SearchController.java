package com.planingplane.controller;

import com.planingplane.service.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/search")
public class SearchController {
    @Autowired
    private SearchService searchService;

    @PostMapping("/")
    public ResponseEntity<?> getClubById() {
        searchService.search();
        return ResponseEntity.ok().build();
    }

}
