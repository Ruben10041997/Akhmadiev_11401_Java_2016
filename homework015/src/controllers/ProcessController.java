package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


@Controller
@RequestMapping("/process")
public class ProcessController {
    //static int result = 0;
    @RequestMapping(method = RequestMethod.GET)
    public String processPage() {
        return "process";
    }

    @RequestMapping(method = RequestMethod.POST)
            public String post(ModelMap modelMap,@RequestParam(name = "oper") String oper,
                               @RequestParam(name = "text") String text, RedirectAttributes redirectAttributes){


        int result = 0;

      if (oper.equals("symbols")){
          result = text.length();
          modelMap.put(text , result);}

        if (oper.equals("words")){
            result = (text.split(" ")).length;
          modelMap.put(text, result); }

        if (oper.equals("paragraphs")){
            result = (text.split("\\n")).length;
            modelMap.put(text, result);}

        if (oper.equals("sentences")) {

            Pattern pattern = Pattern.compile("[\\.!?]+");
            Matcher matcher = pattern.matcher(text);

            while (matcher.find()) {
                result++;
            }

        }

        redirectAttributes.addAttribute("result", result);
        return "redirect:/result";


   }



}

