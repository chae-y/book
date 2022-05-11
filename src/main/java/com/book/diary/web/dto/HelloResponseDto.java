package com.book.diary.web.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Getter
@RequiredArgsConstructor//선언된 final필드가 포함된 생성자를 생성해줌
public class HelloResponseDto {

    private final String name;
    private final int amount;

}
