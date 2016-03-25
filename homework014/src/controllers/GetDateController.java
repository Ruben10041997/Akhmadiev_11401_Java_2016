package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Date;


@Controller
@RequestMapping("/getdate")
public class GetDateController {

    @RequestMapping(method = RequestMethod.GET)
           public String getData(ModelMap modelMap) {
        modelMap.put("date", new Date().toString());
        return "date";

    }
}
