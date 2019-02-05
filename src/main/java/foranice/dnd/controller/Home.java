package foranice.dnd.controller;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@ResponseBody
@RequestMapping("/home")
public class Home {
    @Resource
    private RedisTemplate<String, String> redisTemplate;
    @RequestMapping("/index")
    public String Index(){
        this.redisTemplate.opsForValue().set("study", "java");
        redisTemplate.opsForSet().add("","");
        return  "dnd linker service";
    }
}
