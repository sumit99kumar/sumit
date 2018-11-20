package com.simple;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sample.model.LiquorSelect;
import com.sample.model.LiquorType;

@WebServlet(
        name = "selectliquorservlet",
        urlPatterns = "/SelectLiquor")

public class SelectLiquorServlet extends HttpServlet{

	
	@Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String liquorType = req.getParameter("Type");

        LiquorSelect liquorSelect = new LiquorSelect();
        LiquorType l = LiquorType.valueOf(liquorType);

        List liquorBrands = liquorSelect.getAvailableBrands(l);

        req.setAttribute("brands", liquorBrands);
        RequestDispatcher view = req.getRequestDispatcher("result.jsp");
        view.forward(req, resp);

    }
}
