//package az.iktlab.agrotechnicalservice.controller;
//
//import az.iktlab.agrotechnicalservice.dao.model.UsersModel;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.PostMapping;
//
//@Controller
//public class UsersController {
//
//    private UsersService usersService;
//
//    @GetMapping("/register")
//    public String getRegisterForm(Model model) {
//        model.addAttribute("registerRequest", new UsersModel());
//        return "register_page";
//    }
//
//    @GetMapping("/login")
//    public String getLoginForm(Model model) {
//        model.addAttribute("loginRequest", new UsersModel());
//        return "login_page";
//    }
//
//    @PostMapping("/register")
//    public String register(@ModelAttribute UsersModel usersModel) {
//        System.out.println("register request: " + usersModel);
//        UsersModel registeredUser = usersService.register(usersModel.getLogin(),
//                                                            usersModel.getPassword(),
//                                                                usersModel.getEmail());
//
//        if(registeredUser == null) {
//            return "error_page";
//        } else
//            return "redirect/login";
//    }
//
//    @PostMapping("/login")
//    public String login(@ModelAttribute UsersModel usersModel) {
//        System.out.println("login request: " + usersModel);
//        UsersModel authenticatedUser = usersService.authenticate(usersModel.getLogin(),
//                usersModel.getPassword());
//
//        if(authenticatedUser == null) {
//            return "error_page";
//        } else
//            return "personal_page";
//    }
//}
