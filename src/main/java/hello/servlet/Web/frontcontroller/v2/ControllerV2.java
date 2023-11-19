package hello.servlet.Web.frontcontroller.v2;

import hello.servlet.Web.frontcontroller.MyView;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public interface ControllerV2 {

    MyView process(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException;
}
 