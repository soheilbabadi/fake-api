package ir.smartpath.fake_api.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.ZoneId;

@RestController
@RequestMapping("/api/v1/fake")
@Slf4j
public class FakeController {

    @GetMapping
    public ResponseEntity<String> hello() {

        String response="This is a fake api running on port 7000 on " + LocalDateTime.now(ZoneId.of("UTC"));
        log.info(response);
        return ResponseEntity.ok(response);
    }
}
