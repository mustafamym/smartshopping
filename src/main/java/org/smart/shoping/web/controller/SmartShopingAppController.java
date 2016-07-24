package org.smart.shoping.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SmartShopingAppController {

    /*@RequestMapping(value="/")
	public String index(Model model){
		model.addAttribute("test", "Welcome to smart web application");
		return "index";
	}
	
	@RequestMapping(value="/login")
	public String login()
	{
		return "index";
	}*/
    @RequestMapping(value = "/business-item-panel/{id}")
    public String businessItemPanelInit(Model model, @PathVariable("id") Long id) {
        model.addAttribute("businessId", id);

        return "business/item-panel";
    }

    @RequestMapping(value = "/item/view/{id}")
    public String initItemView(Model model, @PathVariable("id") Long id) {
        model.addAttribute("itemId", id);
        return "item/view";
    }
}
