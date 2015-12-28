package com.alipay.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ErrorController {

    @RequestMapping(value = "/error")
    public void renderError(ModelMap modelMap, String exception_marking, String messageCode) {
        initModelMap(modelMap, exception_marking, messageCode);
    }

    @RequestMapping(value = "/errorXbox")
    public void renderErrorXBox(ModelMap modelMap, String exception_marking, String messageCode) {
        initModelMap(modelMap, exception_marking, messageCode);
    }


    /**
     * @param modelMap
     * @param request
     */
    private void initModelMap(ModelMap modelMap, String exception_marking, String messageCode) {
        modelMap.put("exception_marking", exception_marking);
        modelMap.put("messageCode", messageCode);
    }
}