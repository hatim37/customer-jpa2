package net.hatim.customerjpa2.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PingController {
    @GetMapping({"/", "/ping", "/healthz"})
    public String ping() { return "OK"; }
}
