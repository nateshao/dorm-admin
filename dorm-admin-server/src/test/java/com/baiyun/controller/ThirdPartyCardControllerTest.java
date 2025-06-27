package com.baiyun.controller;

import com.baiyun.service.ThirdPartyCardService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

@WebMvcTest(ThirdPartyCardController.class)
public class ThirdPartyCardControllerTest {
    @Autowired
    private MockMvc mockMvc;
    @MockBean
    private ThirdPartyCardService cardService;

    @Test
    public void testSyncCard() throws Exception {
        Mockito.when(cardService.syncCardInfo("20230001")).thenReturn(true);
        mockMvc.perform(post("/api/thirdparty/card/sync")
                .param("studentNo", "20230001"))
                .andExpect(status().isOk())
                .andExpect(content().string("同步成功"));
    }

    @Test
    public void testCheckAccess() throws Exception {
        Mockito.when(cardService.checkAccess("CARD123", "DOOR1")).thenReturn(true);
        mockMvc.perform(get("/api/thirdparty/card/check")
                .param("cardNo", "CARD123")
                .param("doorId", "DOOR1"))
                .andExpect(status().isOk())
                .andExpect(content().string("允许通行"));
    }
} 