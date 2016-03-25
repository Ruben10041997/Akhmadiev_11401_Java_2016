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
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Controller
@RequestMapping("/search/{searcher:\\w+}")
public class SearchController {
    @RequestMapping(method = RequestMethod.GET)
    public String searchPage(ModelMap modelMap, @PathVariable String searcher) {
        String name = "";

        if (searcher.contains("baidu")) {
            searcher = "www." + searcher + ".com/s" ;
            name = "wd";
        }
        if (searcher.contains("google")) {
            searcher = "www." + searcher + ".com/search";
            name = "q";
        }
        if (searcher.contains("yahoo")) {
            searcher = "search." + searcher + ".com/search";
            name = "p";
        }
        if (searcher.contains("aol")) {
            searcher = "search." + searcher + ".com/search";
            name = "q";
        }

        modelMap.put("searcher", searcher);
        modelMap.put("name", name);
        return "searching";
    }
}
