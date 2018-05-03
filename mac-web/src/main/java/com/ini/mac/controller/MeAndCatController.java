package com.ini.mac.controller;


import com.ini.mac.server.MeAndCatServer;
import com.ini.mac.vo.MeAndCatSaveVo;
import com.ini.mac.vo.base.ErrorCode;
import com.ini.mac.vo.base.MacResponse;
import com.ini.mac.vo.base.MyException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping(value = "/meAndCat", method = RequestMethod.GET)
public class MeAndCatController extends BaseController {

    @Autowired
    private MeAndCatServer meAndCatServer;

    @RequestMapping("/")
    public String index() {
        return "index.html";
    }


    @RequestMapping("/getCat")
    public String getCat(ModelMap modelMap) {
        modelMap.put("name", "猫三疯");
        modelMap.put("call", "过来吃屎啦");
        return "sayhello.html";
    }


    @RequestMapping("/showError")
    public String showError() throws Exception {
        throw new Exception("页面发生错误");
    }

    @RequestMapping("/showError2")
    @ResponseBody
    public String showError2() throws Exception {
        throw new MyException(ErrorCode.OBJECT_IS_NOT_FIND);
    }

    @RequestMapping("/listMeAndCat")
    @ResponseBody
    public Object listMeAndCat() {
        return meAndCatServer.findAll();
    }
    @RequestMapping(value="/saveMeAndCat",method = RequestMethod.POST)
    @ResponseBody
    public MacResponse saveMeAndCat(@RequestBody MeAndCatSaveVo meAndCatSaveVo) {
        meAndCatServer.saveMeAndCat(meAndCatSaveVo);
        return handelSuccess();
    }

    @RequestMapping(value = "/findByAttitude", method = RequestMethod.GET)
    @ResponseBody
    public Object findByAttitude(int attitude) {
        String byAttitude = meAndCatServer.findByAttitude(attitude);
        return handelSuccess(byAttitude);
    }

}
