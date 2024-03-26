let massRatan=parseInt(prompt("enter the  Ratan mass..."));
let massAnu=parseInt(prompt ("enter the Anu mass...."));

let heightRatan=parseFloat(prompt("Enter the Ratan height.."));
let heightAnu=parseFloat(prompt("Enter the Anu  height.."))

let BMIRatan=massRatan/(heightRatan*heightRatan);
let BMIAnu=massAnu/(heightAnu*heightAnu);

console.log("BMI of Ratan...."+BMIRatan+" "+"BMI of Anu...."+BMIAnu+" ");


document.write("BMI of Ratan...."+BMIRatan+" "+"BMI of Anu...."+BMIAnu+" ");

if(BMIRatan>BMIAnu){
  console.log("Ratan has higher Bmi");
  document.write("Ratan has Higher Bmi");
  }
  
  else{
	   console.log("Anu has higher Bmi");
       document.write("Anu has Higher Bmi");
  }