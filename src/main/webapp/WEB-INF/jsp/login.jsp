<% 
	String path = (String)request.getContextPath();
	String fullPath = null;
	if(request.getParameter("parent") != null)
	{

	fullPath = path+"/login.do?parent="+request.getParameter("parent");
	}
	else
	fullPath = path+"/login.do";

	System.out.println(fullPath);	
	response.sendRedirect(fullPath);
%>

<h2>welcome</h2>