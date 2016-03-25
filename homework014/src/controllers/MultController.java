package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Controller
@RequestMapping("/mult/{value1:\\d+}/{value2:\\d+}")
public class MultController {


    @RequestMapping(method = RequestMethod.GET)
            String mult(ModelMap modelMap, @PathVariable String value1, @PathVariable String value2){
            modelMap.put("result", Integer.parseInt(value1) * Integer.parseInt(value2));
          return "mult";
        }

}
