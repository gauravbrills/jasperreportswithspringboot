/**
 * 
 */
package gauravbrills.demo.jasper.web;

import java.util.ArrayList;
import java.util.List;

import javax.websocket.server.PathParam;

import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author grawat
 */
@Controller
@RequestMapping(value = "/reports")
public class JasperEndPoint {
    private static final String FILE_FORMAT = "format";

    private static final String DATASOURCE = "datasource";

    @RequestMapping(value = "{reportname}", method = RequestMethod.GET)
    public ModelAndView getRpt4(final ModelMap modelMap, ModelAndView modelAndView, @PathParam("reportname")
    final String reportname, @RequestParam(FILE_FORMAT)
    final String format) {

        List<String> dataMap = new ArrayList<>();
        dataMap.add("Hi");
        JRDataSource datasource = new JRBeanCollectionDataSource(dataMap);
        modelMap.put(DATASOURCE, datasource);
        modelMap.put(FILE_FORMAT, format);
        modelAndView = new ModelAndView(reportname, modelMap);
        return modelAndView;
    }
}
