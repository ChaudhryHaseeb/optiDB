package org.optidb.optidbclient;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MainController {

    /*@RequestMapping(value = "/", method = RequestMethod.GET)
    public @ResponseBody
    List<Platform> listAllPlaform() {
        List<Platform> platforms = new ArrayList<Platform>();
        platforms.add(new Platform("Hadoop"));
        platforms.add(new Platform("Spark"));
        return platforms;
    }*/

    @GetMapping({"/", "/liste"})
    public String hello(Model model, @RequestParam(value="name", required=false, defaultValue="World") String name) {
        List<Platform> platforms = new ArrayList<Platform>();
        platforms.add(new Platform("Hadoop"));
        platforms.add(new Platform("Spark"));
        model.addAttribute("liste", platforms);
        return "listePlateformes";
    }
}