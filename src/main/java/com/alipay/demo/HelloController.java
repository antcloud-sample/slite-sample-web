package com.alipay.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.net.Inet4Address;
import java.net.UnknownHostException;

@Controller
@RequestMapping("/")
public class HelloController {

    @Autowired
    private SampleService sampleService;

    @RequestMapping(value="/hello",method = RequestMethod.GET)
    public String printWelcome(ModelMap model) {
        model.addAttribute("message", "This is ant-cloud sample code!");
        return "sample.vm";
    }

    @RequestMapping(value = "/myIp", method = RequestMethod.GET)
    public String printIp(ModelMap model) throws UnknownHostException {
        model.put("ip", Inet4Address.getLocalHost().getHostAddress());
        return "ip.vm";
    }

    @RequestMapping(value = "/remoteMessage", method = RequestMethod.GET)
    public String printRemoteMessage(ModelMap model) throws UnknownHostException {
        model.put("message", sampleService.message());
        return "remote_message.vm";
    }


}
