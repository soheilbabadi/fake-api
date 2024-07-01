package ir.smartpath.fake_api.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fake")
public class FakeController {

        @GetMapping("/hello")
        public ResponseEntity<String> hello() {
            return ResponseEntity.ok("Hello World");
        }
}
