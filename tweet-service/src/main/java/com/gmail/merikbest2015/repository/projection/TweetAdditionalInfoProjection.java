package com.gmail.merikbest2015.repository.projection;

import com.gmail.merikbest2015.dto.TweetAdditionalInfoUserResponse;
import com.gmail.merikbest2015.enums.ReplyType;
import org.springframework.beans.factory.annotation.Value;

public interface TweetAdditionalInfoProjection {
    String getText();
    ReplyType getReplyType();
    Long getAddressedTweetId();
    boolean isDeleted();
    Long getAuthorId();

    @Value("#{@tweetServiceImpl.getTweetAdditionalInfoUser(target.authorId)}")
    TweetAdditionalInfoUserResponse getUser();
}
