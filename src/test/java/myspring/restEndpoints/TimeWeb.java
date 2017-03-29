package myspring.restEndpoints;

import myspring.testing.WebTest;
import org.junit.Test;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MvcResult;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

public class TimeWeb extends WebTest {

    @Test
    public void should_get_time() throws Exception {
        MvcResult result = mvc.perform(get("/time").accept(MediaType.TEXT_PLAIN))
                .andReturn();

        assertThat(result.getResponse().getContentAsString())
                .isNotNull()
                .isNotEmpty();
    }

}