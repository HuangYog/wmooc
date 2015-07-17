package com.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by HY on 2015/7/17.
 * desc:
 */
@Controller
public class HomeController {

    @RequestMapping(value = "/")
     public String home() {
        return "/index.jsp";
     }
}
