package com.roommake.community.dto;

import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.web.multipart.MultipartFile;

@Getter
@Setter
@ToString
public class CommunityForm {

    private int categoryId;
    @NotEmpty(message = "제목은 필수 입력항목입니다.")
    private String title;
    @NotEmpty(message = "내용은 필수 입력항목입니다.")
    private String content;
    private MultipartFile imageFile;
}
