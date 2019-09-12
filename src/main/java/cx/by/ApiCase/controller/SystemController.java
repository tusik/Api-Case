package cx.by.ApiCase.controller;

import cx.by.ApiCase.ApiCaseApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Project name: ApiCase
 *
 * Control the base system
 *
 * Create by: Image
 *
 * Create at: 2019-09-12
 **/

@RestController
public class SystemController {
    @GetMapping("/restart")
    public void restart() {
        ApiCaseApplication.restart();
    }
}
