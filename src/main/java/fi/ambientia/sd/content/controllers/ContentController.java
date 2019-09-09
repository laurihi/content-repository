package fi.ambientia.sd.content.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/content")
public class ContentController {

    private String instanceId;


    public ContentController(@Value("${spring.application.instance}") String instanceId){

        this.instanceId = instanceId;
    }

    @GetMapping("id/{contentIdentifier}")
    public String getContent(@PathVariable("contentIdentifier") String contentIdentifier ) {
        return "Get content with " + contentIdentifier + " on server  " + instanceId;
    }
}
