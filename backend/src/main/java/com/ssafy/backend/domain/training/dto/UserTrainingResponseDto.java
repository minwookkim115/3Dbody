package com.ssafy.backend.domain.training.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.ssafy.backend.domain.training.entity.UserTraining;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Data
@Builder
public class UserTrainingResponseDto {

    @JsonProperty("user_id")
    private Long userId;

    @JsonProperty("training_id")
    private Long trainingId;

    private LocalDate date;

    @JsonProperty("is_finished")
    private boolean isFinished;

    @Builder.Default
    private List<SetDto> sets = new ArrayList<>();

    public static UserTrainingResponseDto toDto(UserTraining userTraining) {

        return UserTrainingResponseDto
                .builder()
                .userId(userTraining.getUser().getUserId())
                .trainingId(userTraining.getTraining().getTrainingId())
                .date(userTraining.getDate())
                .isFinished(userTraining.isFinished())
                .build();

    }

}