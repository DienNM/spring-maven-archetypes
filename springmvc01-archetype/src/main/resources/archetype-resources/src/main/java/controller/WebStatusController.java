#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ${package}.dto.WebStatusData;
import ${package}.service.WebStatusService;

/**
 * @author dien.nguyen
 **/

@Controller
@RequestMapping("/webstatus")
public class WebStatusController {
    
    @Autowired
    private WebStatusService webStatusService;

    @RequestMapping(method = RequestMethod.GET)
    public String checkStatus(Model model) {
        WebStatusData webStatus = webStatusService.check();
        model.addAttribute("webStatus", webStatus);
        return "web_status";
    }

}
