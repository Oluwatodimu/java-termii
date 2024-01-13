package com.termii.spring.mapper.insights.response;

import com.termii.spring.dto.response.insights.SearchResponse;
import com.termii.spring.dto.response.insights.SearchResponseDto;

public class SearchResponseMapper {

    public static SearchResponse fromDto(SearchResponseDto searchResponseDto) {
        SearchResponse response = new SearchResponse();
        response.setNumber(searchResponseDto.getNumber());
        response.setNetworkCode(searchResponseDto.getNetworkCode());
        response.setStatus(searchResponseDto.getStatus());
        response.setNetwork(searchResponseDto.getNetwork());
        return response;
    }
}
