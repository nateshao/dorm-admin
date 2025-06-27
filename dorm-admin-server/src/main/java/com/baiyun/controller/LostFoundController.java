package com.baiyun.controller;

import com.baiyun.entity.LostFound;
import com.baiyun.service.LostFoundService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/lostfound")
public class LostFoundController {
    @Autowired
    private LostFoundService lostFoundService;

    @PostMapping("/add")
    public String addLostFound(@RequestBody LostFound lostFound) {
        lostFoundService.addLostFound(lostFound);
        return "success";
    }

    @GetMapping("/all")
    public List<LostFound> getAllLostFound() {
        return lostFoundService.getAllLostFound();
    }

    @GetMapping("/type/{type}")
    public List<LostFound> getLostFoundByType(@PathVariable String type) {
        return lostFoundService.getLostFoundByType(type);
    }

    @PostMapping("/status")
    public String updateStatus(@RequestParam Long id, @RequestParam String status) {
        lostFoundService.updateStatus(id, status);
        return "success";
    }

    @DeleteMapping("/delete/{id}")
    public String deleteLostFound(@PathVariable Long id) {
        lostFoundService.deleteLostFound(id);
        return "success";
    }
} 