package com.codewithrushi.SumCalculator3;

import com.codewithrushi.SumCalculator3.model.SumData;
import com.codewithrushi.SumCalculator3.service.SumService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class SumController {

    @Autowired
    private SumService sumService;

    // Temporary session list for current input session
    private List<Integer> currentList = new ArrayList<>();

    // GET home page
    @GetMapping("/")
    public String homePage() {
        return "home";
    }

    // New list button - clear current list
    @GetMapping("/new")
    public String newList() {
        currentList.clear();
        return "redirect:/";
    }

    // Add number to list
    @PostMapping("/add")
    public String addNumber(@RequestParam("number") Integer number) {
        currentList.add(number);
        return "redirect:/";
    }

    // Calculate sum and show result
    @GetMapping("/sum")
    public String getSum(Model model) {
        int result = sumService.getOrComputeSum(currentList);
        model.addAttribute("numbers", currentList.toString());
        model.addAttribute("sum", result);
        return "result";
    }
}

