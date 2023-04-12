package it.develhope.primi.passi_first.API_01;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class NameController {
    @GetMapping("/name/{name}")
    public String getName(@PathVariable String name){
        return "Name: " + name;
    }

    @PostMapping("/reverseName/{name}")
    public String reverseName(@PathVariable String name){
        StringBuilder reverseName = new StringBuilder(name);
        reverseName.reverse();
        return "Reversed name: " + reverseName;
    }

}
