package myspring.restEndpoints;

import myspring.testing.IntegrationTest;
import org.junit.Test;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MvcResult;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

public class TimeIT extends IntegrationTest {

    @Test
    public void rest_should_get_time() throws Exception {
        String body = restTemplate.getForObject("/time", String.class);

        assertThat(body).isNotNull().isNotEmpty();
    }

    @Test
    public void mvc_should_get_time() throws Exception {
        MvcResult result = mvc.perform(get("/time").accept(MediaType.TEXT_PLAIN))
                .andReturn();

        assertThat(result.getResponse().getContentAsString())
                .isNotNull()
                .isNotEmpty();
    }

}