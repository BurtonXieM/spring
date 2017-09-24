package chm.controller.memeber;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by XieM on 2017/9/24.
 */
@Controller
@RequestMapping(value = "/member/")
public class member {


    @RequestMapping("index")
    @ResponseBody
    public String index(){

        return "this is index" ;
    }
}
