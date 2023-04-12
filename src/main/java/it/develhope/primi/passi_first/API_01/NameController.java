package it.develhope.primi.passi_first.API_01;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class NameController {
    @GetMapping("/name/{name}")
    public String getName(@PathVariable String name){
        return "Name: " + name;
    }


}
