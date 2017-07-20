/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.si.anagram;

/**
 *
 * @author Robert Čmrlec
 */
import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AnagramController {
    @RequestMapping("/anagram")
    public Anagram anagram(@RequestParam(value="source", defaultValue="mars") String source,
                             @RequestParam(value="target", defaultValue="sram") String target
            ) {
        return new Anagram(source, target);
    }
}