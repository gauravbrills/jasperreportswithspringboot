package gauravbrills.demo.jasper.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.sql.DataSource;
import javax.websocket.server.PathParam;

/**
 * @author grawat
 */
@Controller
@RequestMapping(value = "/reports")
public class JasperEndPoint {
    private static final String FILE_FORMAT = "format";

    private static final String DATASOURCE = "datasource";

    @Autowired
    private DataSource dbsoruce;


    @RequestMapping(value = "{reportname}", method = RequestMethod.GET)
    public ModelAndView getRptByParam(final ModelMap modelMap, ModelAndView modelAndView,
                                      @PathParam("reportname") final String reportname,
                                      @RequestParam(value = FILE_FORMAT, defaultValue = "pdf") final String format,
                                      @RequestParam(value = "id", defaultValue = "%") final String id) {

        // connecting to embedded h2
        modelMap.put(DATASOURCE, dbsoruce);
        modelMap.put(FILE_FORMAT, format);
        modelMap.put("productid", id);
        modelAndView = new ModelAndView(reportname, modelMap);
        return modelAndView;
    }
}
