/**
 * 
 */
package gauravbrills.demo.jasper.web;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;
import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    private DataSource dbsoruce;

    /*
     * @RequestMapping(value = "{reportname}", method = RequestMethod.GET) public ModelAndView getReportsFull(final ModelMap
     * modelMap, ModelAndView modelAndView, @PathParam("reportname") final String reportname, @RequestParam(FILE_FORMAT) final
     * String format) { // JRDataSource datasource = new JRBeanCollectionDataSource(dataMap); modelMap.put(DATASOURCE, dbsoruce);
     * modelMap.put(FILE_FORMAT, format); modelAndView = new ModelAndView(reportname, modelMap); return modelAndView; }
     */
    @RequestMapping(value = "{reportname}", method = RequestMethod.GET)
    public ModelAndView getRptByParam(final ModelMap modelMap, ModelAndView modelAndView, @PathParam("reportname")
    final String reportname, @RequestParam(FILE_FORMAT)
    final String format, @RequestParam("id")
    final String id) {

        List<String> paramMap = new ArrayList<>();
        paramMap.add(id);
        // connecting to mysql
        modelMap.put(DATASOURCE, dbsoruce);
        modelMap.put(FILE_FORMAT, format);
        modelMap.put("productid", id);
        modelAndView = new ModelAndView(reportname, modelMap);
        return modelAndView;
    }
}
