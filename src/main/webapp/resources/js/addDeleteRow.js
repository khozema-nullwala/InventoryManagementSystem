var separator= "-";
var minYear=1900;
var maxYear=2500;

function stripCharsInBag(s, bag){
var i;
var returnString = "";
// Search through string's characters one by one.
// If character is not in bag, append to returnString.
for (i = 0; i < s.length; i++){ 
var c = s.charAt(i);
if (bag.indexOf(c) == -1) returnString += c;
}
return returnString;
}

function daysInFebruary (year){
return (((year % 4 == 0) && ( (!(year % 100 == 0)) || (year % 400 == 0))) ? 29 : 28 );
}
function DaysArray(n) {
for (var i = 1; i <= n; i++) {
this[i] = 31
if (i==4 || i==6 || i==9 || i==11) {this[i] = 30}
if (i==2) {this[i] = 29}
} 
return this
}

function isDate(dtStr){
var daysInMonth = DaysArray(12)
var pos1=dtStr.indexOf(separator)
var pos2=dtStr.indexOf(separator,pos1+1)
var strYear=dtStr.substring(0,pos1)
var strMonth=dtStr.substring(pos1+1,pos2)
var strDay=dtStr.substring(pos2+1)
strYr=strYear
if (strDay.charAt(0)=="0" && strDay.length>1) strDay=strDay.substring(1)
if (strMonth.charAt(0)=="0" && strMonth.length>1) strMonth=strMonth.substring(1)
for (var i = 1; i <= 3; i++) {
if (strYr.charAt(0)=="0" && strYr.length>1) strYr=strYr.substring(1)
}
month=parseInt(strMonth)
day=parseInt(strDay)
year=parseInt(strYr)
if (pos1==-1 || pos2==-1){
alert("The date format should be : YYYY-MM-DD")
return false
}
if (strMonth.length<1 || month<1 || month>12){
alert("Please enter a valid month")
return false
}
if (strDay.length<1 || day<1 || day>31 || (month==2 && day>daysInFebruary(year)) || day > daysInMonth[month]){
alert("Please enter a valid day")
return false
}
if (strYear.length != 4 || year==0 || year<minYear || year>maxYear){
alert("Please enter a valid 4 digit year between "+minYear+" and "+maxYear)
return false
}


return true
}
function getPurchaseDetails() {
                    document.forms["form1"].action="purchaseDetail.html";
                 document.forms["form1"].method="post";
                    document.forms["form1"].submit();
             }
             function displayPurchaseDetails() {                  
                    document.forms["form1"].action="getPaymentDetails.html";
                 document.forms["form1"].method="post";
                 document.forms["form1"].submit();
             }
             function callFun(){
                    
                    if(document.getElementById("purchaseId").value == ""){
                           document.getElementById("showHide").style.display = "none";
                           document.getElementById("btnShowHide").style.display = "none";
                    }else{
                           document.getElementById("showHide").style.display = "block";
                           document.getElementById("btnShowHide").style.display = "block";
                    }
                    
                    
             }
             function disableChequeNo(tableID){
                    var table = document.getElementById(tableID);
                    var rowCount = table.rows.length;      
                    var x = 0;
                    for (var i = 1; i < rowCount; i++) {
                           var row = table.rows[i];
                           x = (i-1)*10+2;     
                           if(row.children[7].firstElementChild.defaultValue == 'Y'){                                
                                 if(row.children[2].children[0].form[x].value != "Cheque"){
                                        row.children[3].childNodes[0].readOnly = 'true';                                      
                                 }else{
                                        row.children[3].firstElementChild.removeAttribute('readonly');                                     
                                 }
                           }                          
                    }                   
             }
             function addPaymentRow(tableID) {      
                    if(document.getElementById("vendorName").value == "" || document.getElementById("purchaseId").value == ""){
                           alert("Either Vendor Name or Purchase Id is not selected. Please select both to proceed further.");
                           return false;
                    }
                    var table = document.getElementById(tableID);
                    if(table != null){
                    var rowCount = table.rows.length;
                    
                    for (var i = 2; i < rowCount; i++) {
                           var row = table.rows[i];
                           if(row.children[1].firstElementChild.defaultValue != ''){
                                  row.children[2].children[0].setAttribute("disabled","true");
                           }else{
                                  row.children[2].children[1].setAttribute("disabled","true");
                           }
                           }      
                    }
                    
                    document.forms["form2"].action="addRow.html";
                 document.forms["form2"].method="post";
                 document.forms["form2"].submit();
             }      
             
             function save_row(tableID)
             {
                    var table = document.getElementById(tableID);
                    var rowCount = table.rows.length;
                    var count = 0;
                    var totalAmt = 0.0;
                    var balance = document.getElementById('bal').value;
                    var dt=document.getElementById('paidDate');
                    var x = 0;
                    for (var i = 1; i <rowCount; i++) {
                           if(i==(rowCount-1)){
                           var oldPaidAmt = 0;
                           var row = table.rows[i];
                           var chkbox = row.cells[0].childNodes[0];
                           if (null != chkbox && true == chkbox.checked) {
                                  if(row.children[7].firstElementChild.defaultValue != 'Y'){ 
                                        alert("The data in row " + i + " is already saved.");
                                        return false;
                                 }
                                 count = count + 1;
                                  if(row.children[1].firstElementChild.defaultValue != ''){
                                        oldPaidAmt = row.children[5].firstElementChild.defaultValue;
                                 }
                                 x = (i-1)*10+6;                         
                                 totalAmt = Number(totalAmt)+(Number(row.children[5].firstChild.form[x].value) - Number(oldPaidAmt));                                 
                           }
                           if (isDate(dt.value)==false){
                                 dt.focus()
                                 return false
                                 }
                           }
                           
                    }
                    
                    if(count<=0){
                           alert("Please select atleast one row to save the data.");
                           return;
                    }
                    
                    if(balance <= 0){
                           var val= confirm("You have already paid your balance. Do you want to record the overpaid amount?");
                           if (val == true) {
                                 callSave(tableID);
                        } else {
                           return;
                        }
                    }else if(Number(totalAmt) > Number(balance)){
                           var returnVal= confirm("You are paying amount greater than the balance amount. Do you want to proceed?");
                           if (returnVal == true) {
                                 callSave(tableID);
                        } else {
                           return;
                        }
                    }else{
                           callSave(tableID);
                    }
             }
             
             function callSave(tableID){
                    var table = document.getElementById(tableID);
                    var rowCount = table.rows.length;
                    var totalAmt = 0.0;
                    var balance = document.getElementById('bal').value;
                    for (var i = 1; i < rowCount; i++) {
                           var row = table.rows[i];
                           var chkbox = row.cells[0].childNodes[0];
                           if (null != chkbox && true == chkbox.checked) {                                        
                                  row.children[8].firstElementChild.defaultValue='Y';        
                                  if(row.children[1].firstElementChild.defaultValue != ''){  
                                        row.children[2].children[1].setAttribute("disabled","true");
                                 }else{
                                        row.children[2].children[1].setAttribute("disabled","true");
                                 }
                           }else{
                                  if(row.children[1].firstElementChild.defaultValue != ''){  
                                        if(row.children[2].children[1].getAttribute('disabled') != "true"){
                                               row.children[2].children[0].setAttribute("disabled","true");
                                        }
                                 }else{
                                        row.children[2].children[1].setAttribute("disabled","true");
                                 }
                           }                          
                    }
                    
                    document.forms["form2"].action="saveRow.html";
                 document.forms["form2"].method="post";
                 document.forms["form2"].submit();
                    
             }
             
             function deletePaymentRow(tableID) {   
                    var table = document.getElementById(tableID);
                    var rowCount = table.rows.length;
                    var count = 0;
                    for (var i = 1; i < rowCount; i++) {
                           var row = table.rows[i];
                           var chkbox = row.cells[0].childNodes[0];
                           if (null != chkbox && true == chkbox.checked) {
                                 count = count + 1;
                                  if(row.children[1].firstElementChild.defaultValue != ''){                                    
                                        alert("You can not delete already paid data.");
                                        return;
                                 } else{
                                        row.children[8].firstElementChild.defaultValue='Y';
                                 }
                                 
                           }else{
                                  if(row.children[1].firstElementChild.defaultValue != ''){
                                        row.children[2].children[0].setAttribute("disabled","true");
                                 }else{
                                        row.children[2].children[1].setAttribute("disabled","true");
                                 }
                           }            
                    }
                    
                    
                    if(count > 0){
                           document.forms["form2"].action="deletePaymentRow.html";
                        document.forms["form2"].method="post";
                        document.forms["form2"].submit();
                    }else{
                           alert("Please select atleast one row for deletion.");
                           return;
                    }
             }
             
             function editPaymentRow(tableID) {     
                    document.getElementById("msg").style.display = "none";
                    var table = document.getElementById(tableID);
                    var rowCount = table.rows.length;
                    var count = 0;
                    for (var i = 1; i < rowCount; i++) {
                           var row = table.rows[i];
                           var chkbox = row.cells[0].childNodes[0];
                           if (null != chkbox && true == chkbox.checked) {
                                 
                                 count = count + 1;  
                                 row.children[2].firstElementChild.setAttribute("style","display:inline-block;");
                                  row.children[2].children[1].setAttribute("style","display:none;");
                                  row.children[2].children[1].setAttribute("disabled","true");
                                  row.children[3].firstElementChild.removeAttribute('readonly');
                                  row.children[4].firstElementChild.removeAttribute('readonly');
                                  row.children[5].firstElementChild.removeAttribute('readonly');
                                  row.children[6].firstElementChild.removeAttribute('readonly');
                                  row.children[7].firstElementChild.defaultValue = 'Y';
                           }else{
                                  if(row.children[7].firstElementChild.defaultValue != 'Y'){ 
                                        row.children[2].children[0].setAttribute("disabled","true");
                                 }else{
                                        row.children[2].children[1].setAttribute("disabled","true");
                                 }
                           }                   
                    }      
                    if(count > 0){
                           document.getElementById("addbtn").disabled = true;
                           document.getElementById("deletebtn").disabled = true;
                           document.getElementById("edit_button").disabled = true;
                           for (var i = 1; i < rowCount; i++) {
                                 var row = table.rows[i];
                                 var chkbox = row.cells[0].childNodes[0];                                 
                                  row.children[0].firstElementChild.setAttribute("disabled","true");                                 
                           }
                    }else{
                           alert("Please select atleast one row to edit the data.");
                           return;
                    }
             }
             
