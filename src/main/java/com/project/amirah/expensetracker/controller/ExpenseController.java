package com.project.amirah.expensetracker.controller;

import com.project.amirah.expensetracker.entity.Expense;
import com.project.amirah.expensetracker.service.ExpenseService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

@Controller
@RequestMapping("/expenses")
public class ExpenseController {

    private final ExpenseService expenseService;

    public ExpenseController(ExpenseService expenseService) {
        this.expenseService = expenseService;
    }

    @GetMapping
    public String showExpenses(Model model) {
        model.addAttribute(
                "expenses",
                expenseService.getAllExpenses()
        );
        return "expenses";
    }

    @GetMapping("/new")
    public String showExpenseForm(Model model) {
        model.addAttribute("expense", new Expense());
        return "expense-form";
    }

    @PostMapping("/save")
    public String saveExpense(@ModelAttribute Expense expense) {
        if (expense.getCreatedAt() == null) {
            expense.setCreatedAt(LocalDateTime.now());
        }
        expenseService.saveExpense(expense);
        return "redirect:/expenses";
    }

    @GetMapping("/delete/{id}")
    public String deleteExpense(@PathVariable Long id) {
        expenseService.deleteExpense(id);
        return "redirect:/expenses";
    }
}
