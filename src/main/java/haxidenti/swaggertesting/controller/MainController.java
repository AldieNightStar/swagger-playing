package haxidenti.swaggertesting.controller;

import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/main")
public class MainController {

    @GetMapping
    @ApiOperation("Returns \"Hello!\"")
    public String get() {
        return "Hello!";
    }

    @PostMapping
    @ApiOperation("Returns PONG of your ResponseBody")
    @ApiResponses({ @ApiResponse(code = 200, message = "Good Response, sir! B]") })
    public String post(@ApiParam(value = "This is the text to return with PONG to", defaultValue = "Blah blah blah") @RequestBody String body) {
        return "PONG: " + body;
    }

}
