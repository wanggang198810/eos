package com.sunsharing.eos.clientproxy.web.controller.main;


import com.sunsharing.eos.client.rpc.RpcInvoker;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

import com.sunsharing.eos.clientproxy.web.common.BaseController;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
public class MainController extends BaseController {
    /**
     *
     *
     * @param model
     * @param request
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/service.do")
    public String service(Model model, HttpServletRequest request) throws Exception {
        return RpcInvoker.invoke(request.getParameter("serviceReqBase64Str")
                , request.getParameter("serialization"));
    }
}
