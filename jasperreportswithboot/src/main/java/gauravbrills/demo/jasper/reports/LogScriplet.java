package gauravbrills.demo.jasper.reports;

import net.sf.jasperreports.engine.JRAbstractScriptlet;
import net.sf.jasperreports.engine.JRScriptletException;

public class LogScriplet extends JRAbstractScriptlet {

    @Override
    public void afterColumnInit() throws JRScriptletException {

        System.out.println("After Column Init ");

    }

    @Override
    public void afterDetailEval() throws JRScriptletException {

        System.out.println("After Detail Eval " + getFieldValue("product_id"));

    }

    @Override
    public void afterGroupInit(final String groupName) throws JRScriptletException {

        System.out.println("After Init Group : " + groupName);

    }

    @Override
    public void afterPageInit() throws JRScriptletException {



    }

    @Override
    public void afterReportInit() throws JRScriptletException {

        System.out.println("After Report Init");

    }

    @Override
    public void beforeColumnInit() throws JRScriptletException {

        System.out.println("Before Column Init");

    }

    @Override
    public void beforeDetailEval() throws JRScriptletException {

        // TODO Auto-generated method stub

    }

    @Override
    public void beforeGroupInit(final String groupName) throws JRScriptletException {

        // TODO Auto-generated method stub

    }

    @Override
    public void beforePageInit() throws JRScriptletException {

        // TODO Auto-generated method stub

    }

    @Override
    public void beforeReportInit() throws JRScriptletException {

        System.out.println("beforeReportInit : Param Value Passed" + getParameterValue("productid"));

    }

}
