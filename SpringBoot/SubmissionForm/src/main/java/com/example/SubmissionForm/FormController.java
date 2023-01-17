package com.example.SubmissionForm;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FormController {
    @GetMapping("/subform")
    public String SubmissionForm(){
        return "sub_form";
    }

    @PostMapping("/details")
    public String view(@RequestParam("cname") String cname,
                       @RequestParam("cid") String  cid,
                       @RequestParam("cemail") String cemail, ModelMap modelMap){

        modelMap.put("cname", cname);
        modelMap.put("cid", cid);
        modelMap.put("cemail", cemail);
        return "ViewCustomer";
    }

}
