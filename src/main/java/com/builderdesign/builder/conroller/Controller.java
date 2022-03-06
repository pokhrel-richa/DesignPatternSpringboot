package com.builderdesign.builder.conroller;

import com.builderdesign.builder.builder.Phone;
import com.builderdesign.builder.builder.PhoneBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("builder/{os}/{size}")
public String builderPattern(@PathVariable("os") String OS, @PathVariable("size") int ram_size){
    Phone p = new PhoneBuilder().setOs(OS).setRam(ram_size).getPhone();
    System.out.println(p);
    return p.toString();
}
}
