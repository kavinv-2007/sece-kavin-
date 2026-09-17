
// package com.example.demo.Controller;

// import java.util.List;

// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.RequestBody;
// import org.springframework.web.bind.annotation.RequestParam;
// import org.springframework.web.bind.annotation.RestController;

// import com.example.demo.dto.Account;
// import com.example.demo.service.AccountService;

// @RestController
// public class HelloController {
//     private final AccountService accountService;

//     public HelloController(AccountService accountService) {
//         this.accountService = accountService;
//     }

//     @GetMapping("/")
//     public String helloWorld(@RequestParam String name) {
//         return "Hello World" + name;
//     }

//     @PostMapping("/")
//     public String helloWorldPost(@RequestParam String name) {
//         return "Account created for" + name;
//     }

//     @PostMapping("/accounts")
//     public Account createAccount(@RequestBody Account account) {
//         return accountService.addAccount(account);
//     }

//     @GetMapping("/accounts")
//     public List<Account> getAllAccounts() {
//         return accountService.getAllAccounts();
//     }
// }