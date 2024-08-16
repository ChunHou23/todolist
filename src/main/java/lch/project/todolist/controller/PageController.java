package lch.project.todolist.controller;

import lch.project.todolist.business.UserBusiness;
import lch.project.todolist.model.Dto.Out.UserInformationOutDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {
    @Autowired
    private UserBusiness userBusiness;

    @GetMapping("/")
    public String homePage(Model model) {
        UserInformationOutDTO mockData = userBusiness.getMockUserInformation(1L);
        model.addAttribute("message", "To-Do List !");
        model.addAttribute("user_info", mockData.getUserInfo());
        model.addAttribute("account_config_list", mockData.getAccountConfigInfo());
        model.addAttribute("task_list", mockData.getTaskInfo());
        return "home";
    }

    @GetMapping("/createNewTask")
    public String addTaskPage(Model model) {
        UserInformationOutDTO mockData = userBusiness.getMockUserInformation(1L);
        model.addAttribute("message", "To-Do List !");
        model.addAttribute("user_info", mockData.getUserInfo());
        model.addAttribute("account_config_list", mockData.getAccountConfigInfo());
        model.addAttribute("task_list", mockData.getTaskInfo());
        return "create-task";
    }
}
