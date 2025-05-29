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

@WebServlet("/patientDeletCtrl")
public class PatientDeletCtrl extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		AdminModel model = new AdminModel();
		int i = model.deletAllRecord(id);
		ArrayList<Patient> al = model.getAllPatient();
		
		RequestDispatcher rd = request.getRequestDispatcher("patientDetails.jsp");
		if(i != 0) {
			request.setAttribute("msg", "Record deleted");
			request.setAttribute("LIST", al);
		}
		else {
			request.setAttribute("msg","Record not deleted");
			request.setAttribute("LIST", al);
		}
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

}
