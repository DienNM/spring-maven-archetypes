#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.service.impl;

import org.springframework.stereotype.Service;

import ${package}.dto.WebStatusData;
import ${package}.service.WebStatusService;

/**
 * @author dien.nguyen
 **/

@Service
public class DefaultWebStatusService implements WebStatusService {
    
    enum Status {
        success,
        error
    }
    
    @Override
    public WebStatusData check() {
        
        WebStatusData webStatusData = new WebStatusData();
        webStatusData.setStatus(Status.success.name());
        webStatusData.setMessage("Web App is running");
        
        return webStatusData;
    }

}
