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

@WebServlet("/patientUpdateCtrl")
public class PatientUpdateCtrl extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
	
		AdminModel model = new AdminModel();
		Patient p = model.getPatientRecord(id);
		
		
		RequestDispatcher rd = request.getRequestDispatcher("editPatient.jsp");
		request.setAttribute("PTN", p);
		rd.forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		String name = request.getParameter("pname");
		String gender = request.getParameter("gender");
		int age = Integer.parseInt(request.getParameter("age"));
		String disease = request.getParameter("disease");
		String bloodGroup = request.getParameter("bloodGroup");
		String mobile = request.getParameter("mobile");

		Patient p = new Patient(name, gender, age, disease, bloodGroup, mobile);
		p.setPid(id);

		AdminModel model = new AdminModel();
		int i = model.updatePatientRecord(p);
		ArrayList<Patient> al = model.getAllPatient();
		
		RequestDispatcher rd = request.getRequestDispatcher("patientDetails.jsp");
		request.setAttribute("LIST", al);
		if (i != 0) {
			request.setAttribute("msg", "Patient Record Updated");
		} else {
			request.setAttribute("msg", "Patient Record Not Updated");
		}
		rd.forward(request, response);
	}

}
