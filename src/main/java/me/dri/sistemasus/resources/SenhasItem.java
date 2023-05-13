package me.dri.sistemasus.resources;


import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/senha")
public class SenhasItem {

    @GetMapping(produces = MediaType.TEXT_HTML_VALUE)
    public Resource getSenhaPage() {
        return new ClassPathResource("static/index.html");
    }
}
