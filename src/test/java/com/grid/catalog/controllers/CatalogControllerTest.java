package com.grid.catalog.controllers;

import com.grid.catalog.models.Article;
import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;
import java.util.List;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@DirtiesContext
@SpringBootTest
@AutoConfigureMockMvc
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class CatalogControllerTest {

    private final MockMvc mockMvc;

    @Test
    @DisplayName(" Should get article ")
    public void getArticleByUniqueIdTest() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/catalog/get/uniqueId/b6c0b6bea69c722939585baeac73c13d"))
               .andExpect(status().isOk());
    }

    @Test
    @DisplayName(" Should get articles ")
    public void getProductBySkuTest() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/catalog/get/sku/pp5006380337"))
               .andExpect(status().isOk());
    }

}
