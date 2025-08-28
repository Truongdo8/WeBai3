<!doctype html>
<html>
<head>
    <meta charset="utf-8">
    <title>Murach's Java Servlets and JSP</title>
    <link rel="stylesheet" href="styles/newcss1.css" type="text/css"/>
</head>
 
<body>
  <div class="container">
    <img src="images/Murach_image.jpg" alt="Company Logo" width="300" height="200">
 
    <h2>Here is the information that you entered:</h2>

    <div class="info-row">
      <label>Email:</label>
      <span>${user.email}</span>
    </div>

    <div class="info-row">
      <label>First Name:</label>
      <span>${user.firstName}</span>
    </div>

    <div class="info-row">
      <label>Last Name:</label>
      <span>${user.lastName}</span>
    </div>

    <div class="info-row">
      <label>You hear from:</label>
      <span>${user.source}</span>
    </div>

    <div class="announcements">
      <label>Announcements:</label>
      <div class="values">
        <c:if test="${not empty user.announce1}">
            <span>${user.announce1}</span>
        </c:if>
        <c:if test="${not empty user.announce2}">
            <span>${user.announce2}</span>
        </c:if>
      </div>
    </div>

    <div class="info-row">
      <label>Contact method:</label>
      <span>${user.contact}</span>
    </div>
    
    <p>To enter another information, click on the Back 
    button in your browser or the Return button shown 
    below.</p>
 
    <form action="" method="get">
        <input type="hidden" name="action" value="join">
        <input type="submit" value="Return">
    </form>
  </div>
</body>
</html>
