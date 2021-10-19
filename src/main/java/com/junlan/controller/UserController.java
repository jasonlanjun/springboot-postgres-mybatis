package com.junlan.controller;

        import com.junlan.bean.User;
        import com.junlan.mapper.UserMapper;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.web.bind.annotation.*;
        import java.util.List;

@RestController

public class UserController {

    @Autowired
    private UserMapper mapper;

    @RequestMapping("/select")
    public List<User> select() {
        return mapper.getUser();
    }

    @PostMapping("/insert")
    public int insert(@RequestBody User user) {
        return mapper.insertUser(user);
    }

    @PutMapping("/update")
    public int update(@RequestBody User user) {
        return mapper.updateUser(user);
    }

    @DeleteMapping("/delete/{name}")
    public int delete(@PathVariable String name) {
        return mapper.deleteUser(name);
    }
}
