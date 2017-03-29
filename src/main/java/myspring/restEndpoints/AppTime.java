package myspring.restEndpoints;

import org.springframework.stereotype.Service;

import java.time.Instant;
import java.time.ZoneId;

@Service
public class AppTime {
    public Instant getTime() {
        return Instant.now();
    }

    public ZoneId getTZ() {
        return ZoneId.systemDefault();
    }
}
