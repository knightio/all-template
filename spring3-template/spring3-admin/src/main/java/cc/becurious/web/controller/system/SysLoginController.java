package cc.becurious.web.controller.system;

import cc.becurious.common.core.domain.LoginBody;
import cc.becurious.framework.web.service.SysLoginService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SysLoginController {

    @Resource
    SysLoginService sysLoginService;

    @PostMapping("/login")
    public String login(@RequestBody LoginBody loginBody){
        return sysLoginService.login(loginBody.getUsername(), loginBody.getPassword());
    }

}
