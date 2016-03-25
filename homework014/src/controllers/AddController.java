package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping("/add/{value1:\\d+}/{value2:\\d+}")
public class AddController {

    @RequestMapping(method = RequestMethod.GET)
    public String addPage(ModelMap modelMap, @PathVariable String value1, @PathVariable String value2){
        modelMap.put("result", Integer.parseInt(value1) + Integer.parseInt(value2));
        return "add";
    }

}
