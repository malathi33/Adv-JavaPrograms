<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>Edit-Form</title>
<!-- Bootstrap CDN Links to Get the support of Bootstrap -->
<link rel="stylesheet"  href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"></link> 
<!-- This is Javascript validation code location --> 
</head>

<body>
 <div class ="container mt-5 text-center">
   <h2 class="text-center font-italic mb-1">Save Product.....</h2>
   <form method="post" action="./EditProductServlet" enctype="multipart/form-data" onsubmit="return validateForm()">
       
       <div class="form-group">
            <label class="font-italic font-weight-bold" for="proId">Product ID:</label>
            <input type="text" class="form-control-sm" id="proId" name="proId" value="${existingProduct.proId}" required>
          
       </div>
               <div class="form-group">
            <label class="font-italic font-weight-bold" for="proName">Product Name:</label>
            <input type="text" class="form-control-sm" id="proName" name="proName" value="${existingProduct.proName}"required>
          
       </div>
   
         <div class="form-group">
            <label class="font-italic font-weight-bold" for="proPrice">Product Price:</label>
            <input type="number" class="form-control-sm" id="proPrice" name="proPrice" value="${existingProduct.proPrice}" required>
          
       </div>
   
         <div class="form-group">
            <label class="font-italic font-weight-bold" for="proBrand">Product Brand:</label>
            <input type="text" class="form-control-sm" id="proBrand" name="proBrand" value="${existingProduct.proBrand}"required>
          
       </div>
          
         <div class="form-group">
            <label class="font-italic font-weight-bold" for="proMadeIn">Made In:</label>
            <input type="text" class="form-control-sm" id="proMadeIn" name="proMadeIn" value="${existingProduct.proMadeIn}"required>
          
         </div>
          <div class="form-group">
            <label class="font-italic font-weight-bold" for="proMfgDate">Manufacturing Date:</label>
            <input type="date" class="form-control-sm" id="proMfgDate" name="proMfgDate" value="${existingProduct.proMfgDate}"required>
          
        </div>
         
          <div class="form-group">
            <label class="font-italic font-weight-bold" for="proExpDate">Expiry Date:</label>
            <input type="date" class="form-control-sm" id="proExpDate" name="proExpDate" value="${existingProduct.proExpDate}"required>
          
        </div>
        
         <div class="form-group">
            <label class="font-italic font-weight-bold" for="proImage">Product Image:</label>
            <input type="file" class="form-control-sm" id="proImage" name="proImage" accept="image/*" value="${existingProduct.proImage}" required>
          
        </div>
          
         <div >
           
            <input type="submit" class="btn btn-success" value="Ubdate"/>
             <form method ="post" action="./UbdateProductServlet" enctype="multipart/form-data onsubmit="return validate form()">
             
             
             <!-- -Diplaythe currentbproduct image -->
             
             <div  class="form-group">
             
             <label class="font-italic font-weight-bold" for="proImage">Current Product Image:</label>
             <img id="Current Image"
             src="data:image/jpeg;base64,${Base64.getEncoder().encodeToString(existingProduct.proImage)}"
                    alt="Cureent Product Image" style="mid-width:100px;max-height:100px">
                      <input type="hidden"  id="existingImage" name="existingImage" value="${existingProduct.proImage}"/>
             </div>
             
             <!-- -Allow the user  to upload a new image -->
              <div  class="form-group">
             
             <label class="font-italic font-weight-bold" for="newproImage">New Product Image:</label>
             
                    
                      <input type="hidden"  id="newproImage" name="newproImage" accept="Image"/>
             </div>
             
             </form>
        </div>
           
   
  
   </form>
 </div>

</body>
</html>
</body>
</html>
         
       