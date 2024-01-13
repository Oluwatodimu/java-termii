package com.termii.spring.mapper.insights.response;

import com.termii.spring.dto.response.insights.HistoryResponse;
import com.termii.spring.dto.response.insights.HistoryResponseDto;
import com.termii.spring.dto.response.insights.HistoryResponseItem;

import java.util.List;

public class HistoryResponseMapper {

    public static HistoryResponse fromDto(HistoryResponseDto historyResponseDto) {

        List<HistoryResponseItem> historyResponseItems = historyResponseDto.getHistoryResponseItemDtos()
                .stream()
                .map(HistoryResponseItemMapper::fromDto)
                .toList();

        HistoryResponse historyResponse = new HistoryResponse();
        historyResponse.setData(historyResponseItems);
        return historyResponse;
    }
}
