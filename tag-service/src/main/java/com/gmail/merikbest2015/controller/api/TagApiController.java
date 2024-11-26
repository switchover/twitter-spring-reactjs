package com.gmail.merikbest2015.controller.api;

import com.gmail.merikbest2015.service.TagService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/tags")
public class TagApiController {

    private final TagService tagService;

    @DeleteMapping("/delete")
    public void deleteTag(@RequestParam("tagId") Long tagId) {
        tagService.deleteTag(tagId);
    }
}
