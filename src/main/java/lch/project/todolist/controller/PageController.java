package lch.project.todolist.controller;

import lch.project.todolist.business.UserBusiness;
import lch.project.todolist.infra.enums.PageEnum;
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
        UserInformationOutDTO mockData = userBusiness.getMockUserInformation(1L, PageEnum.ALL_PAGE.getPageCode());
        model.addAttribute("message", "To-Do List !");
        model.addAttribute("user_info", mockData.getUserInfo());
        model.addAttribute("account_config_list", mockData.getAccountConfigInfo());
        model.addAttribute("task_list", mockData.getTaskInfo());
        return "home";
    }

    @GetMapping("/all")
    public String allPage(Model model) {
        UserInformationOutDTO mockData = userBusiness.getMockUserInformation(1L, PageEnum.ALL_PAGE.getPageCode());
        model.addAttribute("message", "To-Do List !");
        model.addAttribute("user_info", mockData.getUserInfo());
        model.addAttribute("account_config_list", mockData.getAccountConfigInfo());
        model.addAttribute("task_list", mockData.getTaskInfo());
        return "home";
    }

    @GetMapping("/new")
    public String newPage(Model model) {
        UserInformationOutDTO mockData = userBusiness.getMockUserInformation(1L, PageEnum.NEW_PAGE.getPageCode());
        model.addAttribute("message", "To-Do List !");
        model.addAttribute("user_info", mockData.getUserInfo());
        model.addAttribute("account_config_list", mockData.getAccountConfigInfo());
        model.addAttribute("task_list", mockData.getTaskInfo());
        return "home";
    }

    @GetMapping("/inProgress")
    public String inProgressPage(Model model) {
        UserInformationOutDTO mockData = userBusiness.getMockUserInformation(1L, PageEnum.IN_PROGRESS_PAGE.getPageCode());
        model.addAttribute("message", "To-Do List !");
        model.addAttribute("user_info", mockData.getUserInfo());
        model.addAttribute("account_config_list", mockData.getAccountConfigInfo());
        model.addAttribute("task_list", mockData.getTaskInfo());
        return "home";
    }

    @GetMapping("/completed")
    public String completedPage(Model model) {
        UserInformationOutDTO mockData = userBusiness.getMockUserInformation(1L, PageEnum.COMPLETED_PAGE.getPageCode());
        model.addAttribute("message", "To-Do List !");
        model.addAttribute("user_info", mockData.getUserInfo());
        model.addAttribute("account_config_list", mockData.getAccountConfigInfo());
        model.addAttribute("task_list", mockData.getTaskInfo());
        return "home";
    }

    @GetMapping("/createNewTask")
    public String addTaskPage(Model model) {
        UserInformationOutDTO mockData = userBusiness.getMockUserInformation(1L, PageEnum.ALL_PAGE.getPageCode());
        model.addAttribute("message", "To-Do List !");
        model.addAttribute("user_info", mockData.getUserInfo());
        model.addAttribute("account_config_list", mockData.getAccountConfigInfo());
        model.addAttribute("task_list", mockData.getTaskInfo());
        return "create-task";
    }
}
