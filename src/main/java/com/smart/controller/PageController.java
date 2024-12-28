package com.smart.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PageController {

    @RequestMapping("/home")
    public String home(Model model) {
        System.out.println("home page handler");
        model.addAttribute("name", "Substring Tech");
        model.addAttribute("yt_channel", "learn code");
        return "home";
    }

    // about route
    @RequestMapping("/about")
    public String aboutPage() {
        System.out.println("About page loading");
        return "about";
    }

    // service route
    @RequestMapping("/services")
    public String servicesPage() {
        System.out.println("Services page loading");
        return "services";
    }

    // contact page
    @GetMapping("/contact")
    public String contact() {
        return new String("contact");
    }

    // contact page
    @GetMapping("/login")
    public String login() {
        return new String("login");
    }

    // contact page
    @GetMapping("/register")
    public String register() {
        return new String("register");
    }

}
