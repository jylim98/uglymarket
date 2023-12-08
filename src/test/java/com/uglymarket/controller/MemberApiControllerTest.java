package com.uglymarket.controller;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class MemberApiControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @DisplayName("회원 등록")
    @Test
    void saveMemberTest() throws Exception {
        mockMvc.perform(post("/member/api/create")
                        .contentType(MediaType.APPLICATION_FORM_URLENCODED)
                        .param("id", "testid1")
                        .param("password", "testpw1")
                        .param("name", "testname1")
                        .param("nickname", "testnickname1")
                        .param("phone", "testphone1")
                        .param("address", "testaddress1"))
                .andReturn();
    }

}