package com.termii.spring.dto.response.insights;

import java.util.List;

public class HistoryResponseDto {

    private List<HistoryResponseItemDto> historyResponseItemDtos;

    public List<HistoryResponseItemDto> getHistoryResponseItemDtos() {
        return historyResponseItemDtos;
    }

    public void setHistoryResponseItemDtos(List<HistoryResponseItemDto> historyResponseItemDtos) {
        this.historyResponseItemDtos = historyResponseItemDtos;
    }
}
