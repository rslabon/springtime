package myspring.restEndpoints;

import myspring.testing.IntegrationTest;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TimeIT extends IntegrationTest {

    @Test
    public void should_get_time() throws Exception {
        String body = restTemplate.getForObject("/time", String.class);

        assertThat(body).isNotNull().isNotEmpty();
    }

}