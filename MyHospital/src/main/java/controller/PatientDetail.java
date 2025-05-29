package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import adminnn.AdminModel;
import city.dto.Patient;

@WebServlet("/patientDetail")
public class PatientDetail extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		AdminModel model = new AdminModel();
		ArrayList<Patient> al = model.getAllPatient();
		RequestDispatcher rd = request.getRequestDispatcher("patientDetails.jsp");
		request.setAttribute("LIST",al);
		rd.forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

}
