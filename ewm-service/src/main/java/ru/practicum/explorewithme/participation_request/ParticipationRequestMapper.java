package ru.practicum.explorewithme.participation_request;

import lombok.experimental.UtilityClass;

import java.util.List;
import java.util.stream.Collectors;

@UtilityClass
public class ParticipationRequestMapper {
    public static ParticipationRequestDto toDto(ParticipationRequest request) {
        return ParticipationRequestDto.builder()
                .id(request.getId())
                .created(request.getCreated())
                .event(request.getEvent().getId())
                .requester(request.getRequester().getId())
                .status(request.getStatus().toString())
                .build();
    }

    public static List<ParticipationRequestDto> toDtoList(List<ParticipationRequest> requests) {
        return requests.stream()
                .map(ParticipationRequestMapper::toDto)
                .collect(Collectors.toList());
    }
}
