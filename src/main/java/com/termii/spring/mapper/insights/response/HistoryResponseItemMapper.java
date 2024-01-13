package com.termii.spring.mapper.insights.response;

import com.termii.spring.dto.response.insights.HistoryResponseItem;
import com.termii.spring.dto.response.insights.HistoryResponseItemDto;

public class HistoryResponseItemMapper {

    public static HistoryResponseItem fromDto(HistoryResponseItemDto responseItemDto) {
        HistoryResponseItem responseItem = new HistoryResponseItem();
        responseItem.setAmount(responseItemDto.getAmount());
        responseItem.setReceiver(responseItemDto.getReceiver());
        responseItem.setCreatedAt(responseItemDto.getCreatedAt());
        responseItem.setMessageId(responseItemDto.getMessageId());
        responseItem.setMessage(responseItemDto.getMessage());
        responseItem.setReroute(responseItemDto.getReroute());
        responseItem.setNotifyUrl(responseItemDto.getNotifyUrl());
        responseItem.setSendBy(responseItemDto.getSendBy());
        responseItem.setMediaUrl(responseItemDto.getMediaUrl());
        responseItem.setNotifyId(responseItemDto.getNotifyId());
        responseItem.setSender(responseItemDto.getSender());
        responseItem.setSmsType(responseItemDto.getSmsType());
        responseItem.setStatus(responseItemDto.getStatus());
        return responseItem;
    }
}
