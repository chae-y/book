package com.book.diary.web;

import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@RunWith(SpringRunner.class)//테스트를 진행 할 때 junit에 내장된 실행자 외에 다른 실행자를 실행시킵니다, 즉 스프링부트 테스트와 junit사이에 연결자 역할
@WebMvcTest(controllers = HelloController.class)
public class HelloControllerTest extends TestCase {

    @Autowired//스프링이 관리하는 빈을 주입받는다
    private MockMvc mvc; // 웹 api를 테스트할 때 사용

    @Test
    public void hello가_리턴된다() throws Exception {
        String hello = "hello";//

        mvc.perform(get("/hello"))//mockMvc를 통해 /hello로 get 요청을 보냄, 체이닝이 지원되어 여러검증을 이어서 할 수 있음
                .andExpect(status().isOk()) // mvc.perform의 결과를 검증, header의 status를 검증 200인지 검증하는거
                .andExpect(content().string(hello));//응답본문의 내용 검증 "hello"가 맞는지 검증
    }
}