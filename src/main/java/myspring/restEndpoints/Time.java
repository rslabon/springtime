package myspring.restEndpoints;

import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Time {

    private AppTime appTime;

    @Autowired
    public Time(AppTime appTime) {
        this.appTime = appTime;
    }

    @ApiOperation(
            tags = {"time"},
            value = "get current time from the server",
            notes = "time has format: DateTimeFormatter.ISO_INSTANT"
    )
    @RequestMapping(value = "/time", method = RequestMethod.GET)
    public String getTime() {
        return appTime.getTime().toString();
    }

    @ApiOperation(
            tags = {"time"},
            value = "get current zone from the server"
    )
    @RequestMapping(value = "/tz", method = RequestMethod.GET)
    public String getTimeZone() {
        return appTime.getTZ().toString();
    }
}
