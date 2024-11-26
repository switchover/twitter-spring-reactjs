package com.gmail.merikbest2015.mapper;

import com.gmail.merikbest2015.commons.dto.HeaderResponse;
import com.gmail.merikbest2015.commons.mapper.BasicMapper;
import com.gmail.merikbest2015.dto.TagResponse;
import com.gmail.merikbest2015.commons.dto.response.tweet.TweetResponse;
import com.gmail.merikbest2015.model.Tag;
import com.gmail.merikbest2015.service.TagService;
import com.gmail.merikbest2015.commons.util.TestConstants;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpHeaders;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@SpringBootTest
@RunWith(MockitoJUnitRunner.class)
public class TagMapperTest {

    @InjectMocks
    private TagMapper tagMapper;

    @Mock
    private BasicMapper basicMapper;

    @Mock
    private TagService tagService;

    private final List<Tag> tags = List.of(new Tag(), new Tag());
    private final List<TagResponse> tagResponses = List.of(new TagResponse(), new TagResponse());

    @Test
    public void getTags() {
    }

    @Test
    public void getTrends() {
    }

    @Test
    public void getTweetsByTag() {
    }
}
