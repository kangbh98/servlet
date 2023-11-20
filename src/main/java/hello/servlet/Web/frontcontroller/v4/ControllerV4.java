package hello.servlet.Web.frontcontroller.v4;

import java.util.Map;

public interface ControllerV4 {

    /**
     *
     * @param paramMap
     * @param model
     * @return viewname;
     */

    String process(Map<String, String> paramMap, Map<String, Object> model);
}
