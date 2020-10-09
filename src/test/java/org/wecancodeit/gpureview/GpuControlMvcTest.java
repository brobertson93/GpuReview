package org.wecancodeit.gpureview;


import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;


import java.util.Arrays;
import java.util.Collection;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(GpuReviewController.class)
public class GpuControlMvcTest {
    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private GpuReviewRepository gpuRepo;

    @Mock
    private Gpu gpuOne;

    @Mock
    private Gpu gpuTwo;

    @Test
    public void shouldBeOkForAllGpusInTheGpusTemplate() throws Exception{
        mockMvc.perform(get("/gpus")).andExpect(status().isOk()).andExpect(view().name("gpusTemplate"));
    }

   @Test
   public void shouldFindAllGpusInModel() throws Exception {
       Collection<Gpu> allGpusInModel = Arrays.asList(gpuOne,gpuTwo);
       when(gpuRepo.findAll()).thenReturn((allGpusInModel));
       mockMvc.perform(get("/gpus")).andExpect(model().attribute("gpusModel",allGpusInModel));
   }

    @Test
    public void shouldBeOkForOneGpuInTheGpuTemplate() throws Exception{
    Long gpuOneId = 1L;
    when(gpuRepo.findOne(gpuOneId)).thenReturn(gpuOne);
    mockMvc.perform(get("/gpu?id=1")).andExpect(model().attribute("gpuModel",gpuOne));
    }

    @Test
    public void shouldBeNotFoundForRequestNotInModel() throws Exception {
        Long gpuTwoId = 2L;
        when(gpuRepo.findOne(gpuTwoId)).thenReturn(gpuOne);
        mockMvc.perform(get("/course?id=3")).andExpect(status().isNotFound());
    }






}
