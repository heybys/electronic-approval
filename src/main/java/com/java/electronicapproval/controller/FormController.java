package com.java.electronicapproval.controller;

import com.java.electronicapproval.repository.ApprovalFormRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class FormController {

    private final ApprovalFormRepository approvalFormRepository;

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("users", approvalFormRepository.findAll());
        // model.addAttribute("externalHtml", apiService.getHtmlContent());
        return "index";
    }
}
