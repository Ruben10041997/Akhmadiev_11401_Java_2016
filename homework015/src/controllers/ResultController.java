package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@Controller
@RequestMapping("/result")
public class ResultController {

    @RequestMapping(method = RequestMethod.GET)
    public String getResult(ModelMap modelMap,@ModelAttribute("result") String result) {
        modelMap.put("result", result);
        return "result";
    }
}