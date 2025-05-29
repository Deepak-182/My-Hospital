package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import adminnn.AdminModel;
import city.dto.Patient;

@WebServlet("/patientRegistrationCtrl")
public class PatientRegistrationCtrl extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String pname = request.getParameter("pname");
		String gender = request.getParameter("gender");
		int age = Integer.parseInt(request.getParameter("age"));
		String disease = request.getParameter("disease");
		String bloodGroup = request.getParameter("bloodGroup");
		 String mobile = request.getParameter("mobile");
		 
		 Patient pp = new Patient(pname, gender, age, disease, bloodGroup, mobile);
		 
		 AdminModel model = new AdminModel();
		 int x = model.insertRecord(pp);
		 RequestDispatcher re = request.getRequestDispatcher("patientRegister.jsp");
		 if(x!=0) {
			 request.setAttribute("msg"," Patient Record Added");
		 }
		 else {
			 request.setAttribute("msg"," Patient Record Not Added"); 
		 }
		re.forward(request, response);
	}

}
