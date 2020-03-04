package io.library.management.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "/")
public class LibraryManagementController {

    public String homePage(Model model) {
        return "index";
    }

}
